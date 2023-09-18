package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
                for (Flavor i : flavors) {
            System.out.println(i.getAllergens());
        }

        flavors.sort(new FlavorComparator());

        for (Flavor i : flavors) {
            System.out.println(i.getAllergens());
        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        for (Cone c : cones) {
            System.out.println(c.getCost());
        }

        cones.sort(new ConeComparator());

        for (Cone c : cones) {
            System.out.println(c.getCost());
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        // Sorting Toppings
        for (Topping t : toppings) {
            System.out.println(t.getName());
        }
        toppings.sort(new ToppingComparator());
        for (Topping t : toppings) {
            System.out.println(t.getName());
        }
    }
}