package ch12.lecture.p04regex;

import java.util.regex.*;

import static java.util.regex.Pattern.matches;

public class C01RegularExpression {
    public static void main(String[] args) {
        // regular expression ( 정규 표현식 )
        // 문자열의 패턴을 나타내는 코드

        // 관련 클래스 : java.util.regex.Pattern
        // matches : 패턴과 일치하는지 확인하는 메소드

        // 문자 하나

        String pattern1 = "a";
        String s1 = "a";
        System.out.println(matches(pattern1, s1)); // true
        System.out.println(matches(pattern1, "aa")); // false
        System.out.println(matches("aa", "aa")); // true
        System.out.println(matches("aa", "bb")); // false
        System.out.println();

        // 문자 묶음
        String p2 = "[abc]";
        System.out.println(matches(p2, "a")); // true
        System.out.println(matches(p2, "b")); // true
        System.out.println(matches(p2, "c")); // true
        System.out.println(matches(p2, "abc")); // false
        System.out.println();

        String p3 = "[abc][abc][abc]";
        System.out.println(matches(p3, "abc")); // true
        System.out.println(matches(p3, "bbb")); // true
        System.out.println(matches(p3, "bca")); // true
        System.out.println(matches(p3, "a")); // false
        System.out.println(matches(p3, "ab")); // false
        System.out.println(matches(p3, "")); // false
        System.out.println();

        String p4 = "[abcdefghijklmnopqrstuvwxyz][abcdefghijklmnopqrstuvwxyz][zyxwvutsrqponmlkjihgfedcba]";
        System.out.println(matches(p4, "adc")); // true
        System.out.println(matches(p4, "koo")); // true
        System.out.println(matches(p4, "oo")); // false
        System.out.println();

        String p5 = "[a-z]";
        System.out.println(matches(p5, "a")); // true
        System.out.println(matches(p5, "q")); // true
        System.out.println();


        String p6 = "[a-z][0-9][0-9]";
        System.out.println(matches(p6, "a01")); // true
        System.out.println(matches(p6, "k50")); // true
        System.out.println();

        String p7 = "[a-z0-9][0-9][0-9]";
        System.out.println(matches(p7, "070")); //true
        System.out.println(matches(p7, "07a")); //false
        System.out.println();

        // 문자 제외
        String p8 = "[^0-9][0-9]";
        System.out.println(matches(p8, "99")); // false
        System.out.println(matches(p8, "a9")); // true
        System.out.println(matches(p8, "*9")); // true


    }
}
