package ch05.exercise;

import java.util.Scanner;

public class Quest10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int student = 0;
        double enterScore = 0;
        double scoreList = 0;
        double analysis = 0;

        while (true) {

            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            int a = scanner.nextInt();

            if (a == 1) {
                System.out.print("학생 수> ");
                int b = scanner.nextInt();
                student += b;
            } else if (a == 2) {
                System.out.print("점수 입력> ");
                double c = scanner.nextInt();
                enterScore += c;
            } else if (a == 3) {

            }
        }
    }
}
