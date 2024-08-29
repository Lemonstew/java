package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();
        int i = 3;
        //타입 변수 = 값

        // Tire 객체 장착
        myCar.tire = new Tire();
        // 변수.멤버(필드/메소드) = 값
        myCar.run();

        // HankookTire 객체 장착
        myCar.tire = new HankookTire();
        myCar.run();

        // KumhoTire 객체 장착
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
