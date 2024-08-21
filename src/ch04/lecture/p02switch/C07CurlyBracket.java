package ch04.lecture.p02switch;

public class C07CurlyBracket {
    public static void main(String[] args) {
        // if, else if. else, case
        // 의 코드 블러기 한줄이면 중괄호 생략 가능

        if (true) {
            // 중괄호 생략 안됨
            System.out.println(1);
            System.out.println(2);
        }

        //중괄호 생략 가능
        if (true)
            System.out.println(3);

        if (true)
            System.out.println(4);
        else if (true)
            System.out.println(5);
        else
            System.out.println(6);

        //
        if (true)
            System.out.println(7);
        else if (true) {
            System.out.println(8);
            System.out.println(9);
        } else
            System.out.println(10);
    }
}
