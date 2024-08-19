package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력>");
        // nextLine : >부터 엔터가 쳐질 때 까지 스캔한다.
        String line1 = scanner.nextLine();

        System.out.println("line= " + line1);

        // next : 빈칸을 만날 때 까지 스캔한다.
        String t1 = scanner.next();
        String t2 = scanner.next();
        String t3 = scanner.next();

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
    }
}
