package com.clientstart;

import com.netty.TimeClient;
import com.netty.TimeServer;

public class ClientTest {

    public static void main(String[] args) throws Exception{
        int port = 8080;
        if(args != null && args.length > 0){
            port = Integer.valueOf(args[0]);
        }
        System.out.println(System.getProperty("line.separator"));
        new TimeClient().connect(port,"127.0.0.1");
    }
}
