package ch15.lecture.p05compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02Sort {
    public static void main(String[] args) {
        List<Book2> books = new ArrayList<>();
        books.add(new Book2("java", 500));
        books.add(new Book2("git", 600));
        books.add(new Book2("react", 300));
        books.add(new Book2("spring", 700));
        books.add(new Book2("vue", 400));

        books.forEach(System.out::println);

        Collections.sort(books);
        System.out.println("-정렬 후-");
        books.forEach(System.out::println);
    }
}

class Book2 implements Comparable<Book2> {
    private String title;
    private int price;

    public Book2(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book2{");
        sb.append("title='").append(title).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book2 o) {

        // 음수 : 이 객체가 작으면

        // 0 : 이 객체가 같으면

        // 양수 : 이 객체가 크면

        return this.price - o.price;
    }
}