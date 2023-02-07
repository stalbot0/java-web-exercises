package hello;

public class HelloWorld {
    public static void main(String[] args) { // <'main'> <tab>
        // void means it doesn't return anything, this is the entry point into this program
        // Intro to Java Exercise
        System.out.println("Hello World");
        System.out.print("Hello World\n"); // <'sout'> <tab> creates this -- similar to console.log()
        System.out.println("Hello World");

        //Syntax, Types, and Variables Exercise
        int myFavoriteNumber = 44;
        System.out.println(myFavoriteNumber);

        String myString = "This is a string,\nand my name is Stephen";
        System.out.println(myString);

        long myNumber = 123; // we can not assign float to this because it is not a single precision floating point
        System.out.println(myNumber);
        float newMyNumber = (float) myNumber; // so we can re-assign the value from long to float
        System.out.println(newMyNumber);

//        int x = 5; //created variable for x
//        System.out.println(x++); //prints the value of x THEN increments
//        System.out.println(x); //prints the value of x following incrementation

//        int y = 5; //created variable for y
//        System.out.println(++y); //returns the increment THEN the value of y
//        System.out.println(y); //prints value of y following incrementation

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        byte mostReventByte = 127;
        mostReventByte++;
        System.out.println(mostReventByte);
    }
}
//the target folder is always changing as we change our program. We don't share the target folder when we push to github
