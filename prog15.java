/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Objects;
import java.util.Scanner;

public class prog15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password = "abc$123";

        System.out.print("What is the password? ");
        String unknown = in.nextLine();

        if (!Objects.equals(unknown, password)) {
            System.out.println("I don't know you.");
        }
        else {
            System.out.println("Welcome!");
        }
    }
}
