package ch06.lecture.p03method;

import java.io.PrintStream;

public class C10Return {
    public static void main(String[] args) {

    }
}

class MyClass10 {
    // return type (여기서는 void) : void 또는 데이터타입
    public void method1() {
    }

    public int method2() {
        return 5;
    }

    public String method3() {
        return "흥민";
    }

    public double method4() {
        return 3.14;
    }
//
//    public PrintStream method5() {
//        return new PrintStream("");
//    }

    public int[] method6() {
        return new int[]{3, 4};
    }
}
