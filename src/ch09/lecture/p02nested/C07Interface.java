package ch09.lecture.p02nested;

public class C07Interface {
    interface Nested7 {
    }

    class MyClass7 {
        // nested interface (중첩된 인터페이스)
        // static 생략 가능
        static interface Nested7 {
        }

        void someMethod() {
            Nested7 o = new Nested7() {
            };
        }
    }
}

interface MyInterface7 {

}