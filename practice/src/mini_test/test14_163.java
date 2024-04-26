package mini_test;

//Cat クラス：Animal クラスを拡張
class test14_163 extends test14_161 {
 // Cat クラスのコンストラクタ
 public test14_163(String name) {
     // 親クラスのコンストラクタを呼び出し
     super(name);
 }

 // Cat の名前を設定するメソッド
 public void setCatName(String name) {
     // name を設定
     this.name = name;
 }
}


