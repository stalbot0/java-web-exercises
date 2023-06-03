import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);
        // we can use format to re-format our value into a string.
        String newPi = String.format("%.2f", pi);
        System.out.printf("The value of pi is approximately %s%n", newPi);

        Scanner input = new Scanner(System.in); //System.in tells the scanner to use the keyboard

//        System.out.print("Enter an Integer: ");
//        int userInt = input.nextInt();
//        System.out.printf("Your integer is: %d%n", userInt);
//        //if the user enters something that is not an integer, we get errors bc of the int declaration
//        input.nextLine();

//        System.out.print("Please enter three words separated by one space each: ");
//        String userFirstWord = input.next();
//        String userSecondWord = input.next();
//        String userThirdWord = input.next();
//        System.out.printf("Your first word is %s%nYour second word is %s%nYour second word is %s%n", userFirstWord, userSecondWord, userThirdWord);
//        input.nextLine();

//        System.out.print("Please enter a sentence: ");
//        String userSentence = input.nextLine();
//        System.out.printf("You entered: %s%n", userSentence);
//        input.nextLine();

        System.out.print("Enter width: ");
//        String wid = input.nextLine();
//        double width = Double.parseDouble(wid);
        double width = input.nextDouble();

        System.out.print("Enter length: ");
//        String len = input.nextLine();
//        double length = Double.parseDouble(len);
        double length = input.nextDouble();

        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        System.out.printf("""
                Length: %.1f
                Width: %.1f
                Area: %.1f
                Perimeter: %.1f%n
                """
                , length, width, area, perimeter); //use triple quotes to use multiple lines, and gets rid of %n

//        input.useDelimiter("ouch"); //this allows us to denote what is used to separate tokens

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double volume = length * width * height;
        System.out.printf("The volume of the room is %.1f", volume);

        input.close();
    }
}
