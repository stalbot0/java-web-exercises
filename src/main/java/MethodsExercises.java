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

    //si or no for validation
    public static boolean yesOrNo() {
        Scanner yesOrNoInput = new Scanner(System.in);
        String userInput = yesOrNoInput.nextLine();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("This is not a valid input");
            return yesOrNo();
        }
    }

    //2. method validation
    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInt = input.nextInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("This is not a valid input.");
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
//   re-factor to use recursion
//    public static long factorialRecursion(int userNum) {
//        if (userNum == 1) {
//            return 1;
//        }
//        return calcFactorial(userNum - 1) * userNum;
//    }

    //4. dice-roller
    public static void getRandomDieNum() {
        Scanner rollingDice = new Scanner(System.in);
        int dieMin = 1;
        int sides = rollingDice.nextInt();
        System.out.println("Rolling the Dice...");
        int randomDie = (int) Math.floor(Math.random() * (sides - dieMin) + dieMin);
        int randomDie2 = (int) Math.floor(Math.random() * (sides - dieMin) + dieMin);
        String result1 = ("Die 1 rolled a " + randomDie);
        String result2 = ("Die 2 rolled a " + randomDie2);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1
        System.out.println(MethodsExercises.addition(1, 0));
        System.out.println(MethodsExercises.subtraction(8, 6));
        System.out.println(MethodsExercises.multiplication(1, 3));
        System.out.println(MethodsExercises.division(16, 4));
        System.out.println(MethodsExercises.modulus(17, 6));

        //2 and 3 combined (verification and calculating factorial)
        boolean yesNoMaybe;
        do {
            int userInput = MethodsExercises.getInteger(1, 10);
            System.out.println("Your number: " + userInput);
            long factorial = MethodsExercises.calcFactorial(userInput);
            System.out.println("Factorial: " + factorial);
            System.out.print("Would you like to continue? [Y/N]: ");
            yesNoMaybe = yesOrNo();
        } while (yesNoMaybe);
//        System.out.println(factorialRecursion(3));

        //4 (rolling the dice)
        do {
            System.out.println("How many sides do you want your dice to have?");
            getRandomDieNum();
            System.out.print("Want to roll again? [Y/N]: ");
            yesNoMaybe = yesOrNo();
        } while (yesNoMaybe);
        System.out.println("Done Rolling!");

    }

}
