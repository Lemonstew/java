package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;

public class C04Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("172.30.1.84", 9999);
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        String name = "C:/Temp/부대찌개.jpg";
        FileInputStream fis = new FileInputStream(name);
        BufferedInputStream bis = new BufferedInputStream(fis);

        try (socket; os; bos; fis; bis) {
            byte[] data = new byte[1000];
            int length = 0;
            while ((length = bis.read(data)) != -1) {
                bos.write(data, 0, length);
            }
            bos.flush();
            System.out.println("보내기 완료");
        }
    }
}
