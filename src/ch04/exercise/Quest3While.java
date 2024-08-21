package ch04.exercise;

public class Quest3While {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            if ((i % 3) == 0) {
                sum = sum + i;
                i++;
            } else {
                i++;
            }
        }

        System.out.println("sum = " + sum);
    }
}
