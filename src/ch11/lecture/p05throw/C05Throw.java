package ch11.lecture.p05throw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C05Throw {
    public static void main(String[] args) {
//        Class.forName("");
    }

    public static void action() throws ClassNotFoundException, FileNotFoundException {
        Class.forName("");

        var io = new FileNotFoundException();
    }

    public static void action2() throws Throwable {
        Class.forName("");
        new FileInputStream("");
    }
}
