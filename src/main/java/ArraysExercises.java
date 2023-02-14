public class ArraysExercises {
    private String name;
    private int age;
    private String favoriteFood;

    public ArraysExercises() {
        this("", 0, "");
    }

    public ArraysExercises(String name, int age, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    //accessors (getters and setters)
    public static void main(String[] args) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }
}
