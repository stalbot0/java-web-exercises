package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    private static Movie[] movies;

    public static void main(String[] args) {
        //set all movies to new movies array variable
        movies = MoviesArray.findAll();

        //open up the user input from the input class
        Input userInput = new Input();

        do {
            //print menu for all movie categories
            printMenu();

            // getChoice from the user
            int userChoice = userInput.getInt(0, 7, "Enter your choice: ");

            //do whatever the user chooses
            doUserChoice(userChoice);
            if (userChoice == 0) {
                break;
            }
        } while (true);
    }

    //print the menu
    public static void printMenu() {
        System.out.println("""
                
                What would you like to do?
                                    
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the sci-fi category
                6 - view movies in the musical category
                7 - view movies in the comedy category
                """);
    }

    private static void checkAndDisplayCategory(String category) {
        //loop through each movie
        System.out.printf("Displaying all %s movies...%n", category);
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName());
            }
        }
    }

    public static void doUserChoice(int userNum) {
        if (userNum == 1) {
            System.out.println("Displaying all movies...");
            System.out.println(Arrays.toString(movies));
        } else if (userNum == 2) {
            checkAndDisplayCategory("animated");
        } else if (userNum == 3) {
            checkAndDisplayCategory("drama");
        } else if (userNum == 4) {
            checkAndDisplayCategory("horror");
        } else if (userNum == 5) {
            checkAndDisplayCategory("scifi");
        } else if (userNum == 6) {
            checkAndDisplayCategory("musical");
        } else if (userNum == 7) {
            checkAndDisplayCategory("comedy");
        } else {
            System.out.println("Bye!");
            System.exit(0);
        }
    }

}
