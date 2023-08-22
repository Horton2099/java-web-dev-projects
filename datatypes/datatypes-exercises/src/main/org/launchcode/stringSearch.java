package org.launchcode;

import java.util.Scanner;
public class stringSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        System.out.println("What term would you like to search for?");
        String searchTerm = input.next();
        input.close();
        if(sentence.contains(searchTerm)) {
            System.out.println("Term Found!");
        } else {
            System.out.println("Term not Found.");
        }
    }
}
