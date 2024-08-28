package ch06.lecture.p09encapsulation;

public class C02GetterSetter {
}

// 관습상
// 필드 : private (필드는 되도록 노출시키지 말 것)
// 필드는 특별한 이유가 없다면 프라이빗

// 필드는 특별한 이유가 없다면 private 으로
// 필드값 변경(setter)/읽기(getter) 메소드를  public으로 작성

class MyClass02 {
    private int age;
    private String name;
    private String email;
    private String address;
    private boolean married;
    private boolean enable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

// boolean 의 getter 메소드는 is로 시작