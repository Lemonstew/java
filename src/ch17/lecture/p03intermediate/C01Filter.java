package ch17.lecture.p03intermediate;

import java.util.List;

public class C01Filter {
    public static void main(String[] args) {
        // filter :
        List<Integer> list = List.of(100, 200, 10, 20, 30, 300, 40);

        long count = list.stream() // 스트림 만들기
                .filter(e -> e >= 100 && e <= 999) // 중간연산
                .count(); // 최종연산

        System.out.println("count = " + count);

        long count1 = list.stream()
                .filter(e -> e >= 10 && e < 100)
                .count();

        System.out.println("count1 = " + count1);
    }
}
