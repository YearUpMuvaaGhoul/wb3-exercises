package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = today.format(fmt1);
        System.out.println(formattedDate1);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatDate2 = today.format((fmt2));
        System.out.println(formatDate2);

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formatDate3 = today.format((fmt3));
        System.out.println(formatDate3);

        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("E, MMM dd, yyyy");
        String formatDate4 = today.format((fmt4));
        System.out.println(formatDate4);

        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("HH:mm 'on' dd-MMM-yyy");
        String formatDate5 = today.format((fmt5));
        System.out.println(formatDate5);


    }
}
