package ch06.lecture.p03method;

public class C12Return {
    public static void main(String[] args) {
        MyClass12 a = new MyClass12();
        a.method1();
    }
}

class MyClass12 {
    public int method1() {
        return 3; // 이 리턴은 위의 a.method1으로 반환됨. 고로 위의 a.method1의 값은 3으로 됨
    }
}
