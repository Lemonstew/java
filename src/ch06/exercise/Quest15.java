//package ch06.exercise;
//
//import java.util.Scanner;
//
//public class Quest15 {
//    public static void main(String[] args) {
//
//
//        Scanner scanner = new Scanner();
//        System.out.println("id> ");
//        System.out.println("password> ");
//
//
//        MemberService memberService = memberService.login("hong", "12345");
//        boolean result = memberService.login("hong", "12345");
//        if (result) {
//            System.out.println("로그인 되었습니다.");
//            memberService.logout("hong");
//        } else {
//            System.out.println("id 또는 password가 올바르지 않습니다.");
//        }
//    }
//}
//
//class MemberService {
//    public boolean login(String a, String b) {
//        if (a.equals("hong")) {
//            if (b.equals("12345")) {
//                return true;
//            }
//
//        }
//        System.out.println("id 또는 password가 올바르지 않습니다.");
//        return false;
//    }
//
//    public void logout(String a) {
//        System.out.println(STR."\{a}님이 로그하웃 하였습니다.");
//    }
//}
