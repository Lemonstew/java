package ch02.lecture.p03string;

public class C03Print {
    public static void main(String[] args) {
        System.out.printf("형식 문자열 %s%n", "이름등등");
        System.out.printf("형식 문자열 여러 개 %s, %s%n", "첫번째", "두 번째");

        System.out.printf("형식 %25s%10s", "abc", "def");
        // printf에서 %00s를 사용할 경우 00에 들어가는 숫자 만큼의 공백이 생긴다.
        // -10과 같이 음수를 활용할 경우 자신의 문자열에서 오른쪽에 해당 수만큼의 공백이 생긴다.

        // %d: 정수 (byte, short, int, long) 출력
        System.out.printf("정수%d, %d%n", 345, 678);
        // %f: 실수 (float, double) 출력
        System.out.printf("실수%10f, %10f%n", 3.14, 9.1234);
        System.out.printf("실수%-10f, %-10f%n", 3.14, 9.1234);
        System.out.printf("실수%010f, %010f%n", 3.14, 9.1234);
        System.out.printf("실수%010.1f, %010.3f%n", 3.14, 9.1234);

        double area = 3.14159265358979 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이: %10.10f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

        String d = "3";

        // 다른 타입과 + (연결) 연산 시 결과는 String
        String j = "3" + 5; //35
        String k = 5 + "3"; //35
        String l = 5 + 3 + "0"; // 80
        String m = 5 + 3 + "0" + 12; //8012
        System.out.println(m);

        // p.66
    }
}
