package ch07.lecture.p01inheritance;

public class C01Inheritance {
    public static void main(String[] args) {
        SubClass01 o = new SubClass01();
        o.age = 33;
        o.method1();

    }
}

// 상위클래스, 부모클래스, 슈퍼클래스
class SuperClass01 {
    int age;

    void method1() {
        System.out.println("MyClass01.method1");
    }
}

// 위 클래스를 그대로 상속받는 클래스 만들어보기

class SubClass01 extends SuperClass01 {
    // 하위클래스, 자식클래스, 서브클래스
    // 우리 눈엔 보이지 않으나,
    // age, method1 이 여기에 있음

}
