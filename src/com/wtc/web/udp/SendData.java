package com.wtc.web.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendData {
    public static void main(String[] args) throws IOException {
        // 相当于快递公司
        DatagramSocket ds = new DatagramSocket();

        String str = "你好！";
        byte[] bytes = str.getBytes();

        InetAddress address = InetAddress.getByName("127.0.0.1");

        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        ds.send(dp);
        ds.close();
    }
}
