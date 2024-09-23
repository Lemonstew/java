package ch19.lecture.p2http;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter ps = new PrintWriter(bw);

        // 응답 (server -> client)
        try (ps; bw; osw; os) {
            // 첫번째 줄 : 응탑 상태 줄 (버전 상태코드 상태텍스트)
            ps.println("HTTP/1.1 200 OK");

            // 두번째 줄 부터 header (부가정보)
            ps.println("Content-Type : text/html; charset = utf-8");
//            ps.println("Content-length : " + length);

            // 빈줄
            ps.println();

            // 응답본문
            ps.println("""
                    <http>
                        <body>
                            <h1>안녕 브라우저</h1>
                            <p>첫번째 만든 서버 프로그램이야</p>
                            <p></p>
                    
                    
                    
                    
                    """);
        }

        try (br; isr; is) {
            // 첫번째 줄 : method 경로 버전
            String line1 = br.readLine();
            System.out.println(line1);

            // 두 번째 줄 부터 : header
            String line2 = null;
            while (!(line2 = br.readLine()).equals("")) {
                System.out.println(line2);
            }

            // 빈 줄 이후 : 요청 본문 (request body)

        }
    }
}
