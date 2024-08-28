package ch06.lecture.p08access;

public class C01Access {
    public static void main(String[] args) {
        MyClass01 o = new MyClass01();
        o.method1();
//        o.method2();
    }
}

class MyClass01 {
    // 필드
    // 생성자
    // 메소드
    void method1() {
        method2();
        System.out.println("배고파");
    }

    private void method2() {
        System.out.println("어떤 일....");
    }
}
