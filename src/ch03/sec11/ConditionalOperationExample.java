package ch03.sec11;

import java.util.Scanner;

public class ConditionalOperationExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수 입력 > ");
        int score = scanner.nextInt();

        char grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : ((score >= 70) ? 'C' : ((score >= 60) ? 'D' : 'F')));
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
