package ch19.lecture.p1network; // 한글자 보내기

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Computer {
    public static void main(String[] args) throws Exception {
        // server
        ServerSocket serverSocket = new ServerSocket(9999);

        // Socket
        Socket socket = serverSocket.accept(); // client 의 연락을 기다림

        OutputStream os = socket.getOutputStream();

        try (os; serverSocket; socket) {
            os.write('ㅎ');
            os.flush();
        }

    }
}
