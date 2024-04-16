package mini_test;

public class test04_16 {
    public static void main(String[] args) {
        // 整数の配列を定義
        int[] originalArray = {10, 21, 36, 42, 55, 67, 78, 89, 94, 100};

        // 奇数要素用と偶数要素用の配列を初期化
        int[] oddArray = new int[originalArray.length];
        int[] evenArray = new int[originalArray.length];

        int oddCount = 0; // 奇数要素の数
        int evenCount = 0; // 偶数要素の数

        // 元の配列を走査し、奇数と偶数を別々の配列に分離
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] % 2 != 0) {
                // 奇数の場合、oddArrayに追加
                oddArray[oddCount] = originalArray[i];
                oddCount++;
            } else {
                // 偶数の場合、evenArrayに追加
                evenArray[evenCount] = originalArray[i];
                evenCount++;
            }
        }

        // 奇数要素用の新しい配列を作成
        int[] finalOddArray = new int[oddCount];
        System.arraycopy(oddArray, 0, finalOddArray, 0, oddCount);

        // 偶数要素用の新しい配列を作成
        int[] finalEvenArray = new int[evenCount];
        System.arraycopy(evenArray, 0, finalEvenArray, 0, evenCount);

        // 結果を表示
        System.out.print("元の配列: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("奇数要素: ");
        for (int num : finalOddArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("偶数要素: ");
        for (int num : finalEvenArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("初期奇数要素: ");
        for (int num : oddArray) {
            System.out.print(num + " ");
        }
    }
}

