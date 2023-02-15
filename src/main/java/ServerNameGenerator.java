import java.util.Random;

public class ServerNameGenerator {
    private static String[] adjectives = {"amicable", "understanding", "volatile", "insolent", "taciturn", "cordial", "reserved", "ominous", "bleak", "petulant",};

    private static String[] nouns = {"geese", "crime", "zebra", "insurance", "basketball", "flower", "cup", "wave", "wax", "songs",};

    private static Random randomNumGenerator = new Random();

    //gets random element from an array
    public static String randomElement(String[] passedArr) {
        int randomWord = randomNumGenerator.nextInt(passedArr.length);
        return passedArr[randomWord]; // returns the value of the passed arr at the random index
    }

    //creates the server name using randomElement()
    public static String serverName(String prompt, String[] arr1, String[] arr2) {
        String adjective = randomElement(arr1);
        String noun = randomElement(arr2);
        return prompt + "\n" + adjective + "-" + noun;
    }

    public static void main(String[] args) {
        System.out.println(serverName("Here is your server name:", adjectives, nouns));
    }

}
