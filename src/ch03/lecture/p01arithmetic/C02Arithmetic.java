package ch03.lecture.p01arithmetic;

public class C02Arithmetic {
    public static void main(String[] args) {
        // 연산결과의 타입은 피연산자 중 큰 타입으로 결정

        int a = 3;
        long b = 5L;

        int c = (int) (a + b); //(int)를 안붙이고, 즉 강제형변환이 이루어지지 않으면 오류가 난다

        System.out.println(c);

        long d = a + b;

        System.out.println(d);

        long e = 7L;
        double f = 3.14;

        long g = (long) (e + f);
        System.out.println(g);

        double h = e + f;
        System.out.println(h);

        long t = 8L;
        double r = 9.3;
        long w = (long) (t * r);
        System.out.println(w);
        // 정수로 표기될 때도 우선적으로 곱을 한 다음 소숫점 밑의 자리를 제거하는구나!


        // 나누기 : 정수 끼리의 연산 결과는 정수
        // 나누기 : 실수 끼리의 연산 결과는 실수
        // 나누기 : 정수와 실수 끼리의 연산 결과는 실수
    }
}
