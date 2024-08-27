package ch06.lecture.p04constructor;

public class C08ThisConstructor {
}

class MyClass08 {
    int age;
    int id;
    String name;
    String address;

    public MyClass08(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public MyClass08(int age, int id, String name, String address) {
//        this.age = age;
//        this.id = id;
//        this.name = name;
        this(age, id, name); // 이미 생성자 호출 코드가 있는 경우 위와 같이 호출할 친구들을 괄호에 넣기 가능
        this.address = address;
    }
}
