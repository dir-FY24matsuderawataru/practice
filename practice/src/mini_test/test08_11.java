package mini_test;

public class test08_11 {

    // 文字列を逆順にするメソッド
    public static String reverseString(String input) {
        // 文字列を文字の配列に変換
        char[] charArray = input.toCharArray();

        // 配列を逆順にする
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // 逆順になった配列を文字列に戻す
        return new String(charArray);
    }

    // 文字列を大文字に変換するメソッド
    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // 文字列を逆順かつ大文字に変換するメソッド
    public static String reverseAndUpperCase(String input) {
        // 与えられた文字列を逆順にし、大文字に変換
        String reversedAndUpperCase = toUpperCase(reverseString(input));

        return reversedAndUpperCase;
    }

    public static void main(String[] args) {
        // テスト用の文字列
        String testString = "Hello, Java!";

        // テスト
        System.out.println("Original String: " + testString);
        System.out.println("Reversed and UpperCased String: " + reverseAndUpperCase(testString));
    }
}

