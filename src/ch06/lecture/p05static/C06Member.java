package ch06.lecture.p05static;

public class C06Member {
}

// member : field, method, (생성자)

// static member 에서 instance member 에 접근 불가능
// instance member 에서 static member 에 접근 가능

class MyClass06 {
    static int number;
    int age;

    static void method1() {
        System.out.println(number); // ok
//        System.out.println(age); // not ok
    }

    void method2() {
        System.out.println(number);
        System.out.println(age);
    }
}