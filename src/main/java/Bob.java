import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);
        String byeBob;
        System.out.println("Start a conversation with Bob...");
        do {
            System.out.print("You: ");
            byeBob = bob.nextLine();

            String bobsResponse;
            if (byeBob.endsWith("?")) {
                bobsResponse = "Bob: Sure.";
            } else if (byeBob.endsWith("!")) {
                bobsResponse = "Bob: Whoa. Chill out!";
            } else if (byeBob.trim().length() == 0) {
                bobsResponse = "Bob: Fine, be that way!";
            } else {
                bobsResponse = "Bob: Whatever.";
            }
            System.out.println(bobsResponse);

            if(byeBob.equalsIgnoreCase("bye")) {
                System.out.println("Bob: Bye, nerd.");
                break;
            }
        } while (true);
    }
}
