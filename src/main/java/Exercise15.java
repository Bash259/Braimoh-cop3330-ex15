/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */


import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        String password = "Lionking23_";
        System.out.println("What  is the password?");
        Scanner UserInput = new Scanner(System.in);
        String Attempt = UserInput.nextLine();
        if (Attempt.equals(password)){
            System.out.println("Welcome!");
        }else {
            System.out.println("I don't know you");
        }
    }
}
