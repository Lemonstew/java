package ch05.lecture.p01array;

public class C03Array {
    public static void main(String[] args) {
        int[] a;
        double[] b;
        char[] c;
        String[] d;

        a = new int[3];
        b = new double[2];
        c = new char[4];
        d = new String[8];

        a[2] = 100; // 마지막 저장공간의 번호 = (길이 - 1) 왜냐하면 0부터 시작하기에
        b[1] = 3.14;
        c[3] = '한';
        d[2] = "java";

        System.out.println("a[2] = " + a[2]);
        System.out.println("b[1] = " + b[1]);
        System.out.println("c[3] = " + c[3]);
        System.out.println("d[2] = " + d[2]);
    }
}
