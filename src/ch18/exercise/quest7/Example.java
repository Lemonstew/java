package ch18.exercise.quest7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch18/lecture/p06buffer/C01Buffered.java";

        // ㄴ> 오픈된 파일 우클릭 > copy path > content root

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            String str = br.readLine();
            if (str == null) break;
            System.out.println("\t" + str);
            rowNumber++;
        }

        br.close();
        fr.close();
    }
}
