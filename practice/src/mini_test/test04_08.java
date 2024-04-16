package mini_test;

public class test04_08 {
    public static void main(String[] args) {
        // 1. 整数の配列変数を宣言
        int[] fibonacci;

        // 2. 配列を初期化
        fibonacci = new int[10]; // 最初の10個のフィボナッチ数を格納

        // 3. フィボナッチ数の初期化
        fibonacci[0] = 0; // 最初の2つの数
        fibonacci[1] = 1;

        for (int i = 2; i < 10; i++) {
            // フィボナッチ数の計算：前の2つの数の合計
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // 4. 配列の内容を表示（オプション）
        System.out.println("フィボナッチ数列の最初の10個の要素:");
        for (int i = 0; i < 10; i++) {
            System.out.println("fibonacci[" + i + "] = " + fibonacci[i]);
        }
    }
}


