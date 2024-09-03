package ch16.lecture.p02method_reference;

public class C02StaticMethod {
    public static void main(String[] args) {
        MyInterface2 a = x -> Math.round(x);
        MyInterface2 b = Math::round;
        // a 와 b 는 같은 것을 뜻한다

        MyInterface22 c = (x, y) -> Math.max(x, y);
        MyInterface22 d = Math::max;
        // c와 d는 같은 것을 뜻한다.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

interface MyInterface22 {
    int action(int a, int b);
}

interface MyInterface2 {
    long someAction(double x);
}
