package org.launchcode;
import java.util.Scanner;
public class Mileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();
        System.out.println("How many gallons were used?");
        Double gasUsed = input.nextDouble();
        Double milesPerGal = miles / gasUsed;
        System.out.println("The trip miles-per-gallon was " + milesPerGal);
    }
}
