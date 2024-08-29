package ch07.lecture.p04cast;

public class C02Cast {
    public static void main(String[] args) {
        Parent2 p = new Child21();
        Child21 c = (Child21) p; // 문제없이 성공

//        Parent2 q = new Child22();
//        Child21 d = (Child21) q; // 강제형변환
        // 강제형변환은 프로그램이 종료될 수 있는 각오를 안고 써야 한다.

        System.out.println("프로그램을 종료합니다.");
    }
}

// @formatter : off
class Parent2 {
}

class Child21 extends Parent2 {
}

class Child22 extends Parent2 {
}

