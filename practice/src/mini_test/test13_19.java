package mini_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test13_19 {
    public static void main(String[] args) {
        // テスト用のテキスト
        String text = "Visit our website at https://www.example.com for more information. You can also check http://example.org.";

        // URLを抽出する正規表現パターン
        String urlRegex = "\\b(?:https?|ftp):\\/\\/[-A-Z0-9+&@#\\/%?=~_|!:,.;]*[-A-Z0-9+&@#\\/%=~_|]";

        // 正規表現パターンをコンパイル
        Pattern pattern = Pattern.compile(urlRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // マッチしたURLを表示
        while (matcher.find()) {
            String url = matcher.group();
            System.out.println("Found URL: " + url);
        }
    }
}

