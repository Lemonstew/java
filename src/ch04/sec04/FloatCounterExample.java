package ch04.sec04;

public class FloatCounterExample {
    public static void main(String[] args) {
        float x = 0.1F;

        while (x <= 1.0F) {
            System.out.println(x);

            x += 0.1F;
        }

        for (float y = 0.1F; y <= 1.0F; y += 0.1F) {
            System.out.println(y);
        }
    }
}
