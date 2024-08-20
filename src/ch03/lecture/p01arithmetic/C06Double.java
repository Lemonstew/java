package ch03.lecture.p01arithmetic;

public class C06Double {
    public static void main(String[] args) {
        // Infinity : 양의 무한대
        // -Infinity : 음의 무한대

        // 정수 연산 시 0으로 나눌 수 없음
//        System.out.println(3 / 0); // 오류가 발생함
        System.out.println(3 / (0.1 - 0.1)); // Infinity

        // 실수 연산 시 0으로 나누면 Infinity
        System.out.println(3.0 / 0);
        System.out.println(-3.0 / 0);

        double a = 3.0 / 0; //Infinity
        System.out.println("a = " + a);
        a = a + 100000000000000000L;
        System.out.println("a = " + a);

        // NaN (Not a Number)

        System.out.println(3.0 % 0); // NaN, NaN에는 어떤 연산을 해도 변함이 없다!

        //Infinity 인지 확인
        System.out.println(Double.isInfinite(a));
        System.out.println(Double.isInfinite(3.0));

        //NaN 인지 확인
        System.out.println(Double.isNaN(3.0));

        // Finity 인지 확인
        System.out.println(Double.isFinite(3.0));

        // 확인하는 것에 대한 답은 true 또는 false 로 결정됨

        // -0.0
        double c = 0.0;
        double d = -0.0;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println(3 / c); // Infinity
        System.out.println(3 / d); // -Infinity
    }
}
