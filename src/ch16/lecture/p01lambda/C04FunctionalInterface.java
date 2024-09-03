package ch16.lecture.p01lambda;

public class C04FunctionalInterface {
}

@FunctionalInterface
interface MyInterface4 {
    void method1();
}

// x
interface MyInterface42 {

}

// x
interface Myinterface43 {
    void method2();

    void method3();
}

@FunctionalInterface
interface Myinterface44 {
    int MAX_VALUE = 100;

    void method1();

    default void method2() {
    }

    private void method3() {
    }

    static void method4() {
    }

    private static void method5() {
    }

}