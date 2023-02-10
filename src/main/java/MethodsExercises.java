import java.util.Scanner;

public class MethodsExercises {

    //1. basic arithmetic
    public static int addition(int int1, int int2) {
        return int1 + int2;
    }

    public static int subtraction(int int1, int int2) {
        return int1 - int2;
    }

    public static int multiplication(int int1, int int2) {
        return int1 * int2;
    }

    public static int division(int int1, int int2) {
        if (int2 == 0) {
            return 0;
        }
        return int1 / int2;
    }

    public static int modulus(int int1, int int2) {
        return int1 % int2;
    }

    //si or no?
    public static boolean yesOrNo() {
        Scanner yesOrNoInput = new Scanner(System.in);
        System.out.print("Would you like to continue? [Yes/No]: ");
        String userInput = yesOrNoInput.nextLine();
        if(userInput.equalsIgnoreCase("yes")) {
            return true;
        } else if (userInput.equalsIgnoreCase("no")) {
            return false;
        } else {
            System.out.println("This is not a valid input");
            return yesOrNo();
        }
    }

    //2. method validation
    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInt = input.nextInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        return getInteger(min, max);
    }

    //3. calculate factorial
    public static long calcFactorial(int userInput) {
        long factorial;
        factorial = 1;
        for (int i = 1; i <= userInput; i++) {
            factorial *= i;
        }
        return factorial;
    }
//re-factor to use recursion
//        int userInput;
//        long factorial;
//
//        System.out.print("Enter an integer between 1 and 10: ");
//        userInput = input.nextInt();
//        if (userInput >= min && userInput <= max) {
//            factorial = 1;
//            for (int i = 1; i <= userInput; i++) {
//                factorial *= i;
//            }
//            return factorial;
//        }
//        return calcFactorial(min, max);
//    }
    //4. dice-roller

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1
        System.out.println(MethodsExercises.addition(1, 0));
        System.out.println(MethodsExercises.subtraction(8, 6));
        System.out.println(MethodsExercises.multiplication(1, 3));
        System.out.println(MethodsExercises.division(16, 4));
        System.out.println(MethodsExercises.modulus(15, 3));

//        //2
//        int userInput = MethodsExercises.getInteger(1, 10);
//        System.out.println("This is your number: " + userInput);

//        //3
//        long factorial = MethodsExercises.calcFactorial(userInput);
//        System.out.println("This is your factorial: " + factorial);

        //2 and 3 combined
        boolean yesNoMaybe;
        do {
            int userInput = MethodsExercises.getInteger(1, 10);
            System.out.println("This is your number: " + userInput);
            long factorial = MethodsExercises.calcFactorial(userInput);
            System.out.println("This is your factorial: " + factorial);
            yesNoMaybe = yesOrNo();
        } while (yesNoMaybe);

        //4
    }


}
