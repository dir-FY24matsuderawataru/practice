package mini_test;

public class test13_07 {
    public static void main(String[] args) {
        // 与えられた整数
        int number = 24;

        // 平方根を計算
        double squareRoot = calculateSquareRoot(number);

        // 結果を表示
        System.out.println("与えられた整数の平方根: " + squareRoot);
    }

    // 整数の平方根を計算するメソッド
    private static double calculateSquareRoot(int number) {
        // Math.sqrt メソッドを使用して平方根を計算
        return Math.sqrt(number);
    }
}
