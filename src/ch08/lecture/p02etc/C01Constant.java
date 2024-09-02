package ch08.lecture.p02etc;

public class C01Constant {
}

interface MyInterface1 {
    // public final static 필드 (상수, constant)
    // 인터페이스 앞에는 모두 public static final 이 생략되어 있다
    int age = 1;
    static String name = "son";
    final int a = 99;
    final static double pi = 3.141592;
    public final static String MY_ADDRESS = "Korea";

    // public static 메소드
    void method1();
}
