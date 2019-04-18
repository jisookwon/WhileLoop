package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber = 123, guess = 0;

        System.out.println("I\'m thinking of a number between 1 and 1000");
        System.out.print("Enter the number : ");
        guess = keyboard.nextInt();

        while (guess != secretNumber) {
            if (guess == 5)
                break;
            else {
                System.out.println("\nYou are wrong. Try again.");
                System.out.print("Enter the number : ");
                guess = keyboard.nextInt();
            }
        }
        if (guess != 5) {
            System.out.println("\nYou are correct. You win a prize!");
        }
        keyboard.close();
    }
}
