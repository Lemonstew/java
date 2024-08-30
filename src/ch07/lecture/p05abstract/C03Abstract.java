package ch07.lecture.p05abstract;

import java.math.BigDecimal;

public class C03Abstract {
    public static void main(String[] args) {
        // Number n = new Number();
        Number n = new Integer(3);
        Number d = new Double(3.14);
        Number a = new BigDecimal("3.1415926535897932384626");

        double v = n.doubleValue();
        double v1 = d.doubleValue();
        double v2 = a.doubleValue();
    }
}
