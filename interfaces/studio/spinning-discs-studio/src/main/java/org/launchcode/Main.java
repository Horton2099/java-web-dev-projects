package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd1 = new CD("Stairs", 234, 2500, "audio disk");
        DVD dvd1 = new DVD("Boondock Saints", 234, 2300, "DVD");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        cd1.spinDisc();
        System.out.println(cd1.readData());

    }
}