package org.launchcode;

import java.util.Scanner;

public class AreaReq {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the Length of Rectangle: ");
        length = input.nextInt();

        input = new Scanner(System.in);
        System.out.println("Enter the Width of Rectangle ");
        width = input.nextInt();

        input.close();

        area = length * width;
        System.out.println("The area of the rectangle is " + area + "sq. ft.");
    }
}
