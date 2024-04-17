package mini_test;

public class test07_06 {
    // フィールドの宣言
    private String name;
    private int age;

    // コンストラクタの定義
    public test07_06(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ゲッターとセッターの定義（オプション）

    // オブジェクトの情報を表示するメソッド
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Person クラスのオブジェクト生成と初期化
        test07_06 person = new test07_06("John Doe", 25);

        // オブジェクトの情報を表示
        person.displayInfo();
    }
}

