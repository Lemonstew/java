package ch05.lecture.p01array;

public class C07Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 99;
        arr[1] = 88;
        arr[2] = 77;

        // 배열의 길이와 초기값을 한번에
        int[] brr;
        brr = new int[]{55, 44, 33, 22, 11};

        for (int j : brr) {
            System.out.println("brr[j] = " + j);
        }
    }
}
