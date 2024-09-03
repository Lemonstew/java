package ch16.lecture.p02method_reference;

public class C03InstanceMethod {
    public static void main(String[] args) {
        MyClass3 o = new MyClass3();
        MyInterface31 a = x -> o.action(x);
        MyInterface31 b = o::action;

    }
}

class MyClass3 {
    void action(int x) {
        System.out.println(x);
    }
//    void action
}

interface MyInterface32 {
    void some(String s, String t);
}

interface MyInterface31 {
    void method1(int x);
}