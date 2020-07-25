package com.serverstart;

import com.netty.TimeServer;

public class ServerTest {

    public static void main(String[] args) throws Exception{
        int port = 8080;
        if(args != null && args.length > 0){
            port = Integer.valueOf(args[0]);
        }
        new TimeServer().bind(port);
    }
}
