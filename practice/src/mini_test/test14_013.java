package mini_test;

//子クラス2: Bicycle
class test14_013 extends test14_011 {
 // ベルを鳴らすメソッド
 void ringBell() {
     System.out.println("ベルを鳴らします。");
 }
}

//動作確認クラス: VehicleTest
public class test14_014 {
 public static void main(String[] args) {
     // Carクラスのオブジェクトを作成
     test14_012 myCar = new test14_012();
     // Carクラスのメソッドを呼び出し
     myCar.start();
     myCar.accelerate();
     myCar.stop();

     // Bicycleクラスのオブジェクトを作成
     test14_013 myBicycle = new test14_013();
     // Bicycleクラスのメソッドを呼び出し
     myBicycle.start();
     myBicycle.ringBell();
     myBicycle.stop();
 }
}