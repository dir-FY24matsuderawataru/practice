package mini_test;

import java.util.Arrays;

public class test04_18 {
    public static void main(String[] args) {
        // 文字列の配列を定義
        String[] originalArray = {"apple", "banana", "cherry", "date", "fig"};

        // 要素を逆順にして新しい配列を作成
        String[] reversedArray = reverseStringArray(originalArray);

        // 結果を表示
        System.out.println("元の配列: " + Arrays.toString(originalArray));
        System.out.println("逆順の配列: " + Arrays.toString(reversedArray));
    }

    public static String[] reverseStringArray(String[] arr) {
        int length = arr.length;

        // 新しい配列を作成
        String[] reversedArray = new String[length];

        // 元の配列の要素を逆順に新しい配列にコピー
        for (int i = 0; i < length; i++) {
            reversedArray[i] = arr[length - 1 - i];
        }

        return reversedArray;
    }
}
