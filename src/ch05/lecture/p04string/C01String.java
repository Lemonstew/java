package ch05.lecture.p04string;

public class C01String {
    public static void main(String[] args) {
        String a = new String("java"); // String a = new String("java");
        String b = "java";
        String c = new String("java");
        String d = "java";
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == d);
    }
}
