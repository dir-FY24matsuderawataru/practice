package mini_test;

//Calculatorクラスの定義
public class test08_05 {

 // 加算メソッド
 public double add(double num1, double num2) {
     return num1 + num2;
 }

 // 減算メソッド
 public double subtract(double num1, double num2) {
     return num1 - num2;
 }

 // 乗算メソッド
 public double multiply(double num1, double num2) {
     return num1 * num2;
 }

 // 除算メソッド
 public double divide(double num1, double num2) {
     if (num2 != 0) {
         return num1 / num2;
     } else {
         System.out.println("除数が0です。");
         return Double.NaN; // NaN (Not a Number) を返すことでエラー状態を示す
     }
 }
}

