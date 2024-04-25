package mini_test;

public class test12_01 {
    // static変数 - カウントされた回数を表す変数
    private static int totalCount = 0;
    
    // インスタンス変数 - インスタンスごとのカウントを表す変数
    private int instanceCount;
    
    // コンストラクタ - インスタンス変数の初期化
    public test12_01() {
        // 新しいインスタンスが生成されるたびにtotalCountを増やし、instanceCountを初期化
        totalCount++;
        instanceCount = 0;
    }
    
    // インスタンスメソッド - 新しいインスタンスが生成されるたびにカウントを増やすメソッド
    public void incrementInstanceCount() {
        // インスタンスごとのカウントを増やす
        instanceCount++;
    }
    
    // クラスメソッド - カウントされた回数を取得するメソッド
    public static int getTotalCount() {
        return totalCount;
    }
    
    // インスタンスメソッド - インスタンスごとのカウントを取得するメソッド
    public int getInstanceCount() {
        return instanceCount;
    }
    
    public static void main(String[] args) {
        // テスト
        test12_01 counter1 = new test12_01();
        counter1.incrementInstanceCount();
        
        test12_01 counter2 = new test12_01();
        counter2.incrementInstanceCount();
        counter2.incrementInstanceCount();
        
        System.out.println("Total Count: " + test12_01.getTotalCount()); // 2
        System.out.println("Counter 1 Instance Count: " + counter1.getInstanceCount()); // 1
        System.out.println("Counter 2 Instance Count: " + counter2.getInstanceCount()); // 2
        
    }

}

