package org.launchcode;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is length of rectangle?");
        int length = input.nextInt();
        System.out.println("What is the width of rectangle?");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("Area of rectangle = " + area);
    }
}
