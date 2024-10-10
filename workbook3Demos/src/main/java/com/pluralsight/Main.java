package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {


            String[] names = {

                    "Lexx", "Matt", "Ylandre",
                    "Ali", "Sharian", "Obaid"
            };

            System.out.print("pick a peer (select #1-#6):  ");

            int index = scanner.nextInt();
            index--; // change number from range 1-6 to range 0-5
            //as long as user entered a number in the range
            // of 1 to 6 this will work. otherwise it will be out of range.

            System.out.println(names[index]);

        }
        catch (Exception e) {
            System.out.println("This is invalid sorry");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}


