package mini_test;

public class test13_05 {
    public static void main(String[] args) {
        // 変数の用意
        String name = "John";
        int age = 25;

        // 文字列フォーマットを使用して文章生成
        String formattedString = String.format("名前は%sで、年齢は%d歳です。", name, age);

        // 結果の表示
        System.out.println(formattedString);
    }
}