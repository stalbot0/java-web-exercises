package groceryList;

import java.util.*;

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
        return "Item - " + groceryName + ", Quantity - " + groceryQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Groceries groceries = (Groceries) o;
        return Objects.equals(groceryName, groceries.groceryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groceryName);
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
