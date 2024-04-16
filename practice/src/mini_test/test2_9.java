package mini_test;

import java.util.Scanner;

public class test2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1つ目の辺の長さを入力してください: ");
        double side1 = scanner.nextDouble();

        System.out.print("2つ目の辺の長さを入力してください: ");
        double side2 = scanner.nextDouble();

        System.out.print("3つ目の辺の長さを入力してください: ");
        double side3 = scanner.nextDouble();

        // 三角形の成立条件をチェック
        if (isTriangle(side1, side2, side3)) {
            System.out.println("これらの辺の長さで三角形は成立します。");
        } else {
            System.out.println("これらの辺の長さでは三角形は成立しません。");
        }
    }

    // 三角形の成立条件を確認するメソッド
    public static boolean isTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }
}

