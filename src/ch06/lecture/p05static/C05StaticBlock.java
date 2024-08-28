package ch06.lecture.p05static;

public class C05StaticBlock {
}

class MyClass05 {
    static int number10 = 10;
    static int number;

    static {
        // static field 초기화 하는 코드 작성 (이런 일 거의 없음)
        boolean a = true;
        if (a) {
            number = 10;
        } else {
            number = 100;
        }
    }

    int age;

    MyClass05() {
        // 인스턴스 필드 초기화
        age = 5;
    }
}
