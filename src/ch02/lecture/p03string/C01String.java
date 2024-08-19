package ch02.lecture.p03string;

public class C01String {
    public static void main(String[] args) {
        char a = '가';
        System.out.println("a= " + a);

        //char b - '가나'; // xx
        // String: 여러 문자들(문자열)을 저장하는 타입
        String c = "가나"; // 작은 따옴표가 아닌 큰 따옴표 사용
        System.out.println("c= " + c);


        //
        String d = "It's good"; //큰 따옴표 안에 작은 따옴표 사용 가능
        System.out.println("d= " + d);

        String e = "It is \"good\""; //String 내에서 큰 따옴표는 역슬래시와 함께 사용
        System.out.println("e= " + e);

        // 역슬래시는 역슬래시와 함께

        String f = "\\는 특수기호 사용시";
        System.out.println("f= " + f);

        // 역슬래시 사용 예시 (책52쪽)
        String g = "작은 따옴표 \'";
        System.out.println("g= " + g);
        String h = "다음줄 \n표현";
        System.out.println("h= " + h);
        String i = "탭 \t표현";
        System.out.println("i = " + i);
    }
}
