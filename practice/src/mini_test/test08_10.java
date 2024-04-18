package mini_test;

public class test08_10 {
    // 加算のメソッド
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // 減算のメソッド
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // 乗算のメソッド
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // 除算のメソッド
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            // ゼロで割るエラーを避けるためにエラー値などを返すことが考えられます
            System.out.println("エラー: ゼロで割ることはできません。");
            return Double.NaN; // 例として NaN (Not a Number) を返します
        }
    }

    // 四つの基本的な計算を行うメソッド
    public void performCalculation(int num1, int num2) {
        // 二つの数値の和、差、積、商を計算して表示
        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));
        System.out.println("Quotient: " + divide(num1, num2));
    }
}

