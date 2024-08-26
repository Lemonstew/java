package ch05.lecture.p04string;

public class C04IsEmpty {
    public static void main(String[] args) {
        // isEmpty : 길이가 0일 때만 true

        String a = "";
        String b = " ";
        String c = "a";
        String d = "abc";

        System.out.println(a.isEmpty());
        System.out.println(b.isEmpty());
        System.out.println(c.isEmpty());
        System.out.println(d.isEmpty());
    }
}
