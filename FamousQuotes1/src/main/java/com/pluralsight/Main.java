package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] quotes = new String[10];
        quotes[0] = "The granma the baby. - Joselyn Hernandez";
        quotes[1] = "In the end, it doesn't even matter. - Chester / Linkin Park ";
        quotes[2] = "If its up than it's stuck. -Cardi B";
        quotes[3] = "I'll be back - The terminator";
        quotes[4] = "Foo-FIGHTers -Christopher Walken";
        quotes[5] = "You go glen coco - Mean Girls";
        quotes[6] = "Hold My Poodle! - White Chicks.";
        quotes[7] = "May The Force be With you. -Star wars";
        quotes[8] = "We have such sights to show you. -Hellraiser";
        quotes[9] = "Ch ch ch ah ah ah - Jason Voorhees";

        // Code to prompt the user
        Scanner scanner = new Scanner(System.in);

// if they chose a number that doesn't exist
        while (true) {
            try {
                System.out.println("Select a number between 1 and 10 (or enter 0 to exit):");
                String command = scanner.nextLine();
                int number = Integer.parseInt(command);

                if (number == 0) {
                    break;
                }

                System.out.println(quotes[number - 1]); // Display the quote
            } catch (ArrayIndexOutOfBoundsException e) {

                //System.out.println("Please select a valid number between 1 and 10.");
                System.out.println("Invalid number, please try again");
            }
            catch( NumberFormatException e){
                System.out.println("Please enter a numeric value");
            }

        }
    }
}




