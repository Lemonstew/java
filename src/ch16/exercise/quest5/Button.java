package ch16.exercise.quest5;

public class Button {
    // 정적 멤버 인터페이스 (함수형 인터페이스)
    @FunctionalInterface
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

//    publi
}
