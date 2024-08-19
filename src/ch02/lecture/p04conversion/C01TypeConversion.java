package ch02.lecture.p04conversion;

public class C01TypeConversion {
    public static void main(String[] args) {
        // type conversion (형변환)

        // 자동 : 작은 공간의 값 -> 큰 공간
        // 강제 : 큰 공간의 값 -> 작은 공간

        // 자동
        // 정수형 사이
        int a = 30000;
        long b = a; // 자동형변환 OK!! 문제 없음!!
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        // 강제 : !!! 매우매우 주의해서 사용 !!!
        short c = (short) a; // 자동형변환 XXX, 강제형변환 OK
        System.out.println("c= " + c);
        int d = 21_0000_0000;
        short e = (short) d; // 강제형변환, 값을 잃을 수 있음
        System.out.println("e= " + e);

    }
}
