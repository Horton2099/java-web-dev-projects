package org.launchcode;

import java.util.Scanner;

public class milesPerGal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("How many miles were driven?");
        Double miles = input.nextDouble();

        System.out.println("How gallons of gas was consumed?");
        Double gas = input.nextDouble();

        input.close();

        Double mpg = miles / gas;

        System.out.println("Miles per Gallon = " + mpg);
    }
}
