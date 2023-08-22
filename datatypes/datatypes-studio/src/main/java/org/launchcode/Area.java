package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius;
        
        while (true)  {
            System.out.println("Enter a radius: ");
            radius = input.nextDouble();
            if ((radius < 0 || Double.isNaN(radius))) {
                System.out.println("Enter valid input.");
            } else {
                break;
            }


        }
        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

        input.close();
    }
}
