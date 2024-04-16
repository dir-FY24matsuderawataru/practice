package mini_test;

import java.util.Scanner;

public class test3_13 {
    public static void main(String[] args) {
        // スキャナーを使ってユーザーからの整数入力を読み取る
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        int number = scanner.nextInt(); // 整数の入力を読み取り

        // 整数が3で割り切れかつ5で割り切れる場合、「3と5の両方で割り切れます」と表示
        if ((number % 3 == 0) && (number % 5 == 0)) {
            System.out.println("3と5の両方で割り切れます");
        } else {
            System.out.println("割り切れません");
        }
    }
}


