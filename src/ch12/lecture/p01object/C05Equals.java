//package ch12.lecture.p01object;
//
//import java.util.Objects;
//
//public class C05Equals {
//}
//
//class MyClass5 {
//    private String name;
//    private int age;
//    private String address;
//
//    @Override
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        MyClass5 myClass5 = (MyClass5) object;
//        return age == myClass5.age && Objects.equals(name, myClass5.name) && Objects.equals(address, myClass5.address);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, address);
//    }
//}
//}
