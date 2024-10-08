package ch07.lecture.p04cast;

public class C04Instanceof {
    public static void main(String[] args) {
        // instanceof
        // 결과 : boolean
        // 왼쪽항 : 참조변수
        // 오른쪽항 : 타입(클래스, 인터페이스)
        // 왼쪽의 참조변수가 가리키는 인스턴스를 오른쪽 타입이면 true
        //                                            아니면 false

        A a = new A();
        System.out.println(a instanceof A); // true
        System.out.println(a instanceof B); // false
        System.out.println(a instanceof C); // false
        System.out.println(a instanceof D); // false
        System.out.println(a instanceof E); // false
        System.out.println(a instanceof F); // false

        System.out.println("B 객체");
        B b = new B();
        System.out.println(b instanceof A); // true
        System.out.println(b instanceof B); // true
//        System.out.println(b instanceof C); // x?
        System.out.println(b instanceof D); // false
        System.out.println(b instanceof E); // false
//        System.out.println(b instanceof F); // x

        System.out.println("F객체를 A타입 변수에");
        A z = new F();
        System.out.println(z instanceof A);
        System.out.println(z instanceof B);
        System.out.println(z instanceof C);
        System.out.println(z instanceof F);


    }
}

// @formatter:off

class A{}
class B extends A{}
class C extends A{}

class D extends B{}
class E extends B{}

class F extends C{}
