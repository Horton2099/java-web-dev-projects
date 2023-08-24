package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arrayList) {
        int sum = 0;
            for (int i : arrayList) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
        return sum;
    }

    public static ArrayList<String> wordPrint(ArrayList<String> list) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is length of word you want to search? ");
        int input = in.nextInt();
        ArrayList<String> newList = new ArrayList<>();
        for (String i : list) {
            if(i.length() == input) newList.add(i);
        }
        return newList;
    }
}
