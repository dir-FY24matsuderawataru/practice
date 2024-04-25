package mini_test;

public class test13_01 {
    public static void main(String[] args) {
        
        String input = "Hello";

        // 逆順にするための新しい文字列
        String reversed = reverseString(input);

        // 結果を表示
        System.out.println("入力: " + input);
        System.out.println("出力: " + reversed);
    }

    // 文字列を逆順にするメソッド
    private static String reverseString(String input) {
        // StringBuilderを使用して効率的に文字列を逆順にする
        StringBuilder reversedBuilder = new StringBuilder(input);
        reversedBuilder.reverse();
        return reversedBuilder.toString();
    }
}