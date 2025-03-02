package com.wtc.web.sendreceive;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket socket = new Socket("127.0.0.1", 10000);
        String str = "见到你很高兴！";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        // 需要有结束标记，否则会卡死
        socket.shutdownOutput();

        // 接收回写数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        while ((b = isr.read()) != -1) {
            System.out.print((char) b);
        }

        socket.close();
    }
}
