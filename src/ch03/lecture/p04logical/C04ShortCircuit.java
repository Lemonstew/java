package ch03.lecture.p04logical;

public class C04ShortCircuit {
    public static void main(String[] args) {
        // short-circuiting
        // 논리연산 (&&, ||) 시
        // 왼쪽 피연산자에 의해 결과가 예측될 시
        // 오른쪽 피연산자는 수행되지 않는다

        boolean a = false && false;

        int b = 5;
        int c = 5;
        boolean d = ((b++) < 0) && ((c++) < 0);

        // 이렇게 했을 때 이미 앞에서 false가 결정났기 때문에 굳이 더 처리하지를 않는다

        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
