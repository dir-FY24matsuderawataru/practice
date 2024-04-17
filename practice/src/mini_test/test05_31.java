package mini_test;

import java.util.Scanner;

public class test05_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("テストの点数を入力してください: ");
        int score = scanner.nextInt();

        // 条件演算子を使用して評価を行う
        String result = (score >= 90) ? "優秀" :
                        (score >= 80) ? "良好" :
                        (score >= 70) ? "可" :
                                       "不可";

        System.out.println("評価: " + result);
        
        scanner.close();
    }
}

