package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CharCount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input words.");
        String userText = input.nextLine();

//        String newText = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = userText.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (Character c : charactersInString) {
            if(!Character.isDigit(c))charCounts.put(c, charCounts.getOrDefault(c, 0) +1);
        }

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
