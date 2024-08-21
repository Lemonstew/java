package ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        double sum = 0;
        double i;

        for (i = 1; i <= 2250; i++) {
            sum += i;
        }

        System.out.println("1~" + (i - 1) + " 합 : " + sum);
    }
}
