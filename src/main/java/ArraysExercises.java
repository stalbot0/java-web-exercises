import util.Input;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class ArraysExercises {
    public static void main(String[] args) {
        //1. array basics
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Stephen");
        people[1] = new Person("Shawn");
        people[2] = new Person("Tyler RIP");

        System.out.println(Arrays.toString(people));
        getArrElementNum(people.length);

        System.out.println();

        Person JohnBoy = new Person("JohnBoy");
        Person JimmyBoy = new Person("JimmyBoy");

        people = addPerson(people, JohnBoy);
        people = addPerson(people, JimmyBoy);

        System.out.println(Arrays.toString(people));
        getArrElementNum(people.length);

    }

    //accepts array of person objects
    //accepts a single person object to add to the passed array
    //returns an array whose length is 1 greater than the passed around, with the passed person object at the end of the array
    public static Person[] addPerson(Person[] passedArr, Person newPerson) {
        Person[] newArr = Arrays.copyOf(passedArr, passedArr.length + 1);
        newArr[newArr.length - 1] = newPerson;;
        return newArr;
    }

    public static void getArrElementNum(int arrLength) {
        System.out.printf("Number elements in the array: %d%n", arrLength);
    }
}

