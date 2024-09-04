package ch12.lecture.p01object;

import java.awt.print.Book;

public class C10ToString {
    public static void main(String[] args) {
        Book10 b1 = new Book10("this is java", 300, "shin");
        Book10 b2 = new Book10("this is java", 300, "shin");

    }
}

class Book10 {
    private String title;
    private int price;
    private String author;

    public Book10(String title, int price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }


}
