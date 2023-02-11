import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int userNum = MethodsExercises.getInteger(1, 100);
        int highLow = HighLow.randomNum();
    }

    public static int randomNum() {
        Scanner userGuess = new Scanner(System.in);
        int randomNum = (int) Math.round(Math.random() * (100 - 1) + 1);
        int userGuessNum = userGuess.nextInt();
        boolean goodGuess = true;
        do {
            if (randomNum == userGuessNum) {
                System.out.println("GOOD GUESS!");
            } else if (userGuessNum > randomNum) {
                System.out.println("LOWER");
            } else {
                System.out.println("HIGHER");
            }
        } while (!goodGuess);
        return userGuessNum;
    }

}
