package mini_test;

public class test06_08 {
    public static void main(String[] args) {
        // 1から100までの素数を表示
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            // 2からiの平方根までの数で割り切れるか確認
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // 割り切れる場合は素数ではないのでループを抜ける
                }
            }

            // 素数の場合は表示
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

