package mini_test;

//Dog クラス：Animal クラスを拡張
class test14_162 extends test14_161 {
 // Dog クラスのコンストラクタ
 public test14_162(String name) {
     // 親クラスのコンストラクタを呼び出し
     super(name);
 }

 // Dog の名前を設定するメソッド
 public void setDogName(String name) {
     // name を設定
     this.name = name;
 }
}


