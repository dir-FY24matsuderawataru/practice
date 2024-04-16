package rensyu;

public class part01 {
    // フィールド
    String name;
    String department;
    String position;
    int employeeId;

    // コンストラクター
    public part01(String nama, String department, String position, int employeeId) {
        this.name = nama;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }

    // 報告メソッド
    public void report(int times) {
        System.out.println(times + "回目の報告をします。役職：" + position + "、名前：" + name);
    }

    // 報告メソッド（オーバーロード）
    public void report() {
        report(1);
    }
}