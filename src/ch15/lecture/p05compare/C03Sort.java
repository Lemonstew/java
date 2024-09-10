package ch15.lecture.p05compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03Sort {
    public static void main(String[] args) {
        List<Book3> list = new ArrayList<>();
        list.add(new Book3("java", 300));
        list.add(new Book3("git", 400));
        list.add(new Book3("css", 500));
        list.add(new Book3("spring", 200));

        list.forEach(System.out::println);
        Collections.sort(list, (x, y) -> x.getPrice() - y.getPrice());

        System.out.println("---가격순 정렬---");
        list.forEach(System.out::println);

        // 제목순 또는 제목역순을 할 땐 getTitle을 compareTo를 하자
    }
}


class Book3 {
    private String title;
    private int price;

    // 생성자, getter, setter, toString

    public Book3(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book3{");
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
}
