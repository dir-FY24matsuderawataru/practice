package mini_test;

public class test11_02 {

    // フィールド: 名前と年齢
    private String name;
    private int age;

    // デフォルトコンストラクタ
    public test11_02() {
        // デフォルトの初期値を設定
        this.name = "未設定";
        this.age = 0;
    }

    // 引数を受け取るコンストラクタ
    public test11_02(String newname, int newage) {
        // 引数で渡された値でフィールドを初期化
        this.name = newname;
        this.age = newage;
    }

    // 他のメソッドやコードは省略
}

