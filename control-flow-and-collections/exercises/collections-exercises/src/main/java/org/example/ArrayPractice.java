package org.example;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

import static org.example.ArrayListPractice.sumEven;
import static org.example.ArrayListPractice.wordPrint;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] myNum = {1, 1, 2, 3, 5, 8};

        for (int i : myNum) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
        String poem = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] newPoem = poem.split("\\.");
        System.out.println(Arrays.toString(newPoem));

        String betterPoem = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] elements = betterPoem.split(" ");
        ArrayList<String> newList = new ArrayList<>(Arrays.asList(elements));

        ArrayList<Integer> bestNums = new ArrayList<>(Arrays.asList(12, 23, 43, 234, 234, 23, 23, 2, 2, 4, 1, 24));
        int newVar = bestNums.get(2);
        System.out.println(sumEven(bestNums));
//        bestNums.addAll(Arrays.asList(3, 4, 2, 65, 3, 2, 6, 3, 5, 234));

        System.out.println(wordPrint(newList));
    }
}
