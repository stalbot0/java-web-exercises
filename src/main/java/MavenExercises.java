import org.apache.commons.lang3.StringUtils;
import util.Input;

public class MavenExercises {
    private static Input input = new Input();

    public static void main(String[] args) {
        stringUtil();
    }

    public static void stringUtil() {
        System.out.format("Enter Something: ");
        String userInput = input.getString();
        System.out.format("You entered \"%s\"%n", userInput);

        boolean isNumeric = StringUtils.isNumeric(userInput);
        if (!isNumeric) {
            System.out.format("\"%s\" is not numeric%n", userInput);
        } else {
            System.out.format("\"%s\" is numeric%n", userInput);
        }

        String swappedCase = StringUtils.swapCase(userInput);
        System.out.format("Flipped case: \"%s\"%n", swappedCase);

        String reverse = StringUtils.reverse(userInput);
        System.out.format("Reversed: \"%s\"%n", reverse);
    }
}
