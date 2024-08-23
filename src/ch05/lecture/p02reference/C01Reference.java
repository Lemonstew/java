package ch05.lecture.p02reference;

public class C01Reference {
    public static void main(String[] args) {
        int a;
        int[] arr;

        a = 3;

        arr = new int[]{5, 6};

        System.out.println(a); // 3
        System.out.println(arr); //
        System.out.println(System.identityHashCode(arr)); // 참조값 확인 -> sout arr의 값은 16진법인데, 이를 10진법으로 바꾼 값

        int b;
        b = a;

        a = 30;

        System.out.println("a = " + a);
        System.out.println("b = " + b); // b 값을 a로 정의한 '이후', a값 조정한다 해도 b의 값은 조정되지 않는다.

        int[] brr;
        brr = arr;

        arr[0] = 50;
        brr[0] = 18;
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("brr[0] = " + brr[0]);
    }
}
