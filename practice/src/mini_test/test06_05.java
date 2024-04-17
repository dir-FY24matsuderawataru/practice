package mini_test;

public class test06_05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("Number: " + i);

            // 偶数の場合は3倍にして表示
            if (i % 2 == 0) {
                System.out.println(" (Tripled: " + (i * 3) + ")");
                //              i *= 3;  ブロック内での更新式
            } else {
                System.out.println();
            }
        }
    }
}

