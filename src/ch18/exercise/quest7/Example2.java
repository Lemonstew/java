package ch18.exercise.quest7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example2 {
    public static void main(String[] args) {
        String path = "src/ch18/lecture/p06buffer/C03Flush.java";
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            try (fr; br) {
                br.lines()
                        .map(s -> s.formatted())
                        .forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
