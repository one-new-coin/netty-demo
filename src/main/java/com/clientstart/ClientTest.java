package com.clientstart;

import com.netty.EchoClient;
import com.netty.TimeClient;

public class ClientTest {

    public static void main(String[] args) throws Exception{
        int port = 8080;
        if(args != null && args.length > 0){
            port = Integer.valueOf(args[0]);
        }
        System.out.println(System.getProperty("line.separator"));
        //new TimeClient().connect(port,"127.0.0.1");
        new EchoClient().connect(port,"127.0.0.1");
    }
}
