package ch05.lecture.p02reference;

public class C12MatrixCopy {
    public static void main(String[] args) {
        int[][] m1 = {{98, 76}, {54, 21}};

        int[][] m2 = new int[m1.length][];

        for (int i = 0; i < m1.length; i++) {
            m2[i] = m1[i];

        }

        m2[0][0] = 1010;

        System.out.println(m1[0][0]);


    }
}
