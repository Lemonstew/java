package ch11.lecture.p02try;

public class C06Finally {
    public static void main(String[] args) {
        try {
            System.out.println("실행코드");
            return;
        } finally {
            // catch 블록 없이도
            // return 이 되어도
            System.out.println("꼭 실행되어야 하는 코드");
        }
    }
}
