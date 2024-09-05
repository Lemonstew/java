package ch12.lecture.p04regex;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class C05Quantifier {
    public static void main(String[] args) {
        // {n} : n개
        String p1 = "[0-9]{3}";
        System.out.println(matches(p1, "010")); // true
        System.out.println(matches(p1, "999")); // true
        System.out.println(matches(p1, "abc")); // false
        System.out.println(matches(p1, "a99")); // false
        System.out.println(matches(p1, "3")); // false
        System.out.println(matches(p1, "22")); // false
        System.out.println(matches(p1, "2444")); // false
        System.out.println();

        // 예제 : 010-1234-1234

        String p2 = "\\d{3}-\\d{4}-\\d{4}";
        System.out.println(matches(p2, "010-9919-3303"));

        // {n, m} : n~m 개
        String p3 = "\\p{IsHangul}{3,4}";
        System.out.println(matches(p3, "손흥민")); // true
        System.out.println(matches(p3, "제갈공명")); // true
        System.out.println(matches(p3, "김훈")); // false
        System.out.println(matches(p3, "또라이새끼"));  // false

        // {n,} : n개 이상

        // ? : {0,1}
        // * : {0,}
        // + : {1,}
    }
}
