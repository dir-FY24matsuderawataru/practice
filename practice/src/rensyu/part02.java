package rensyu;

public class part02 {


    public static void main(String[] args) {
        // インスタンスの作成
        var employee = new part01("鈴木", "営業部", "課長", 100);
        // インスタンスメソッドの呼び出し
       employee.report();
       employee.report(2);
       System.out.println(employee);
    }

}

