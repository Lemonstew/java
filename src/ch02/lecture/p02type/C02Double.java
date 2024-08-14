package ch02.lecture.p02type;

public class C02Double {
    public static void main(String[] args) {
        // 실수
        // float (4byte)
        // double (8byte)
//        int a = 3.14;  이런건 불가
        double b = 3.14;
        System.out.println(b);

        float c = 3.14F;
        //플로트 타입은 끝에 플로트타입이라고 대문자 F를 붙여줘야 함
        double d = 3000000;
        System.out.println(d);
        double e = 3e6; //3곱하기 10의 6승
        System.out.println(e);
        double f = 314e-2; //314 곱하기 10의 -2승
    }
}
