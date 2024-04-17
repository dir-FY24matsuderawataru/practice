package mini_test;

import java.util.Scanner;

public class test06_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            // ユーザーに1から10までの数値を入力させるメッセージを表示
            System.out.print("1から10までの数値を入力してください: ");

            // ユーザーからの入力を受け取る
            userInput = scanner.nextInt();

            // 入力が1から10までの範囲外の場合はメッセージを表示
            if (userInput < 1 || userInput > 10) {
                System.out.println("入力が範囲外です。再度入力してください。");
            }

        } while (userInput < 1 || userInput > 10);

        // プログラムの終了前にScannerオブジェクトをクローズ
        scanner.close();

        // 入力が1から10までの範囲内の場合の処理
        System.out.println("入力された数値: " + userInput);
    }
}

