package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }


    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo() {
        String booleanInput = scanner.next();
        scanner.nextLine();
        return booleanInput.equalsIgnoreCase("y") || booleanInput.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt(int min, int max, String prompt) {
        System.out.format(prompt);
        int userInt = scanner.nextInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("This is not a valid input.");
        }
        return getInt(min, max, prompt);
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.format("Enter a number between %f and %f: ", min, max);
        double userDouble = scanner.nextDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("This is not a valid input.");
        }
        return getDouble(min, max);
    }

    public double getDouble() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }
}