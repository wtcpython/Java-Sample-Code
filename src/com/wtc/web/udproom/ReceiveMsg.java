package com.wtc.web.udproom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMsg {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            ds.receive(dp);

            byte[] data = dp.getData();
            int len = dp.getLength();
            InetAddress address = dp.getAddress();
            String name = address.getHostAddress();

            System.out
                    .println(address.getHostAddress() + ":" + name + "发送数据：" + new String(data, 0, len));
        }

        // ds.close();
    }
}
