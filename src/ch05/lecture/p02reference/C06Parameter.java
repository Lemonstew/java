package ch05.lecture.p02reference;

public class C06Parameter {
    public static void main(String[] args) {

        int[] arr = {4, 5};
        method1(arr);


    }

    public static void method1(int[] a) {
        System.out.println(a[0]);
        a[0] = 44;
        System.out.println(a[0]);
    }
}
