import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static int randomNum() {
//        Scanner input = new Scanner(System.in); // we can remove the scanner because the other public methods have a new Scanner in each
        Random newRandomNum = new Random();
        int newestRandomNum = newRandomNum.nextInt(100) + 1;
//        System.out.println(newestRandomNum); // output random num to ensure that our method is working
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess what my number is.. You have 5 tries. ");
        boolean goodGuess = true;
        int userGuess = 0;
        do {
            int userNum = MethodsExercises.getInteger(1, 100);

            if (userNum == newestRandomNum) {
                System.out.printf("GOOD GUESS!, %d was my number!%n", newestRandomNum);
                break;
            } else if (userNum > newestRandomNum) {
                System.out.println("LOWER");
            } else {
                System.out.println("HIGHER");
            }
            userGuess++;

            if(userGuess > 5) {
                System.out.printf("Too many guesses, my number was %d", newestRandomNum);
                break;
            }
        } while (true);
        return newestRandomNum;
    }

    public static void main(String[] args) {
        int highLow = HighLow.randomNum();
    }
}
