package ch12.lecture.p01object;

public class C11ToString {
}

class MyClass11 {
    private String name;
    private String email;
    private String address;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyClass11{");
        sb.append("name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
