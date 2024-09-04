package ch12.exercise.quest6;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(id + ": " + name);
        return sb.toString();
    }
}
