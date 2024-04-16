package mini_test;
    import java.util.Scanner;

    public class test2_1 {
        public static void main(String[] args) {
            // Scannerを作成
            Scanner scanner = new Scanner(System.in);

            // ユーザーに名前の入力を促すプロンプトを表示
            System.out.print("名前を入力してください: ");

            // ユーザーからの入力を受け取り、文字列変数に格納
            String name = scanner.nextLine();

            // 挨拶メッセージを生成して表示
            System.out.println("Hello, " + name + "!");

            // Scannerをクローズ
            scanner.close();
        }
    }

