package mini_test;


public class test14_302 extends test14_301 {
    // Car クラス独自のフィールドやメソッドがあればここで宣言

    // start メソッドのオーバーライド
    @Override
    public void start() {
        // Car クラス独自の処理
        System.out.println("車がエンジンをかけました");

        // 親クラスの start メソッド呼び出し
        super.start();
    }

    // Car クラス独自のメソッドがあればここで宣言
}

