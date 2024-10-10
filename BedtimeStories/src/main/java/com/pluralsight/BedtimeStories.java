package com.pluralsight;

import java.io.FileReader;
import java.io.FileInputStream;
import java.util.Scanner;

public class BedtimeStories {
    public static void BedtimeStories(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInputString;
        String userSelection = " ";
        do {
            try {

// Introduction into the choices

                System.out.println("Welcome to fairytale land!");
                System.out.println("_______________________________________");
                System.out.print("Please enter a story name (Hansel & Gretel, Colidlocks, Mary Had a Little Lamb, or [Q]uit\n>>> ");
                userInputString = scanner.nextLine();

       // how to change input not case or word sensitive
                switch (userInputString.toLowerCase()) {
                    case "goldilocks", "g":
                        userSelection = "goldilocks.txt";
                            break;
                    case "hansel_and_gretel", "hansel and gretel", "h":
                        userSelection = "hansel_and_gretel.txt";
                            break;
                    case "mary_had_a_little_lamb", "mary had a little lamb", "m":
                        userSelection = "mary_had_a_little_lamb.txt";
                            break;
                    case "q":
                        return;
                }

                FileInputStream fis = new FileInputStream(userSelection);
                Scanner scanFile = new Scanner(fis);
                int lineNumber = 1;
                while(scanFile.hasNextLine()){
                    String line = scanFile.nextLine();
                    System.out.printf("%d: %s\n", lineNumber++, line);
                }

                scanFile.close();

            }
            catch(Exception e){
                System.out.println("Not Happening, can't do that" + e.getMessage());
            }
        } while (true);
    }
}





