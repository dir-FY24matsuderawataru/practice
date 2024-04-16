package mini_test;

import java.util.Scanner;

public class test3_22 {
    public static void main(String[] args) {
        // スキャナーを使ってユーザーから整数の入力を読み取る
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        int number = scanner.nextInt(); // 整数の入力を読み取り

        // 2番目のビットを反転
        int mask = 1 << 1; // 2番目のビットに対応するビットマスク
        int result = number ^ mask; // XOR演算を使用して2番目のビットを反転

        // 結果を表示
        System.out.println("2番目のビットを反転した結果: " + result);
    }
}
