import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) { // <'main'> <tab>
        // void means it doesn't return anything, this is the entry point into this program
        // Intro to Java Exercise
//        System.out.println("Hello World");
//        System.out.print("Hello World\n");

//        System.out.println("Hello World");

        //Syntax, Types, and Variables Exercise
//        int myFavoriteNumber = 44;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "This is a string,\nand my name is Stephen";
//        System.out.println(myString);

//        myString = 'c'; //we can't do this because '' is a char value and not a string
//        myString = 3.14159; //we can't do this because 3.14159 is a double and not a string

//        long myNumber;
//        long myNumber = 3.14; //unable to do this because it is not a long type
//        long myNumber = 3.14; //L means long literal value. so the 123L fits into the long myNumber
//        System.out.println(myNumber); //we can't do this because we haven't declared a variable value for myNumber

//        float myNumber = (float) 3.14; // the f denotes a 4 byte float literal
//        System.out.println(myNumber);

//        int x = 5; //created variable for x
//        System.out.println(x++); //prints the value of x THEN increments
//        System.out.println(x); //prints the value of x following incrementation

//        int x = 5; //created variable for x
//        System.out.println(++x); //returns the increment THEN the value of y
//        System.out.println(x); //prints value of y following incrementation

//        String class; //unable to do this because class is a reserved word

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three); // strings can not be cast to integers

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);
//
//        byte mostReventByte = 127;
//        mostReventByte++;
//        System.out.println(mostReventByte);

        //NOTES FROM LECTURE
//        int a = 5;
//        String myName = "Stephen";
//        double c = 12.57;
//
//        System.out.println("Howdy " + myName + ", age: " + a + " makes " + c + " bucks per hour");
//        System.out.printf("Howdy %s, age: %d makes %f bucks per hour%n", myName, a, c);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = input.nextInt();
        System.out.println("Your age is " + age);

        input.nextLine(); //this resets the "enter" key so that the console won't run through to completion. Comment this out and run it to see what I mean

        System.out.print("Enter your name: ");

//        String aName = input.next();
//        System.out.println("Your first name is: " + aName);
//
//        aName = input.next();
//        System.out.println("Your last name is: " + aName);

        String newName = input.nextLine();
        System.out.println("Your name is " + newName);

//        System.out.print("Enter your age: ");
//
//        int age = input.nextInt();
//        System.out.println("Your age is " + age);


        input.close(); // close the program when finished with it

        //create the scanner outside the loop, and close it outside the loop
    }
}
