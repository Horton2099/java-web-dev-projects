package org.launchcode;
import java.util.ArrayList;
import java.util.Objects;
import java.time.LocalDate;

public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();
    private LocalDate lastUpdated;
    private String category; // breakfast lunch dinner drink

//    public Menu(ArrayList<MenuItem> items, String lastUpdate, String venueName, String category) {
//        this.items = items;
//        this.lastUpdated = lastUpdate;
//        this.venueName = venueName;
//        this.category = category;
//    }


    public ArrayList<MenuItem> getItems() {

        return items;
    }
    public ArrayList<String> printItems() {
        ArrayList<String> anything = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            anything.add("Description: " + items.get(i).getDescription() + "$" + items.get(i).getPrice() + items.get(i).getCategory());
        }
        return anything;
    }




//    public void setItems(ArrayList<MenuItem> items) {
//        this.items = items;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }

    void addItem(MenuItem nItem) {
        String message = "Item already exists.";
        if(items.contains(nItem)) {
            System.out.println(message);
            return;
        }
        for(MenuItem item : items) {
            if (item.equals(nItem)) {
                System.out.println(message);
                return;
            }
        }
        items.add(nItem);
        lastUpdated = LocalDate.now();
    }

    void removeItems(MenuItem oItem) {
        items.remove(oItem);
        lastUpdated = LocalDate.now();
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item: items) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourse = new StringBuilder();
        for (MenuItem item: items) {
            if (item.getCategory().equals("main course")) {
                mainCourse.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item: items) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nOVER THE MOON\n" +
                "APPETIZERS" + appetizers.toString() + "\n" +
                "MAIN COURSES" + mainCourse.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n";
    }

}
