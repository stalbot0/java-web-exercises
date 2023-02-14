package movies;

import util.Input;

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
            int userChoice = userInput.getInt(0, 5, "Enter your choice: ");

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

    private static void checkCategory(String category) {
        //loop through each movie
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.format("""
                        Showing all %s movies..
                        %s --- %s%n""", movie.getCategory(), movie.getName(), movie.getCategory());
            }
        }
    }

    public static void doUserChoice(int userNum) {
        if (userNum == 1) {
            System.out.println(movies);
        } else if (userNum == 2) {
            checkCategory("animated");
        } else if (userNum == 3) {
            checkCategory("drama");
        } else if (userNum == 4) {
            checkCategory("horror");
        } else if (userNum == 5) {
            checkCategory("scifi");
        } else if (userNum == 6) {
            checkCategory("musical");
        } else if (userNum == 7) {
            checkCategory("comedy");
        } else {
            System.out.println("Bye!");
            System.exit(0);
        }
    }

}
