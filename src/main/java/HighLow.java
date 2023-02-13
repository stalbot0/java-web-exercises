import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess what my number is..");
        int highLow = HighLow.randomNum();
    }

    public static int randomNum() {
        Scanner input = new Scanner(System.in);
        Random newRandomNum = new Random();
        int newestRandomNum = newRandomNum.nextInt(100) + 1;
//        System.out.println(newestRandomNum);

        boolean goodGuess = true;
        do {
            int userNum = MethodsExercises.getInteger(1, 100);

            if (userNum == newestRandomNum) {
                System.out.printf("GOOD GUESS!, %d was my number!", newestRandomNum);
                break;
            } if (userNum > newestRandomNum) {
                System.out.println("LOWER");
            } if (userNum < newestRandomNum) {
                System.out.println("HIGHER");
            }
        } while (true);
        return newestRandomNum;
    }
}
