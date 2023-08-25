package org.example;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Avari\\Desktop\\LC Project\\javaDevProjects\\control-flow-and-collections\\exercises\\counting-characters\\src\\main\\java\\org\\example\\test.txt";

        try {
            File newFile = new File(fileName);
            Scanner scanner = new Scanner(newFile);

            StringBuilder content = new StringBuilder();
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("\n");
            }
            String fileContent = content.toString();
            char[] charactersInString = fileContent.toLowerCase().toCharArray();

            HashMap<Character, Integer> charCounts = new HashMap<>();

            for (Character c : charactersInString) {
                if(!Character.isDigit(c))charCounts.put(c, charCounts.getOrDefault(c, 0) +1);
            }

            for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
           scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




//        System.out.println("Input words.");
//        String userText = input.nextLine();

//        String newText = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

//        char[] charactersInString = fileContent.toLowerCase().toCharArray();
//
//        HashMap<Character, Integer> charCounts = new HashMap<>();
//
//        for (Character c : charactersInString) {
//            if(!Character.isDigit(c))charCounts.put(c, charCounts.getOrDefault(c, 0) +1);
//        }
//
//        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
    }
}
