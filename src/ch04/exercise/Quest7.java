package ch04.exercise;

import java.util.Scanner;

public class Quest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean menu = true;

        long money = 0;

        String s = "int A";

        while (menu) {

            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");
            int Num = scanner.nextInt();

            if (Num == 1) {
                System.out.print("예금액> ");
                long a = scanner.nextInt();
                money = money + a;
            } else if (Num == 2) {
                System.out.print("출금액> ");
                long b = scanner.nextInt();
                money = money - b;
            } else if (Num == 3) {
                System.out.println("잔고> " + money + "원");
            } else if (Num == 4) {
                menu = false;
            }

        }
        System.out.println("프로그램 종료");
    }
}
