package mini_test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test13_18 {
    public static void main(String[] args) {
        // ユーザーからの入力を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.println("電子メールアドレスを入力してください:");
        String email = scanner.nextLine();
        scanner.close();

        // 電子メールアドレスの正規表現パターン
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // 正規表現パターンをコンパイル
        Pattern pattern = Pattern.compile(emailRegex);

        // 入力された文字列と正規表現を比較
        Matcher matcher = pattern.matcher(email);

        // メッセージを表示
        if (matcher.matches()) {
            System.out.println("有効な電子メールアドレスです。");
        } else {
            System.out.println("無効な電子メールアドレスです。");
        }
    }
}

