package com.company;

import java.awt.print.Paper;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int wins = 0;
    public static int ties = 0;
    public static int losses = 0;

    public static void main(String[] args) {
	/*Design and implement an application that plays the Rock Paper Scissors game against the computerThe program should
	randomly choose one of the three options, then prompt the user’s selection.At that point, the program reveals
	both choices and prints a statement indicating if the user won, the computer won or if it is a tie.
	Continue playing until user chooses to stop, then print the number of wins, losses, and ties.*/
	    Scanner scanner = new Scanner(System.in);
        boolean run = true;
        String[] values = {"Paper", "Rock", "Scissors"}; //array of possible choices for computer
        while (run == true) {
            String randomValue = returnRandomValue(values);
            printMenu();
            int playerInput = scanner.nextInt();
            System.out.println("Computer plays: " + randomValue);
            System.out.println("Player plays: " + returnPlayerValue(playerInput));
            returnPlayerValue(playerInput);
            int calculatedResult = calculateResult(randomValue, returnPlayerValue(playerInput));

            //calculateResult(randomValue, returnPlayerValue(playerInput));
            run = false;
            if (run == false) {
                System.out.println("Want to play again? \n" +
                        "1. Yes\n" +
                        "2. No");
            }
            int playerAnswer = scanner.nextInt();
            if (playerAnswer == 1) {
                run = true;
            } else if (playerAnswer == 2) {
                calculatePoints();
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                System.err.println("Invalid entry");
            }

        }
    }
        public static void printMenu () { //printing menu at the beginning
            System.out.println(
                    "Please select a value:\n" +
                            "1. Paper\n" +
                            "2. Rock\n" +
                            "3. Scissors");
        }
        public static String returnRandomValue (String[]values){ //returns random value from array of values
            String randomValue = (values[new Random().nextInt(values.length)]);
            return randomValue;
        }

        public static String returnPlayerValue ( int playerInput){
            String playerValue = "";
            if (playerInput == 1) {
                playerValue = "Paper";
            } else if (playerInput == 2) {
                playerValue = "Rock";
            } else if (playerInput == 3) {
                playerValue = "Scissors";
            } else {
                System.err.println("Invalid entry");
            }
            return playerValue;
        }
        public static int calculateResult (String valueComputer, String valuePlayer){

            int result = 0;
            if (valueComputer.equals("Rock") && valuePlayer.equals("Rock")) {
                System.out.println("It's a tie!");
                ties++;
            } else if (valueComputer.equals("Rock") && valuePlayer.equals("Scissors")) {
                System.out.println("Computer Wins!");
                losses++;
            } else if (valueComputer.equals("Rock") && valuePlayer.equals("Paper")) {
                System.out.println("Player Wins!");
                wins++;
            } else if (valueComputer.equals("Paper") && valuePlayer.equals("Paper")) {
                System.out.println("It's a tie!");
                ties++;
            } else if (valueComputer.equals("Paper") && valuePlayer.equals("Rock")) {
                System.out.println("Computer Wins!");
                losses++;
            } else if (valueComputer.equals("Paper") && valuePlayer.equals("Scissors")) {
                System.out.println("Player Wins!");
                wins++;
            } else if (valueComputer.equals("Scissors") && valuePlayer.equals("Scissors")) {
                System.out.println("It's a tie!");
                ties++;
            } else if (valueComputer.equals("Scissors") && valuePlayer.equals("Paper")) {
                System.out.println("Computer Wins!");
                losses++;
            } else if (valueComputer.equals("Scissors") && valuePlayer.equals("Rock")) {
                System.out.println("Player Wins!");
                wins++;
            }
          return result;
        }
        public static void calculatePoints() {
            System.out.println("Wins: " +wins);
            System.out.println("Ties: " +ties);
            System.out.println("Losses: " +losses);

        }
    }
