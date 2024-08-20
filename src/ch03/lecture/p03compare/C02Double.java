package ch03.lecture.p03compare;

public class C02Double {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        double d = a + b;

        System.out.println(c == d); // false 왜냐하면 d는 근사치로 계산되기 때문
    }
}
