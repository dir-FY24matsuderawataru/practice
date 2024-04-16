package mini_test;

public class test4_15 {
    public static void main(String[] args) {
        // 整数の配列を定義
        int[] numbers = {10, 20, 30, 40, 50, 30, 60};

        // 検索対象の値
        int targetValue = 30;

        // インデックスを格納する変数を初期化
        int index = -1;

        // 配列内をループで検索
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetValue) {
                index = i; // 一致が見つかった場合、インデックスを記録
                break; // 一致が見つかったらループを終了
            }
        }

        // インデックスを表示
        if (index != -1) {
            System.out.println("値 " + targetValue + " はインデックス " + index + " で最初に見つかりました。");
        } else {
            System.out.println("値 " + targetValue + " は配列内で見つかりませんでした。");
        }
    }
}

