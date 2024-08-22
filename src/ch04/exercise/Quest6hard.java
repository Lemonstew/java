package ch04.exercise;

public class Quest6hard {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------");

        for (int a = 4; a >= 0; a--) {
            System.out.println(a);
        }
        System.out.println("-----------------------------------");

        for (int b = 1; b < 6; b++) {
            System.out.println(b);
        }
        System.out.println("-----------------------------------");

        for (int c = 5; c >= 1; c--) {
            System.out.println(c);
        }
        System.out.println("-----------------------------------");

        for (int d = 0; d < 5; d++) {
            for (int e = 0; e < (d + 1); e++) {
                System.out.print(e);
                if (d == e) {
                    System.out.println();
                }
            }
        }
        System.out.println("-----------------------------------");

        /*
        1
        12
        123
        1234
        12345
         */


        /*
         *****
         ****
         ***
         **
         *
         */

        /*
        0
        12
        345
        6789
        01234
         */

    }
}
