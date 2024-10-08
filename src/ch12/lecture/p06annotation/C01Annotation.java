package ch12.lecture.p06annotation;

import java.lang.annotation.Annotation;

public class C01Annotation {
    public static void main(String[] args) {
        // annotation : 컴파일러, 프레임워크 등에 부가정보를 알려주는 주석

        Class c = MyClass1.class;
        Annotation[] annotations = c.getDeclaredAnnotations();
        System.out.println(annotations.length);

        for (Annotation annotation : annotations) {
            Class b = annotation.annotationType();
            if (b.equals(MyAnnotation1.class)) {
                System.out.println("이 어노테이션이 있다면 특정 업무를 할 것");
            }
        }
    }
}

@MyAnnotation1 // 부가정보
class MyClass1 {

}

// annotation 정의
@interface MyAnnotation1 {

}
