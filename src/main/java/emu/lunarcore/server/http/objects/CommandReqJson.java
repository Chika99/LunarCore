package emu.lunarcore.server.http.objects;

import lombok.Data;

@Data
public class CommandReqJson {
    public String command;
    public String username;
    public String password;
    public String playerId;
}
