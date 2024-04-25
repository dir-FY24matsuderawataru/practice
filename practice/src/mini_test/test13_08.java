package mini_test;

public class test13_08 {
    public static void main(String[] args) {
        // 整数を浮動小数点数に変換
        int intValue = 42;
        double doubleValue = convertToDouble(intValue);

        // 浮動小数点数を整数に変換
        double floatValue = 3.14;
        int intResult = convertToInt(floatValue);

        // 結果を表示
        System.out.println("整数から浮動小数点数への変換: " + doubleValue);
        System.out.println("浮動小数点数から整数への変換: " + intResult);
    }

    // 整数を浮動小数点数に変換するメソッド
    private static double convertToDouble(int intValue) {
        return Double.valueOf(intValue); // Double.valueOf() を使用して整数を浮動小数点数に変換
    }

    // 浮動小数点数を整数に変換するメソッド
    private static int convertToInt(double floatValue) {
        return Double.valueOf(floatValue).intValue(); // Double.valueOf().intValue() を使用して浮動小数点数を整数に変換
    }
}
