package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }


    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String booleanInput = this.scanner.next();
        this.scanner.nextLine();
        return booleanInput.equalsIgnoreCase("y") || booleanInput.equalsIgnoreCase("yes");
    }

    int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInt = this.scanner.nextInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("This is not a valid input.");
        }
        return getInt(min, max);
    }

    int getInt() {
        System.out.print("Enter an integer: ");
        return this.scanner.nextInt();
    }

    double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f: ", min, max);
        double userDouble = Double.parseDouble(this.scanner.nextLine());
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("This is not a valid input.");
        }
        return getDouble(min, max);
    }

    public double getDouble() {
        System.out.print("Enter an integer: ");
        return this.scanner.nextDouble();
    }

    public static void main(String[] args) {
        Input myInput = new Input();

        System.out.println(myInput.getString());

        System.out.println(myInput.yesNo());

        myInput.getInt(1, 50);

        myInput.getInt();

        myInput.getDouble(1, 50);

        myInput.getDouble();
    }
}