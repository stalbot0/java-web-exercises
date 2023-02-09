import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);
        System.out.println("Start a conversation with Bob...");
        do {
            System.out.print("You: ");
            String askingBob = bob.nextLine();

            String bobsResponse;
            if (askingBob.endsWith("?")) {
                bobsResponse = "Bob: Sure.";
            } else if (askingBob.endsWith("!")) {
                bobsResponse = "Bob: Whoa. Chill out!";
            } else if (askingBob.length() == 0) {
                bobsResponse = "Bob: Fine, be that way!";
            } else {
                bobsResponse = "Bob: Whatever.";
            }
            System.out.println(bobsResponse);

            System.out.print("Continue the conversation? [Yes/No]: ");
            String contConvo = bob.nextLine();

            if(contConvo.equalsIgnoreCase("no")) {
                System.out.println("Bob: Bye, nerd.");
                break;
            }
        } while (true);
    }
}
