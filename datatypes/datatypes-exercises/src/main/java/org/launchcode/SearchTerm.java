package org.launchcode;
import java.util.Scanner;
public class SearchTerm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        System.out.println("Search for term in text.");
        String searchTerm = input.nextLine();
        if(aliceText.toLowerCase().contains(searchTerm.toLowerCase())){
            System.out.println("Search Term Found!");
            System.out.println(aliceText.indexOf(searchTerm) + " | " + searchTerm.length());
            String newSentence = aliceText.toLowerCase().replace(searchTerm.toLowerCase(), "");
            System.out.println(newSentence);
        } else System.out.println("Search Term not Found");

    }
}
