import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        //LOOP BASICS
//        //while
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%d ", i);
//            i++;
//        }
//        System.out.println();
//
//        //do-while
//        i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//
//        } while(i >= -10);

//        int j = 2;
//        System.out.println(j);
//        do {
//            j = (int) Math.pow(j, 2);
//            System.out.println(j);
//        }
//        while (Math.pow(j, 2) < 1000000);
//
//        //for
//        for (int k = 5; k <= 15; k++) {
//            System.out.printf("%d ", k);
//        }
//        System.out.println();
//
//        for (int i = 0; i <= 100 ; i+=2) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i > =10 ; i-=5) {
//            System.out.println(i);
//        }
//
//        for (long l = 2; l <= 65536; l*=l) {
//            System.out.println(l);
//        }
//
//        //FIZZBUZZ
//        for (int m = 1; m <= 100; m++) {
//            if ((m % 3 == 0) && (m % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (m % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (m % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(m);
//            }
//        }

        //TABLE OF POWERS
        Scanner input = new Scanner(System.in);
//        String userChoice;
//        boolean userContinue = true;
//
//        do {
//            //printing the table of powers based on the user input
//            System.out.print("Would you like to continue? [Y/N]: ");
//            userChoice = input.nextLine();
//
//            if (userChoice.equalsIgnoreCase("Y")) {
//                System.out.print("Enter an Integer: ");
//                String userInput = input.nextLine();
//                int userNum = Integer.parseInt(userInput);
//
//                System.out.println("""
//                        number | squared | cubed
//                        -------|---------|------""");
//
//                for (int n = 1; n <= userNum; n++) {
//                    int square = (int) Math.pow(n, 2);
//                    int cubed = (int) Math.pow(n, 3);
//                    System.out.printf("""
//                                    %-6d | %-7d | %d%n"""
//                            , n, square, cubed);
//                }
//
//            } else {
//                userContinue = false;
//            }
//        } while (userContinue);
//
//        input.close();


        //CONVERT NUMBER GRADES TO LETTER GRADES
//        input = new Scanner(System.in);
        input.nextLine();
        do {
            System.out.println("Enter a grade: ");
            int grade = Integer.parseInt(input.nextLine());
            input.nextLine(); //clears out the new line of the buffer
            String letterGrade = "F";
            if (grade >= 88) {
                letterGrade = "A";
            } else if (grade >= 80) {
                letterGrade = "B";
            } else if (grade >= 67) {
                letterGrade = "C";
            } else if (grade >= 60) {
                letterGrade = "D";
            }
            System.out.println(letterGrade);

            System.out.print("Continue? ");
            String keepGoing = input.nextLine();
            if (!keepGoing.equalsIgnoreCase("yes")) {
                break;
            }
        } while (true);

        input.close();
    }

}


//        ////NOTES FROM LECTURE
////        int age = -1;
////        String name = null; //initialize it
////        if(name == null) {
////            System.out.println("Invalid name");
////        } else {
////            System.out.println("Name is ok");
////        }
//
//        Scanner input = new Scanner("Bob45678910");
//        String myName = "Bob"; //points to string literal
//        String otherName = input.next(); //points to whatever is created a run-time in a different space in memory
//        //this is comparing different memory addresses
//
////        System.out.println(myName == otherName);
////
////        otherName = myName;
////        System.out.println(myName == otherName);
//
////        System.out.println(myName.equals(otherName)); //equals method checks the content of the strings, not where they are stored in space
//        //we will be able to make our own equals methods
//        //if else
//        if(otherName.length() > 10) {
//            System.out.println("Long Boi");
//        } else if(otherName.length() < 2) {
//            System.out.println("Not Long Boi :/");
//        } else {
//            System.out.println("Normal ig");
//        }
//
////        //switch statements  with lambda (automatically breaks)
////        String msg; //initialize variable
////        switch (otherName.length()) {
////            case 10, 11 -> msg = "Long Boi";
////            case 2 -> {
////                msg = "Sorry, smol guy";
////            }
////            default -> msg = "Normal ig";
////        }
////        System.out.println(msg);
//
//        //different way to write the switch expression  above
//        String msg2 = switch (otherName.length()) {
//            case 10, 11 -> "Long Boi";
//            case 2 -> "Sorry, smol guy";
//            default -> "Normal ig";
//        };
//        System.out.println(msg2);
//
//        input.close();
//
//        Scanner input2 = new Scanner(System.in);
//
//        //do-while loops
//        String choice = "";
//        boolean done = false;
//        //ask user for a choice until they choose quit
//        do {
//            //prompt the user to make a choice
//            System.out.print("Make a choice: ");
//            //get the choice via scanner
//            choice = input2.nextLine();
//            System.out.printf("You entered %s%n", choice);
//
//            //determine if we are done
//            if (choice.equals("quit")) {
//                done = true;
//            }
//
//        } while (!done);
//
//
//
//        input2.close();
//    }