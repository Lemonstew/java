package ch12.lecture.p01object;

import java.util.Objects;

public class C08Hashcode {
}

class MyClass8 {
    private String name;
    private String email;
    private int id;
    private int age;
    private String address;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyClass8 myClass8 = (MyClass8) object;
        return id == myClass8.id && age == myClass8.age && Objects.equals(name, myClass8.name) && Objects.equals(email, myClass8.email) && Objects.equals(address, myClass8.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, id, age, address);
    }
}
