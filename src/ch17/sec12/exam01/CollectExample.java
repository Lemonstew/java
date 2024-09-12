package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        // 남학생만 묶어 List생성
        /*
        List<Student> maleList = totalList.stream()
        .filter(s -> s.getSex().equals("남"))
        .collect(Collectors.toList());
         */

        
    }
}
