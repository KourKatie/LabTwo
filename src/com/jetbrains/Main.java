package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userInput = 0;
        String userName = "";
        String answer = "";

        Scanner scnr = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        userName = scnr.next();

        System.out.println("Hello " + userName + "!");

        do {

            System.out.println("Please enter a number between 1 and 100: ");
            userInput = scnr.nextInt();

            if ((userInput < 0) || (userInput > 100)) {
                System.out.println("Error: This program only accepts integers between 1 and 100.");
                System.out.println("Goodbye " + userName + "!");
                break;
            } else if ((userInput % 2 != 0) && (userInput <= 60)) {
                System.out.println(userInput + " " + "odd");
            } else if ((userInput % 2 == 0) && (userInput >= 2 && userInput <= 25)) {
                System.out.println("Even and less than 25");
            } else if ((userInput % 2 == 0) && (userInput >= 26 && userInput < 60)) {
                System.out.println("Even");
            } else if ((userInput % 2 == 0) && (userInput >= 60)) {
                System.out.println("Even");
            } else if ((userInput % 2 != 0) && (userInput > 60)) {
                System.out.println("Odd and over 60");
            }

            System.out.println("Continue " + userName + " (y/n)?");

            answer = scnr.next();
        }
        while (answer.equals("y"));

        System.out.println("Goodbye " + userName + "!");

        return;


    }
}


