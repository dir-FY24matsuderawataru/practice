package mini_test;

import java.util.Arrays;

public class test04_17 {
    public static void main(String[] args) {
        // 整数の配列を定義
        int[] originalArray = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};

        // 重複要素を削除して新しい配列を作成
        int[] uniqueArray = removeDuplicates(originalArray);

        // 結果を表示
        System.out.println("元の配列: " + Arrays.toString(originalArray));
        System.out.println("重複を削除した配列: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] arr) {
        int length = arr.length;
        int uniqueCount = 0;

        // 配列内の重複を削除
        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueCount++;
            }
        }

        // 重複を削除した新しい配列を作成
        int[] uniqueArray = new int[uniqueCount];
        int currentIndex = 0;

        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[currentIndex] = arr[i];
                currentIndex++;
            }
        }

        return uniqueArray;
    }
}

