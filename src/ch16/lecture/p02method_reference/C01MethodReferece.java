package ch16.lecture.p02method_reference;

public class C01MethodReferece {
    public static void main(String[] args) {
        MyInterface1 o = (a, b) -> System.out.println(a + " & " + b);
        o.method1(1, 2);

        // 다른 메소드 호출은 같은 파라미터 순서로 할 때
        // 메소드 참조 사용 가능 ( Alt + Enter 눌러 사용 )

        // 메소드 참조
        // 1. static 메소드
        //    타입명::메소드명
        // 2. instance 메소드
        //    객체명(정확히는 참조변수 명)::메소드명
        // 3. 특정 타입의 인스턴스 메소드
        //    타입명::메소드명
        // 4. 생성자 호출
        //    타입명::new

        MyInterface1 p = C01MethodReferece::someAction;
        p.method1(100, 1024);
    }

    public static void someAction(int param, int argu) {
        System.out.println((param * 2) + (argu * argu));
    }
}

@FunctionalInterface
interface MyInterface1 {
    void method1(int a, int b);
}
