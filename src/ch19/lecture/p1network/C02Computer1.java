package ch19.lecture.p1network; // 여러 글자 보내기

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C02Computer1 {
    public static void main(String[] args) throws Exception {
        // server
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept(); // 기다림...

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        try (os; osw; bw; socket; serverSocket) {
            bw.write("바나나 차차");
            bw.flush();
        }
    }
}
