package mini_test;

//Dog クラスの宣言と Animal クラスの継承
public class test17_063 extends test17_062 {
 // makeSound メソッドのオーバーライド
 @Override
 void makeSound() {
     System.out.println("Woof!");
 }

 // run メソッドの実装 (Runnable インターフェイスの実装)
 @Override
 public void run() {
     System.out.println("Running like a dog.");
 }
}

