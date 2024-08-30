package ch07.lecture.p07protected.package2;

import ch07.lecture.p07protected.package1.A;

public class C {
    public void someMethod() {
        A a = new A();
        a.publicMethod();
//        a.packagePrivateMethod(); // 다른 패키지에 있어서 안됨
//        a.protectedMethod(); // 상속받지 않은 친구가 다른 패키지에 있어서 안됨
    }
}
