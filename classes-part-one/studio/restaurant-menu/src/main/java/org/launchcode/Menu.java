package org.launchcode;
import java.util.ArrayList;
import java.util.Objects;

public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();

    private String lastUpdate;
    private String venueName;
    private String category; // breakfast lunch dinner drink

    public Menu(ArrayList<MenuItem> items, String lastUpdate, String venueName, String category) {
        this.items = items;
        this.lastUpdate = lastUpdate;
        this.venueName = venueName;
        this.category = category;
    }


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




    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
