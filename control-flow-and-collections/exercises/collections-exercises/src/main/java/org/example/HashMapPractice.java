package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<String, Integer> students  = new HashMap<>();

        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter student Name or ENTER to finish: ");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                students.put(newStudent, newID);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        System.out.println("\nClass roster: ");

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
        System.out.println("Roster size: " + students.size());
    }
}
