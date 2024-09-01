package emu.lunarcore.server.http.objects;

import lombok.Data;

@Data
public class CommandResJson {
    public String message;
    public int retcode;
}
