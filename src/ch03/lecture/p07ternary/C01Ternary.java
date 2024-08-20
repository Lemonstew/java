package ch03.lecture.p07ternary;

public class C01Ternary {
    public static void main(String[] args) {
        // 삼항연산자 (조건연산자)
        // a ? b : c
        // 연산결과는 a가 true 이면 b,
        // a가 false 이면 c

        // 이항연산자 a + b
        // 단항연산자 a--

        int a = true ? 5 : 3;
        System.out.println("a = " + a);

        int b = false ? 55 : 33;
        System.out.println("b = " + b);


    }
}
