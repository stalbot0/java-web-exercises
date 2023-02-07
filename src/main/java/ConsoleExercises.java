import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);
//        // we can use format to re-format our value into a string.
//        String newPi = String.format("%.2f", pi);
//        System.out.printf("The value of pi is approximately %s%n", newPi);
//
        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter an Integer: ");
//        int userNum = input.nextInt();
//        System.out.printf("Your integer is: %d%n", userNum);
//        //if the user enters something that is not an integer, we get errors bc of the int declaration
//
//        input.nextLine();
//
//        System.out.print("Please enter three words separated by one space each: ");
//        String userFirstWord = input.next();
//        String userSecondWord = input.next();
//        String userThirdWord = input.next();
//
//        System.out.printf("Your first word is %s%n", userFirstWord);
//        System.out.printf("Your second word is %s%n", userSecondWord);
//        System.out.printf("Your third word is %s%n", userThirdWord);
//
//        input.nextLine();
//
//        System.out.print("Please enter a sentence: ");
//        String userSentence = input.nextLine();
//        System.out.printf("You entered: %s%n", userSentence);
//
//        input.nextLine();

        System.out.print("Please enter the length AND width AND height of your classroom in feet: ");
        double roomLength = input.nextDouble();
        double roomWidth = input.nextDouble();
        double roomHeight = input.nextDouble();
        double roomArea = roomLength * roomWidth * roomHeight;

        input.nextLine();

        System.out.printf("The area of your room is %.2fft %n", roomArea);

        //currently does not work with decimals
        input.close();
    }
}

//    //NOTES FROM LECTURE
////        int a = 5;
////        String myName = "Stephen";
////        double c = 12.57;
////
////        System.out.println("Howdy " + myName + ", age: " + a + " makes " + c + " bucks per hour");
////        System.out.printf("Howdy %s, age: %d makes %f bucks per hour%n", myName, a, c);
//    Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter your age: ");
//
//                int age = input.nextInt();
//                System.out.println("Your age is " + age);
//
//                input.nextLine(); //this resets the "enter" key so that the console won't run through to completion. Comment this out and run it to see what I mean
//
//                System.out.print("Enter your name: ");
//
////        String aName = input.next();
////        System.out.println("Your first name is: " + aName);
////
////        aName = input.next();
////        System.out.println("Your last name is: " + aName);
//
//                String newName = input.nextLine();
//                System.out.println("Your name is " + newName);
//
////        System.out.print("Enter your age: ");
////
////        int age = input.nextInt();
////        System.out.println("Your age is " + age);
//
//                input.close(); // close the program when finished with it
////create the scanner outside the loop, and close it outside the loop
