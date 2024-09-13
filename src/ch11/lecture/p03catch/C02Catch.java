package ch11.lecture.p03catch;

public class C02Catch {
    public static void main(String[] args) {
        try {
            // ...
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            // ...
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        // 공통된 상위타입으로 잡아서 묶어도 됨
        // ex)

        try {
            //...
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
