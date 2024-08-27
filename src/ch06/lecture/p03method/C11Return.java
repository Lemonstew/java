package ch06.lecture.p03method;

public class C11Return {

}

class MyClass11 {
    public void method1() {

    }

    // 메소드에 return 타입이 있는 경우
    public int method2() {
        System.out.println("아무 노래");
        boolean a = true;

        if (a) {
            return 3;
        } else {
            return 5;
        }

    }
}
