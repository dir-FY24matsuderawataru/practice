package mini_test;

public class test06_07 {
    public static void main(String[] args) {
        // 下向きの三角形を表示するプログラム
        int rows = 5; // 行数を指定

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                // "*"を表示
                System.out.print("*");
            }
            // 1つの行を表示したら改行する
            System.out.println();
        }
    }
}

