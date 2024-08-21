package ch04.lecture.p04for;

public class C04Gugudan {
    public static void main(String[] args) {
        // 홀수단만 출력
        // 3, 5, 7, 9 단 만

        for (int i = 3; i <= 9; i = i + 2) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(STR."\{i} X \{j} = \{i * j}");
            }
        }
    }
}
