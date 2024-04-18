package mini_test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class test08_04 {
    
    public static void displayDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Current Date: " + formattedDate);
    }

    public static void main(String[] args) {
        displayDate();

    }

}
