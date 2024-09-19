package ch18.lecture.p01io;

import java.io.*;

public class C01OutputStream {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Temp\\output1.txt";

        // 출력 스트림
        OutputStream os = new FileOutputStream(fileName);

        os.write(200); // 1byte
        os.write(100); // 1byte

        System.out.println("종료...");
    }
}
