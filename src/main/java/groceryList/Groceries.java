package groceryList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Groceries {
    private String groceryName;
    private int groceryQuantity;
    private String groceryCategory;

    public Groceries() {
    }

    public Groceries(String name, int quantity, String category) {
        this.groceryName = name;
        this.groceryQuantity = quantity;
        this.groceryCategory = category;
    }

    @Override
    public String toString() {
        return "Item - " + groceryName + ", Quantity - " + groceryQuantity + ", Category - " + groceryCategory;
    }

    //accessors
    public String getGroceryName() {
        return groceryName;
    }

    public void setGroceryName(String groceryName) {
        this.groceryName = groceryName;
    }

    public int getGroceryQuantity() {
        return groceryQuantity;
    }

    public void setGroceryQuantity(int groceryQuantity) {
        this.groceryQuantity = groceryQuantity;
    }

    public String getGroceryCategory() {
        return groceryCategory;
    }

    public void setGroceryCategory(String groceryCategory) {
        this.groceryCategory = groceryCategory;
    }
}
