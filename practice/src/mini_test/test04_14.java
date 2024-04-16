package mini_test;

public class test04_14 {
    public static void main(String[] args) {
        // 整数の配列を定義
        int[] numbers = {23, 45, 12, 67, 5, 88, 34};

        // 最大値と最小値を初期化
        int max = Integer.MIN_VALUE; // 最小の整数で初期化
        int min = Integer.MAX_VALUE; // 最大の整数で初期化

        // 配列内の要素を調べて最大値と最小値を更新
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // 最大値と最小値を表示
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
    }
}

