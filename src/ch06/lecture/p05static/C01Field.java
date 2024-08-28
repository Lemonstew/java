package ch06.lecture.p05static;

import org.w3c.dom.ls.LSOutput;

public class C01Field {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        MyClass01 o2 = new MyClass01();
        o1.age = 30;
        o1.age = 40;
        System.out.println(o1.age);
        System.out.println(o2.age);

        MyClass01.number = 10;
        System.out.println(MyClass01.number);
    }

}

class MyClass01 {
    int age; // 이것은 instance field //

    // static field (class field, 정적 필드)
    static int number;
}
