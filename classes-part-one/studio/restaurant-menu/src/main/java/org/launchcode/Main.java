package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// te your code here
        MenuItem iceCream = new MenuItem(1.99, "Creamy", "dessert", true);
        MenuItem chknFriedSteak = new MenuItem(1.99, "cooked to perfection", "dinner", false);
        MenuItem greenBeans = new MenuItem(1.97, "Really Green", "side", false);

        ArrayList<MenuItem> menuArray = new ArrayList<>();

        menuArray.add(iceCream);
        menuArray.add(chknFriedSteak);
        menuArray.add(greenBeans);

        Menu venueMenu = new Menu(menuArray, "8/28/23", "Under A Dollar", "dinner");

        System.out.println(venueMenu.getVenueName());
        System.out.println(venueMenu);
    }
}
