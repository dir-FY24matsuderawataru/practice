package mini_test;

public class test04_03 {
    public static void main(String[] args) {
        // 1. double型の配列変数を宣言し、要素数が10の配列を初期化
        double[] randomNumbers = new double[10];

        // 2. 配列の各要素にランダムな浮動小数点数を代入
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = Math.random();
        }

        // 3. 配列の内容を表示（オプション）
        System.out.println("ランダムな浮動小数点数:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println("randomNumbers[" + i + "] = " + randomNumbers[i]);
        }
    }
}

