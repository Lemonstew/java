package ch17.lecture.p03intermediate;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05Boxed {
    public static void main(String[] args) {
        // Stream, IntStream, DoubleStream, LongStream

        // 참조타입 원소 Stream을 기본타입원소 Stream
        //  : matToInt, mapToDouble, mapToLong

        // 기본타입원소 Stream 을 참조타입원소 Stream
        //  : boxed, mapToObj

        int[] nums = {100, 1000, 10, 50, 500};
        Arrays.stream(nums)
                .boxed()
                .forEach(System.out::println);

        Arrays.stream(nums)
                .mapToObj(n -> n + "원")
                .forEach(System.out::println);
    }
}
