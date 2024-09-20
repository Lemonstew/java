package ch18.lecture.p02input;

import java.io.*;

public class C06Copy {
    public static void main(String[] args) {
        String origin = "C:/Temp/지구온난화.jpg";
        String target = "C:/Temp/지구온난화3.jpg";

        try {
            InputStream is = new FileInputStream(origin);
            OutputStream os = new FileOutputStream(target);

            try (is; os) {
                is.transferTo(os);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
