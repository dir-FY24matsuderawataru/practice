package mini_test;

//メインクラス
public class test14_164 {
 public static void main(String[] args) {
     // Dog インスタンスの生成
     test14_162 myDog = new test14_162("バディ");

     // メッセージの表示と Dog の元の名前を取得
     System.out.println("犬の元の名前: " + myDog.getName());

     // 犬の名前を変更
     myDog.setDogName("マックス");

     // メッセージの表示と犬の更新後の名前を取得
     System.out.println("犬の更新後の名前: " + myDog.getName());

     // Cat インスタンスの生成
     test14_163 myCat = new test14_163("ウィスカーズ");

     // メッセージの表示と Cat の元の名前を取得
     System.out.println("猫の元の名前: " + myCat.getName());

     // 猫の名前を変更
     myCat.setCatName("ミトンズ");

     // メッセージの表示と猫の更新後の名前を取得
     System.out.println("猫の更新後の名前: " + myCat.getName());
 }
}

