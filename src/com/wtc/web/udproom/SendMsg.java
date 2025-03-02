package com.wtc.web.udproom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.Scanner;

public class SendMsg {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in, Charset.forName("UTF-8"));
        while (true) {
            System.out.println("输入要说的话：");
            String str = sc.nextLine();
            if ("886".equals(str)) {
                break;
            }
            byte[] bytes = str.getBytes();

            InetAddress address = InetAddress.getByName("127.0.0.1");

            int port = 10086;

            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

            ds.send(dp);
        }

        sc.close();
        ds.close();
    }
}
