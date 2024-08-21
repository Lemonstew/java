package ch04.sec02;

import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수 기입 > ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("점수가 100~90입니다.");
            System.out.println("등급은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 89~80입니다.");
            System.out.println("등급은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 79~70입니다.");
            System.out.println("등급은 C 입니다.");
        } else if (score >= 60) {
            System.out.println("점수가 69~60입니다.");
            System.out.println("등급은 D 입니다.");
        } else {
            System.out.println("점수가 60 미만입니다.");
            System.out.println("등급은 F 입니다.");
            System.out.println("재수강을 해야 합니다.");
        }
    }
}
