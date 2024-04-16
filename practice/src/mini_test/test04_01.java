package mini_test;
public class test04_01 {
    public static void main(String[] args) {
        // 整数の配列変数を宣言し、要素数が5の配列を初期化してすべての要素をゼロに設定
        int[] myArray = {0, 0, 0, 0, 0};

        // 配列の内容を表示（オプション）
        System.out.println("配列の内容:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("myArray[" + i + "] = " + myArray[i]);
        }
    }
}

