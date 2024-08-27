package ch06.lecture.p03method;

import com.sun.jdi.connect.Connector;

public class C13Return {
    public static void main(String[] args) {
        MyClass13 a = new MyClass13();
        int i = a.makeDouble(9); // return 값으로 인해 18로 됨

        System.out.println(a.makeDouble(5) * 100);

        String s = a.makeTriple("son");
        System.out.println("s = " + s);
    }
}

class MyClass13 {
    public int makeDouble(int a) {
        int b = a * 2;
        return b;
    }

    public String makeTriple(String a) {
        return a + a + a;
    }
}
