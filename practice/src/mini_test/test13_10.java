package mini_test;

import java.util.Scanner;

public class test13_10 {
    public static void main(String[] args) {
        // 1. 変換対象の10進数を取得
        Scanner scanner = new Scanner(System.in);
        System.out.print("10進数を入力してください: ");
        int decimalNumber = scanner.nextInt();

        // 2. 変換先の進数を指定
        System.out.print("変換先の進数を入力してください（2, 8, 16など）: ");
        int targetBase = scanner.nextInt();

        // 3. 10進数を指定された進数に変換して結果を表示
        String convertedNumber = convertDecimalToBase(decimalNumber, targetBase);
        System.out.println("変換結果: " + convertedNumber);

        // スキャナをクローズ
        scanner.close();
    }

    // 10進数を指定された進数に変換するメソッド
    private static String convertDecimalToBase(int decimalNumber, int targetBase) {
        return Integer.toString(decimalNumber, targetBase);
    }
}

