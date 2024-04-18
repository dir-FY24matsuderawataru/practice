package mini_test;

public class test10_01 {
    
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public String add(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        test10_01 calculator = new test10_01();

        // 整数の加算を実行
        int result1 = calculator.add(5, 10);
        System.out.println("整数の加算結果: " + result1);

        // 浮動小数点数の加算を実行
        double result2 = calculator.add(3.5, 2.7);
        System.out.println("浮動小数点数の加算結果: " + result2);

        // 文字列の結合を実行
        String result3 = calculator.add("Hello, ", "world!");
        System.out.println("文字列の結合結果: " + result3);
    }
}

