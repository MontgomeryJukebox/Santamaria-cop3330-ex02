/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the input string?");
        String input = in.nextLine();
        System.out.println(input + " has " + input.length() + " characters.");
    }
}