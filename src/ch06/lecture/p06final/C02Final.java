package ch06.lecture.p06final;

public class C02Final {
    public static void main(String[] args) {
        method1(90);
        method2(70);
        method2(66);
    }

    static void method1(int a) {
        System.out.println(a);
        a = 70;
        System.out.println(a);
    }

    static void method2(final int a) {
        System.out.println(a);
//        a = 99; // 불가
    }
}
