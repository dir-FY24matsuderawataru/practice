package mini_test;

public class test06_26 {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 20; i++) {
            // 外側のループ: 1から20までの整数
            for (int j = 1; j <= 20; j++) {
                // 中間のループ: 1から20までの整数
                for (int k = 1; k <= 20; k++) {
                    // 内側のループ: 1から20までの整数

                    // 条件に合致する場合、break文を使用して全てのループを終了させる
                    if (i % 5 == 0 && j % 3 == 0 && k % 2 == 0) {
                        break outerLoop;
                    }

                    // 条件に合致しない場合の処理（例えば、表示など）
                    System.out.println("i: " + i + ", j: " + j + ", k: " + k);
                }
            }
        }
    }
}

