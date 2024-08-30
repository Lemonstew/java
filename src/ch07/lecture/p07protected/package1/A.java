package ch07.lecture.p07protected.package1;

public class A {
    // 어디에서든지 사용 가능
    public void publicMethod() {
        System.out.println("A.publicMethod");
    }

    // protected : 같은 패키지에 있으면 사용 가능
    //            + 다른 패키지에 있어도 상속했다면 사용가능
    protected void protectedMethod() {
        System.out.println("A.protectedMethod");
    }

    // 같은 패키지에 있어야 사용 가능
    void packagePrivateMethod() {
        System.out.println("A.packagePrivateMethod");
    }
}
