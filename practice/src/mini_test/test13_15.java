package mini_test;

import java.time.LocalDate;
import java.time.Period;

public class test13_15 {
    public static void main(String[] args) {
        // ユーザーからの入力を仮定していないので、生年月日を直接指定
        String birthdateStr = "1999-06-12";

        // 生年月日をLocalDateオブジェクトに変換
        LocalDate birthdate = LocalDate.parse(birthdateStr);

        // 現在の日付を取得
        LocalDate currentDate = LocalDate.now();

        // 年齢を計算
        Period agePeriod = Period.between(birthdate, currentDate);
        int age = agePeriod.getYears();

        // 年齢を表示
        System.out.println("生年月日: " + birthdate);
        System.out.println("現在の日付: " + currentDate);
        System.out.println("年齢: " + age + "歳");
    }
}

