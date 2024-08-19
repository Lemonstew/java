package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C04Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("실수 1 > ");
        String num1 = scanner.nextLine();

        // 여기서 nextLine은 '>'부터 엔터를 만날 때까지 스캔한다.

        System.out.print("실수 2 >");
        String num2 = scanner.nextLine();

//        double n1 = Integer.parseInt(num1);
//        double n2 = Integer.parseInt(num2);  ---> 수를 double (실수)로 할 경우 Integer.parseInt가 아닌 Double.parseDouble로 해야함

        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);

        System.out.println("더한 값 = " + (n1 + n2));


    }
}
