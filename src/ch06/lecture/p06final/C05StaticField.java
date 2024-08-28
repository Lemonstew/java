package ch06.lecture.p06final;

public class C05StaticField {
    public static void main(String[] args) {
        System.out.println(MyClass05.NUMBER);

    }
}

class MyClass05 {
    // final static : 변하지 않는 값(상수)로 사용
    //     변수명 작성 관습 : UPPER_SNAKE_CASE
    final static int NUMBER = 5;
    final static double PI = 3.1415926535897932384626;
    final static int INTEGER_MAX_VALUE = 2147483647;
}
