package ch09.lecture.p02nested;

public class C06Lambda {
    public static void main(String[] args) {
        int a = 5;
        MyInterface6 o = () -> {
            // local class 에서
            // 감싸고 있는 메소드의 지역변수 (파라미터)의 값을 변경할 수 없음
//            a=7;
            System.out.println("a = " + a);
        };
        // x
        // a = 8; -> 안됨
    }
}

@FunctionalInterface
interface MyInterface6 {
    void someAction();
}