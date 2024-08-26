package ch05.lecture.p04string;

public class C10IndexOf {
    public static void main(String[] args) {
        // IndexOf : 특정 문자열이 있는 위치(index) 리턴
        String s = "java programming language";
        int n1 = s.indexOf("java");
        System.out.println("n1 = " + n1);

        int n2 = s.indexOf("pro");
        System.out.println("n2 = " + n2);

        int n3 = s.indexOf("a");
        System.out.println("n3 = " + n3);

        int n4 = s.indexOf("python"); // 존재하지 않는 경우 -1
        System.out.println("n4 = " + n4);

        int n5 = s.indexOf("java baegopa");
        System.out.println("n5 = " + n5);

        int n6 = s.indexOf("css");
        if (n6 == -1) {
            System.out.println("css는 없음");
        } else {
            System.out.println("css는 있음");
        }
    }
}
