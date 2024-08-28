package ch06.exercise;

public class Quest16 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");

    }
}

class Printer {
    void println(String a) {
    }

    void println(int a) {
    }

    void println(boolean a) {
    }

    void println(double a) {
    }
}
