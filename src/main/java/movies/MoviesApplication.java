package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    private static Movie[] movies;

    private static Input userInput = new Input();

    public static void main(String[] args) {
        //set all movies to new movies array variable
        movies = MoviesArray.findAll();
        //open up the user input from the input class
        userInput = new Input();

        do {
            //print menu for all movie categories
            printMenu();
            // getChoice from the user
            int userChoice = userInput.getInt(0, 8, "Enter your choice: ");
            //do whatever the user chooses
            doUserChoice(userChoice);
            if (userChoice == 0) {
                break;
            }
        } while (true);
    }

    //print the menu
    private static void printMenu() {
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
                8 - add a movie
                """);
    }

    private static void displayAllMovies() {
        System.out.println("Displaying all movies...");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private static void displayMoviesByCategory(String category) {
        //loop through each movie
        System.out.printf("Displaying all %s movies...%n", category);
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie);
            }
        }
    }

    private static void addMovie() {
        String movieName = userInput.getString("Enter a movie name: ");
        String movieCategory = userInput.getString("Enter a movie category: ");

        //overwrite movies with new copy of movies with added movie
        Movie movie = new Movie(movieName, movieCategory);
        movies = Arrays.copyOf(movies, movies.length + 1);
        movies[movies.length - 1] = movie;
    }

    private static void doUserChoice(int userNum) {
        if (userNum == 1) {
            displayAllMovies();
        } else if (userNum == 2) {
            displayMoviesByCategory("animated");
        } else if (userNum == 3) {
            displayMoviesByCategory("drama");
        } else if (userNum == 4) {
            displayMoviesByCategory("horror");
        } else if (userNum == 5) {
            displayMoviesByCategory("scifi");
        } else if (userNum == 6) {
            displayMoviesByCategory("musical");
        } else if (userNum == 7) {
            displayMoviesByCategory("comedy");
        } else if (userNum == 8) {
            userInput.getString(); //get new line out of buffer
            addMovie();
        } else {
            System.out.println("Bye!");
            System.exit(0);
        }
    }

}
