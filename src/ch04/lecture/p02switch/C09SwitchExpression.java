package ch04.lecture.p02switch;

public class C09SwitchExpression {
    public static void main(String[] args) {
        // switch expression

        // switch expression 사용 전
        String message = "";

        char grade = (char) ((int) (Math.random() * 3) + 65);

        switch (grade) {
            case 'A' -> {
                message = "우수한 등급";
            }
            case 'B' -> {
                message = "보통";
            }
            case 'C' -> {
                message = "덜떨어짐";
            }
        }

        System.out.println(message);
    }
}
