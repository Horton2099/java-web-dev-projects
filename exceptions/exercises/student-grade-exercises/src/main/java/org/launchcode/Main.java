package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static int Divide(int x, int y)
    {
        if (y == 0) {
            try {
            throw new ArithmeticException("Y cannot equal zero.");
            } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
        return x / y;
    }

    public static int CheckFileExtension(String fileName)
    {
        int currentScore = 0;
        if (fileName.endsWith(".java")) {
            currentScore += 1;
        }
        if(fileName.isBlank()){
            currentScore -= 1;
            try {
                throw new IllegalArgumentException("Illegal File Extension");
            } catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }
        return currentScore;
    }
}