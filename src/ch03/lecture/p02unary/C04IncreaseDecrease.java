package ch03.lecture.p02unary;

public class C04IncreaseDecrease {
    public static void main(String[] args) {
        // 증가 연산자, 감소 연산자 모두에게, 즉 증감연산자에 해당하는 주의점

        int a = 10;
        a++;
        System.out.println("a = " + a); // 11

        int c = a++; // 사용 후 더함
        System.out.println("c = " + c); // 11이 됨
        System.out.println("a = " + a); // 12가 됨

        int d = ++a; // 더한 후 사용
        System.out.println("d = " + d); // 13이 됨
        System.out.println("a = " + a); // a는 13

        // 위 코드는 읽기 어려우니 사용하지 말 것
        int e = 11;
        int f = e;
        e++;
        System.out.println("f = " + f);
        System.out.println("e = " + e);

        e++;
        int g = e;
        System.out.println("g = " + g);
        System.out.println("e = " + e);

        // 코드는 공용이므로 서로 읽기 편하게 하는 것이 좋다
    }
}
