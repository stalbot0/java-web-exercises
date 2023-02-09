import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);
        do {
            System.out.print("Say or ask ANYTHING to Bob: ");
            String askingBob = bob.nextLine();

            String bobsResponse;
            if (askingBob.endsWith("?")) {
                bobsResponse = "Bob: Sure.";
            } else if (askingBob.endsWith("!")) {
                bobsResponse = "Bob: Whoa. Chill out!";
            } else if (askingBob.length() == 0) {
                bobsResponse = "Fine, be that way!";
            } else {
                bobsResponse = "Whatever.";
            }
            System.out.println(bobsResponse);

            System.out.println("Continue the conversation? [Yes/No]");
            String contConvo = bob.nextLine();
            if(!contConvo.equalsIgnoreCase("yes")) {
                System.out.println("Bob: Bye, nerd.");
                break;
            }
        } while (true);
    }
}
