package ch02.lecture.p03string;

public class C05Parsing {
    public static void main(String[] args) {
        String a = "33";

        // 문자열을 int로 변환(파싱)
        int a1 = Integer.parseInt(a);

        int b = 2 * a1; // 66

        System.out.println("b= " + b);

        String c = "3.14";

//        double d = 5 + c; // 이렇게 했을 경우 53.14가 나옴. 8.14가 나오게 하려면 아래와 같이 하면 됨

//        System.out.println(d);

        double c1 = Double.parseDouble(c);

        double e = 5 + c1; //8.14
        System.out.println(e);

    }
}
