package mini_test;

public class test04_26 {
    public static void main(String[] args) {
        // 整数型の配列 sourceArray を宣言し、要素数が5で初期化
        int[] sourceArray = new int[5];

        // 配列 sourceArray に1から5までの整数を代入
        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = i + 1;
        }

        // 別の整数型の配列 targetArray を宣言し、要素数が5で初期化
        int[] targetArray = sourceArray;

        // targetArray の内容を表示
        System.out.print("targetArray: ");
        for (int value : targetArray) {
            System.out.print(value + " ");
        }
    }
}

