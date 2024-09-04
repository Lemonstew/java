//package ch12.lecture.p01object;
//
//import java.awt.print.Book;
//
//public class C03Equals {
//    public static void main(String[] args) {
//        Book3 b1 = new Book3("이것이 자바다");
//        Book3 b2 = new Book3("모두의 Git");
//        Book3 b3 = new Book3("이것이 자바다");
//
//        boolean r1 = b1.equals(b2);
//        System.out.println("r1 = " + r1);
//
//        boolean r2 = b1.equals(b3);
//        System.out.println("r2 = " + r2);
//
//    }
//}
//
//class Book3 {
//    private String title;
//
//    public Book3(String title) {
//        this.title = title;
//    }
//
//    public void setTitle(String title) {
//
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        if (this.title.equals(other.title)) {
//            return true;
//        }
//        return false;
//    }
//}
//
