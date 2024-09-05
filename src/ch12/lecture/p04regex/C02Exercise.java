package ch12.lecture.p04regex;

import java.util.Scanner;
import java.util.regex.*;

import static java.util.regex.Pattern.matches;

public class C02Exercise {
    public static void main(String[] args) {
        // 사용자 입력을 받아서
        // 6개의 숫자로 이루어진 문자열인지 확인하는 코드

        String a = "[0-9][0-9][0-9][0-9][0-9][0-9]";
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력> ");
        String b = scanner.nextLine();
        if (matches(a, b)) {
            System.out.println("일치합니다.");
        } else {
            System.out.println("불일치합니다.");
        }

    }
}
