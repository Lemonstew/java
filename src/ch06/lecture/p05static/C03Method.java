package ch06.lecture.p05static;

public class C03Method {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
        o1.method();

        MyClass03.method1();
    }
}

class MyClass03 {
    // 아래는 instance method
    void method() {
        System.out.println();
    }

    // 아래는 static method (class method, 정적 메소드)
    static void method1() {
        System.out.println("MyClass03.method1");
    }
}
