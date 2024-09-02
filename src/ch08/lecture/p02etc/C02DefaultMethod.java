package ch08.lecture.p02etc;

public class C02DefaultMethod {
    public static void main(String[] args) {
        MyInterface2 o = new MyClass21();
        o.method1();
        o.method2();

        MyInterface2 p = new MyClass22();
        p.method1();
        p.method2();
    }
}

interface MyInterface2 {
    void method1();

    // 인터페이스에서 코드블럭 (메소드 몸통, body) 이 있는 메소드 (public 생략 가능)
    default void method2() {
        System.out.println("MyInterface2.method2");
    }
    // 필요하면 default 메소드도 재정의 가능
}

class MyClass21 implements MyInterface2 {
    @Override
    public void method1() {
        System.out.println("MyClass21.method1");
    }
}

class MyClass22 implements MyInterface2 {
    @Override
    public void method1() {
        System.out.println("MyClass22.method1");
    }
}
