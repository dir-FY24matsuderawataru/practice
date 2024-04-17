package mini_test;

import java.util.ArrayList;
import java.util.List;

public class test07_182 {
    // 複数のAccountオブジェクトを管理するリスト
    private List<test07_18>accounts; 

    // コンストラクタでリストを初期化
    public test07_182() {
        this.accounts = new ArrayList<>();
    }

    // 新しい口座を追加するメソッド
    public void addAccount(test07_18 account) {
        accounts.add(account);
        System.out.println("Account added to the bank.");
    }
    
    // 全口座の残高総額を表示するメソッド
    public void displayTotalBalance() {
        double totalBalance = 0;
        
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            System.out.println("Total Balance in the Bank:");
            for (test07_18 account : accounts) {
                totalBalance += account.getBalance();
            }
            System.out.println("$" + totalBalance);

        }
    }
    public static void main(String[] args) {
        // Bank クラスのインスタンスを作成
        test07_182 myBank = new test07_182();

        // Account クラスのインスタンスを作成
        test07_18 account1 = new test07_18(12345, "John Doe", 1000);
        test07_18 account2 = new test07_18(67890, "Jane Doe", 2500);

        // 口座を追加
        myBank.addAccount(account1);
        myBank.addAccount(account2);

        // 残高総額表示
        myBank.displayTotalBalance();
    }
}