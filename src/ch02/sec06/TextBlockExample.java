package ch02.sec06;

public class TextBlockExample {
    public static void main(String[] args) {
        String str1 = "" +
                "{\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";

        String str2 = """
                {
                    "id":"winter",
                    "name":"눈송이"
                }
                """;

        System.out.println(str1);
        System.out.println("------------------------------");
        System.out.println(str2);
        System.out.println("------------------------------");

        String str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;

        System.out.println(str);

        // 텍스트 블록에서 줄바꿈은 \n에 해당,
        // 줄바꿈 하지 않고 다음 줄에 이어서 작성하고 싶다면 맨 끝에 \를 붙여주면 된다.
    }
}
