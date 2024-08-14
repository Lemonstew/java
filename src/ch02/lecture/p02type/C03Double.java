package ch02.lecture.p02type;

public class C03Double {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;

        System.out.println("c: " + c);

        //이렇게 했을 때 답이 0.3000000000000004가 나오는 것은 컴퓨터의 문제
//        BigDecimal d = new BigDecimal("0.1");
//        BigDecimal e = new BigDecimal("0.2");
//        BigDecimal f = d.add(e);
//        System.out.println("f: "+f);
    }
}
