package ch08.lecture.p04sample;

public class SampleGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("총을 획득합니다.");
//        hero.setWeapon(new Gun());
//        hero.
    }
}

interface Weapon {
    void use();
}

class Gun implements Weapon {
    @Override
    public void use() {
        System.out.println("총을 쏩니다.");
    }
}

class Sword implements Weapon {
    @Override
    public void use() {
        System.out.println("칼을 휘두릅니다.");
    }
}

class Hero {
    private Weapon weaphon;

    public void setWeaphon(Weapon weaphon) {
        this.weaphon = weaphon;
    }

    public void attack() {
        weaphon.use();
    }
}