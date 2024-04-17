package mini_test;

import java.util.Scanner;

public class test05_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1つ目の文字列を入力してください: ");
        String str1 = scanner.nextLine();

        System.out.print("2つ目の文字列を入力してください: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) // 2つの文字列が完全に同じ場合に true を返す
        {
            System.out.println("同じです");
        }
        if (str1.equalsIgnoreCase(str2)) // 2つの文字列が同じであるか、大文字小文字の違いを無視して同じ場合に true を返す
        {
            System.out.println("同じです");
        }
        if (str1.compareTo(str2) == 0) // 2つの文字列を辞書順に比較し、整数を返す。0の場合は同じ、負の値の場合は1つ目の文字列が2つ目の文字列より小さい、正の値の場合は1つ目の文字列が2つ目の文字列より大きいことを示す
        {
            System.out.println("同じです");
        }

        scanner.close();
    }
}

