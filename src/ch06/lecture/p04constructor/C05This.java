package ch06.lecture.p04constructor;

public class C05This {
    public static void main(String[] args) {
        MyClass05 o = new MyClass05();
        MyClass05 p = new MyClass05();
        p.name = "lee";
        o.name = "son";
        p.printName();
        o.printName();
        System.out.println();
        p.printFullDecription();
        o.printFullDecription();
    }
    //
}

class MyClass05 {
    int score;
    String name;

    void printName() {
        System.out.println(name);
    }

    void printFullDecription() {

    }
}
