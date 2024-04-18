package mini_test;

//CalculatorTestクラスの定義
public class test08_051 {

 public static void main(String[] args) {
     // Calculatorクラスのインスタンスを作成
     test08_05 calculator = new test08_05();

     // 各メソッドを呼び出して結果を表示
     double resultAdd = calculator.add(10.5, 5.2);
     System.out.println("加算の結果: " + resultAdd);

     double resultSubtract = calculator.subtract(10.5, 5.2);
     System.out.println("減算の結果: " + resultSubtract);

     double resultMultiply = calculator.multiply(10.5, 5.2);
     System.out.println("乗算の結果: " + resultMultiply);

     double resultDivide = calculator.divide(10.5, 5.2);
     System.out.println("除算の結果: " + resultDivide);
 }
}

