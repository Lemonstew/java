package ch11.lecture.p05throw;

public class C01Throw {
//    public static void some4()

    public static void some3() {
        var e = new ArithmeticException();
        throw e;
    }

    public static void some2() {
        IndexOutOfBoundsException e = new IndexOutOfBoundsException();
        throw e;
    }

    public static void some1() {
        RuntimeException e = new RuntimeException();
        throw e;
    }

    public static void main(String[] args) {
        Integer.parseInt("");

        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
