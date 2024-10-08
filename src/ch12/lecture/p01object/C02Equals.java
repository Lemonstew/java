package ch12.lecture.p01object;

public class C02Equals {
    public static void main(String[] args) {
        // equals
        //    : 두 객체가 같으면 true, 다르면 false

        MyClass2 a = new MyClass2();
        MyClass2 b = new MyClass2();
        MyClass2 c = a;

        boolean r1 = c.equals(a);
        System.out.println("r1 = " + r1);

        boolean r2 = a.equals(c);
        System.out.println("r2 = " + r2);

        boolean r3 = b.equals(c);
        System.out.println("r3 = " + r3);

        boolean r4 = a.equals(b);
        System.out.println("r4 = " + r4);
    }
}

class MyClass2 {
}