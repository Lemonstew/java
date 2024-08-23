package ch05.lecture.p02reference;

public class C05Parameter {
    public static void main(String[] args) {
        int b = 5;
        method1(b);
    }

    public static void method1(int a) {
        System.out.println(a);
    }

    /*
    def method1(a): // a는 parameter(인자, 매개변수), argument(인수, 인자)
        print(a)
     */
}
