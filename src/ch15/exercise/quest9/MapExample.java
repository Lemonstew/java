package ch15.exercise.quest9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String maxName = null; // 최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0; // 최고 점수를 저장하는 변수
        int totalScore = 0; // 점수 합계를 저장하는 변수

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            Integer score = entry.getValue();

            if (maxScore < score) {
                maxScore = score;
                maxName = name;
            }
        }

//        double avg = totalScore /
    }
}
