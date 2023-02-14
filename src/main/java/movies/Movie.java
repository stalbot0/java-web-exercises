package movies;

import util.Input;

import java.util.Arrays;

public class Movie {

    private String name;
    private String category;

    public Movie() {
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    //accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
