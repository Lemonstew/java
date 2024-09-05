package ch12.lecture.p02wrapper;

public class C06Wrapper {
    public static void main(String[] args) {
        // int 의 가장 큰 값
        System.out.println(Integer.MAX_VALUE);
        // int 의 가장 작은 값
        System.out.println(Integer.MIN_VALUE);

        // NaN, Infinity 확인
        double a = 5.0 / 0.0; // Infinity
        System.out.println(Double.isInfinite(a));

        double b = 5.0 % 0.0; // NaN
        System.out.println(Double.isNaN(b));

        // compare : 비교 메소드
        // 리턴값 : 같으면 0, 작으면 음수, 크면 양수
        Integer c = 5000;
        Integer d = 7000;
        System.out.println(c <= d);
        System.out.println(c.compareTo(d));
    }
}
