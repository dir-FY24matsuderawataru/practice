package mini_test;

public class test06_06 {
    public static void main(String[] args) {
        // ネストされたfor文を使用して九九の表を表示
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                // 掛け算の結果を表示
                System.out.print(i * j + "\t");
            }
            // 1つの行を表示したら改行する
            System.out.println();
        }
    }
}

