/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String text;
        double n, rate;
        System.out.print("How many euros are you exchanging? ");
        text = input.nextLine();
        n = Double.parseDouble(text);
        System.out.print("What is the exchange rate? ");
        text = input.nextLine();
        rate = Double.parseDouble(text);
        System.out.printf("%.0f euros at an exchange rate of %f is %.2f U.S. dollars.", n, rate, rate * n);

    }
}
