package ch03.lecture.p06assignment;

public class C02Assignment {
    public static void main(String[] args) {
        // = : 오른쪽 값 왼쪽 변수에 대입
        // += : (왼쪽 값과 오른쪽 값을 더해서) 왼쪽 변수에 대입
        // -= : (왼쪽 값에서 오른쪽 값을 빼서) 왼쪽 변수에 대입
        // *= : (왼쪽 값과 오른쪽 값을 곱해서) 왼쪽 변수에 대입
        // /= : (왼쪽 값을 오른쪽 값으로 나눠서) 왼쪽 변수에 대입
        // %= : (왼쪽 값에서 오른쪽 값을 나눈 나머지를) 왼쪽 변수에 대입

        int a = 10;
        int b = 3;

        a += b; // a = a + b 식과 동일

        System.out.println("a = " + a);

        int c = 10;
        int d = 3;

        c -= d; // c = c - d 식과 동일

        System.out.println("c = " + c);

        int e = 10;
        int f = 3;

        e *= f; // e = e * f 식과 동일

        System.out.println("e = " + e);

        int g = 10;
        int h = 3;

        g /= h; // g = g / h 식과 동일

        System.out.println("g = " + g);

        int i = 10;
        int j = 3;

        i %= j; // i = i % j 식과 동일

        System.out.println("i = " + i);
    }
}
