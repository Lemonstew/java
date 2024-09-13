package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수: " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        printLength("The lost ruins of Arnak"); // null 에서 중단되었기에, 이 코드는 실행되지 않음.
        System.out.println("[프로그램 종료]");
    }
}
