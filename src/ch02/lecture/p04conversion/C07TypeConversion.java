package ch02.lecture.p04conversion;

// p. 57

public class C07TypeConversion {
    public static void main(String[] args) {
        //강제형변환(casting)은 기본타입간, 또는 참조타입간에만 가능
        long a = 3;
        int b = (int) a; // 기본타입끼리의 캐스팅 가능

        //
//        String c = (String) a; //
        String d = "3";
//        int e = (int) d; //기본타입과 참조타입 간의 형변환 X

        // !!! 무엇이 문제인지 찾고 어떻게 고쳐야 하는지 알면 됨 !!!
    }
}
