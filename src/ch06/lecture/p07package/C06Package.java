package ch06.lecture.p07package;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.FilterInputStream;

import java.io.*; // 같은 패키지의 여러 클래스 한번에 import.

// 첫 번째 방법, 두 번째 방법 둘 다 사용 가능. 회사의 가이드라인에 따라 사용하기

import java.util.Scanner;

public class C06Package {
    public static void main(String[] args) throws FileNotFoundException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        FileInputStream f = new FileInputStream("");
        FileOutputStream o = new FileOutputStream("");
    }
}
