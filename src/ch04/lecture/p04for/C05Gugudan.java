package ch04.lecture.p04for;

public class C05Gugudan {
    public static void main(String[] args) {
        // 9~2단 순으로 출력 (내림차순)
        // 각 단 안에선 오름차순으로 출력

        for (int i = 9; i >= 2; i--) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "단 " + STR."\{i} X \{j} = \{i * j}");
            }
        }
    }
}
