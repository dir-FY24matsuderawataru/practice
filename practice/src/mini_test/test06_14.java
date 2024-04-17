package mini_test;

import java.util.Scanner;

public class test06_14 {
    public static void main(String[] args) {
        // Scannerオブジェクトを作成
        Scanner scanner = new Scanner(System.in);

        // 初期化
        int sum = 0;
        int userInput = 1; // 初期値を1に設定

        // 条件式: userInputが0でない限り続行
        while (userInput != 0) {
            // ユーザー入力を受け取る
            System.out.print("整数を入力してください（0を入力すると終了）: ");
            userInput = scanner.nextInt();

            // 入力が0でない場合は入力を合計に加算
            sum += userInput;
        }

        // 合計を表示
        System.out.println("入力された整数の合計: " + sum);

        // Scannerをクローズ
        scanner.close();
    }
}

