package mini_test;
public class test04_11 {
    public static void main(String[] args) {
        // 1. double型の配列変数を宣言
        double[] randomNumbers;

        // 2. 配列を初期化
        randomNumbers = new double[10]; // 10個の浮動小数点数を格納するために初期化

        // 3. ランダムな浮動小数点数を代入
        for (int i = 0; i < randomNumbers.length; i++) {
            // 0以上1未満のランダムな浮動小数点数を生成
            double randomValue = Math.random();
            // 0から9の範囲にスケーリングして代入
            randomNumbers[i] = randomValue * 10.0;
        }

        // 4. 値を表示
        System.out.println("ランダムな浮動小数点数:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println("randomNumbers[" + i + "] = " + randomNumbers[i]);
        }
    }
}

