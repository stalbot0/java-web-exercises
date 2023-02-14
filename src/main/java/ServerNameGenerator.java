import java.util.Random;

public class ServerNameGenerator {
    private static String[] adjectives = {"amicable", "understanding", "volatile", "insolent", "taciturn", "cordial", "reserved", "ominous", "bleak", "petulant",};
    private static String[] nouns = {"geese", "crime", "zebra", "insurance", "basketball", "flower", "cup", "wave", "wax", "songs",};

    private static String randomElement(String[] passedArr) {
        Random randomGenerator = new Random();
        int randomWord = randomGenerator.nextInt(passedArr.length);
        return passedArr[randomWord]; // returns the value of the passed arr at the random index
    }

    public static String serverName(String[] arr1, String[] arr2) {
        String adjective = randomElement(arr1);
        String noun = randomElement(arr2);
        return adjective + "-" + noun;
    }

    public static void main(String[] args) {
        String firstServerName = serverName(adjectives, nouns);
        System.out.println(firstServerName);
    }

}
