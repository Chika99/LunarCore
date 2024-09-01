package emu.lunarcore.server.http.handlers;

import emu.lunarcore.LunarCore;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.http.objects.CommandReqJson;
import emu.lunarcore.server.http.objects.CommandResJson;
import emu.lunarcore.util.JsonUtils;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class CommandHandler implements Handler {

    // 随机生成复杂的用户名
    private static final String username = "A1b2C3d4E5f6";

    // 随机生成复杂的密码
    private static final String password = "G7h8I9j0K1l2";

    public CommandHandler() {

    }
    
    // post请求
    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        // 鉴权，写死用户名和密码
        CommandReqJson req = JsonUtils.decode(ctx.body(), CommandReqJson.class);
        if (req == null) {
            return;
        }

        if (!CommandHandler.username.equals(req.getUsername()) || !CommandHandler.password.equals(req.getPassword())) {
            LunarCore.getLogger().info("Invalid username or password.");
            CommandResJson res = new CommandResJson();
            res.setMessage("Invalid username or password.");
            res.setRetcode(-1);
            ctx.result(JsonUtils.encode(res));
            return;
        }

        String input = req.getCommand();
        // check null
        if (input == null) {
            LunarCore.getLogger().info("Command is null.");
            CommandResJson res = new CommandResJson();
            res.setMessage("Command is null.");
            res.setRetcode(-1);
            ctx.result(JsonUtils.encode(res));
            return;
        }
        Player onlinePlayer = LunarCore.getGameServer().getOnlinePlayerByUid(Integer.parseInt(req.getPlayerId()));
        if (onlinePlayer == null) {
            LunarCore.getLogger().info("Player {} is not online or does not exist.", req.getPlayerId());
            CommandResJson res = new CommandResJson();
            res.setMessage("Player is not online or does not exist.");
            res.setRetcode(-1);
            ctx.result(JsonUtils.encode(res));
            return;
        }
        LunarCore.getLogger().info("Player {}[ip:{}], execute command:[{}]", onlinePlayer.getUid(), ctx.ip(), input);
        try {
            LunarCore.getCommandManager().invoke(onlinePlayer, input);
            CommandResJson res = new CommandResJson();
            res.setMessage("OK");
            res.setRetcode(0);
            ctx.result(JsonUtils.encode(res));
        } catch (Exception e) {
            LunarCore.getLogger().error("Error executing command: {}", e.getMessage());
            CommandResJson res = new CommandResJson();
            res.setMessage("Error executing command.");
            res.setRetcode(-1);
            ctx.result(JsonUtils.encode(res));
        }
    }
}
