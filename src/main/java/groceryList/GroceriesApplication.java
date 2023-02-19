package groceryList;

import util.Input;

import java.util.*;

public class GroceriesApplication {
    private static Input input = new Input();

    private static ArrayList<Groceries> allGroceries = new ArrayList<>();

    private static ArrayList<String> groceryCategories = new ArrayList<>(List.of("Bakery & Bread", "Meat & Seafood", "Pasta & Rice", "Cereals & Breakfast Foods", "Oils, Sauces, Salad Dressings, & Condiments", "Soups & Canned Goods", "Frozen Foods", "Dairy, Cheese & Eggs"));

    public static void main(String[] args) {
        userCreateList();
    }

    //prompts the user if they want to create the list, and if yes runs userEnterItem() method
    public static void userCreateList() {
        if (input.yesNo("Would you like to create a grocery list?")) {
            userEnterItem();
        } else {
            System.out.println("K Bye");
        }
    }

    //prompts the user if they want to create the list, and if yes prints the list, asks them to enter the name and quantity
    public static void userEnterItem() {
        if (input.yesNo("Would you like to enter a new item?")) {
            printGroceryCategories(groceryCategories);
            createGroceryObject();
            userEnterItem();
        } else {
            int userChoice = input.getInt(1, 3, "Would you like to...\n1. Finalize the list\n2. Add an item\n3. Exit\n\nEnter Option: ");
            if (userChoice == 1) {
                System.out.println("Grocery List");
                printAllGroceries();
            } else if (userChoice == 2) {
                userEnterItem();
            } else {
                System.out.println("Goodbye!");
                System.exit(0);
            }
        }
    }

    //creates grocery object from user input
    public static Groceries createGroceryObject() {
        Groceries groceryObj = new Groceries();
        int userCategory = input.getInt(1, 8, "\nEnter your desired category number: ");
        groceryObj.setGroceryCategory(groceryCategories.get(userCategory - 1));

        input.getString();
        String userGrocery = input.getString("Enter a name: ");
        groceryObj.setGroceryName(userGrocery);

        System.out.println("Enter a quantity: ");
        int userQuantity = input.getInt();
        groceryObj.setGroceryQuantity(userQuantity);

        allGroceries.add(groceryObj);
        return groceryObj;
    }

    //prints the arraylist of grocery categories
    public static void printGroceryCategories(ArrayList<String> passedArr) {
        for (String category : passedArr) {
            System.out.format("%s. %s%n", passedArr.indexOf(category) + 1, category);
        }
    }

    //prints entire list of grocery objects
    public static void printAllGroceries() {
        for (Groceries grocery : allGroceries) {
            System.out.printf("◘ Item: %s, Quantity: %d, Category: %s%n", grocery.getGroceryName(), grocery.getGroceryQuantity(), grocery.getGroceryCategory());
        }
    }
}
