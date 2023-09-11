package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// te your code here
        MenuItem item1 = new MenuItem("Bison-Burger", "big and juicy", 16.99, "main course");
        MenuItem item2 = new MenuItem("Chips & Guacamole", "made fresh", 5.00, "appetizer");
        MenuItem item3 = new MenuItem("Banana Split", "vanilla ice-cream with ripe banana", 4.99, "dessert");
        MenuItem item4 = new MenuItem("Street Taco", "For the Streets",  2.99,  "main course");
        MenuItem item5 = new MenuItem( "Onion Soup",  "grandma's onion soup recipe", 100.99, "appetizer");



        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);
        System.out.println(menu);
        menu.removeItems(item4);
        System.out.println(menu);

        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem( "Onion Soup",  "grandma's onion soup recipe", 100.99, "appetizer");

        System.out.println(item5.equals(item6));

        menu.addItem(item6);
        System.out.println(menu);
    }
}
