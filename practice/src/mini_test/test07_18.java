package mini_test;

public class test07_18 {
    // フィールドの宣言
    private int number;
    private String name;
    private int balance;

    // コンストラクタの定義
    public test07_18(int number, String name, int balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    // ゲッターとセッターの定義（オプション）
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }

    // オブジェクトの情報を表示するメソッド
    public void displayAccountInfo() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("----------");
    }
}