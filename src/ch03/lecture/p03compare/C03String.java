package ch03.lecture.p03compare;

public class C03String {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";

        // 크다 작다와 같은 연산을 사용할 수 없다.

//        System.out.println(a >= b);

        //같다 같지 않다는 할 수 있음
        System.out.println(a == b);

//        !!!!!!!!!하지만 사용하면 안됨!!!!!!!!!!

        String c = "html";
        String d = "ht";
        String e = "ml";
        String f = d + e;

        System.out.println("c = " + c);
        System.out.println("f = " + f);

        System.out.println(c == f);
        //자바에선 이 식이 안됨

        // 그렇기에 문자에 대해 같다 같지않다는 사용하지 않는다.

        System.out.println(c.equals(f));


    }
}
