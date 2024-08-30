package ch07.lecture.p07protected.package2;

import ch07.lecture.p07protected.package1.A;

public class D extends A {
    // publicMethod
    // protectedMethod
    // packagePrivateMethod
    public void someMethod() {
        publicMethod();
        protectedMethod(); // 다른 패키지에 있으나 protected 는 상속받으면 사용 가능하므로 사용가능함
//        packagePrivateMethod(); // 다른 패키지에 있으므로 사용 불가
    }

}
