package ch12.lecture.p04regex;

import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class C06Exercise {
    public static void main(String[] args) {
        // 사용자 입력을 받아서
        // 전화번호 패턴과 같은 지 확인
        // 010-9999-1111
        // 02-2345-6789
        // 031-789-7890

        String a = "0\\d{1,2}-\\d{3,4}-\\d{4}";
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("전화번호 입력> ");
            String b = scanner.nextLine();
            if (matches(a, b)) {
                System.out.println("전화번호가 올바릅니다.");
            } else {
                System.out.println("전화번호가 올바르지 않습니다.");
            }
        }
    }
}
