package ch05.lecture.p04string;

public class C11Contains {
    public static void main(String[] args) {
        // contains : 특정 문자열이 있으면 true

        String s = "java programming language";
        boolean a = s.contains("java");
        boolean b = s.contains("pro");
        boolean c = s.contains("a");
        boolean d = s.contains("python");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
