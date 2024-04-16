package mini_test;

public class test04_42 {
    public static void main(String[] args) {
        // 2次元整数配列を宣言および初期化
        int[][] matrix = {
            {3, 8, 2},
            {5, 1, 10},
            {4, 7, 6}
        };

        // 最小値と最大値の初期化
        int minValue = matrix[0][0];
        int maxValue = matrix[0][0];

        // 配列内の各要素を調べて最小値と最大値を見つける
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                // 最小値の更新
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }

                // 最大値の更新
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }

        // 結果を出力
        System.out.println("2次元配列内の最小値は: " + minValue);
        System.out.println("2次元配列内の最大値は: " + maxValue);
    }
}

