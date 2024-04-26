package mini_test;

//メインクラス
public class test15_124 {
 public static void main(String[] args) {
     // 動的な配列の作成
     test15_121[] animals = new test15_121[3];

     // 配列に要素を追加
     animals[0] = new test15_121();
     animals[1] = new test15_123();
     animals[2] = new test15_122();

     // 配列の各要素から makeSound メソッドを呼び出す
     for (test15_121 animal : animals) {
         animal.makeSound();
     }
 }
}
