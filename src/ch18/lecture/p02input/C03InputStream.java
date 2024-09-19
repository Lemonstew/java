package ch18.lecture.p02input;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class C03InputStream {
    public static void main(String[] args) {
        String name = "C:/Temp/output6.txt"; // 13 bytes
        // Input
        try (InputStream is = new FileInputStream(name)) {
            byte[] data = new byte[5]; // 길이가 5인 바이트 배열
            byte[] ronaldo = new byte[8];

            System.out.println(Arrays.toString(data)); // 0, 0, 0, 0, 0

            int r1 = is.read(data); // 5
            System.out.println(Arrays.toString(data));

            int r2 = is.read(data); // 5
            System.out.println(Arrays.toString(data));

            int r3 = is.read(data); // 3
            System.out.println(Arrays.toString(data));

            int r4 = is.read(data); // -1

            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
            System.out.println("r3 = " + r3);
            System.out.println("r4 = " + r4);

            is.read(ronaldo);
            System.out.println(Arrays.toString(ronaldo));

            is.read(ronaldo);
            System.out.println(Arrays.toString(ronaldo));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
