package ch18.lecture.p01io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03OutputStream {
    public static void main(String[] args) throws IOException, InterruptedException {
        String name = "C:/Temp/output3.txt";
        OutputStream os = new FileOutputStream(name);

        os.write(33);

        Thread.sleep(10000);

        // 생성된 스트림을 사용 완료 후 꼭 닫아야 함
        os.close();
    }
}
