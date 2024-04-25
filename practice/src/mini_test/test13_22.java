package mini_test;

import java.util.Scanner;

public class test13_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // パスワードを入力してもらう
        System.out.println("パスワードを入力してください: ");
        String password = scanner.nextLine();

        // セキュリティポリシーの検証
        if (validatePassword(password)) {
            System.out.println("パスワードがセキュリティポリシーに合致しています。");
        } else {
            System.out.println("パスワードがセキュリティポリシーに合致していません。");
        }
    }

    // パスワードのセキュリティポリシーを検証するメソッド
    private static boolean validatePassword(String password) {
        // 最低8文字以上、大文字・小文字・数字を含むかどうかを検証
        return password.length() >= 8 && containsUpperCase(password) && containsLowerCase(password) && containsDigit(password);
    }

    // 大文字を含むかどうかを検証するメソッド
    private static boolean containsUpperCase(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    // 小文字を含むかどうかを検証するメソッド
    private static boolean containsLowerCase(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                return true;
            }
        }
        return false;
    }

    // 数字を含むかどうかを検証するメソッド
    private static boolean containsDigit(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }
}

