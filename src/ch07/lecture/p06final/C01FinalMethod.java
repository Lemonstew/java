package ch07.lecture.p06final;

public class C01FinalMethod {
}

class Fish1 {
    public void breathe() {
        System.out.println("아가미로 호흡함");
    }

    public void swim() {
        System.out.println("헤엄칩니다.");
    }
}

class Domi extends Fish1 {
    @Override
    public void swim() {
        System.out.println("천천히 헤엄칩니다.");
    }
}

class Tuna extends Fish1 {

}

class FishAndChips extends Fish1 {

}
