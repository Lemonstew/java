package ch09.lecture.p02nested;

public class C05FinalLocalVariable {

}

class MyClass5 {
    void some() {
        // local class 에서 사용되는
        // local variable (지역 변수)는 final 이어야 함
        // final 키워드 붙이지 않으면
        // effectively final (final 처럼 동작한다)
        int a = 5;
        class Nested5 {
            void action() {
                System.out.println("Nested5.action");
            }
        }
        Nested5 o = new Nested5();
        o.action();

    }
}
