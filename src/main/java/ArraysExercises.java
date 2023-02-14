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

        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.format("Number of elements in the array: %d%n", people.length);

        System.out.println();

        Person JohnBoy = new Person();
        JohnBoy.setName("Johnny Boy");

        Person JimmyBoy = new Person();
        JimmyBoy.setName("Jimmy Boy");

        people = addPerson(people, JohnBoy);
        people = addPerson(people, JimmyBoy);

        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.format("Number of elements in the array: %d%n", people.length);

    }

    //accepts array of person objects
    //accepts a single person object to add to the passed array
    //returns an array whose length is 1 greater than the passed around, with the passed person object at the end of the array
    public static Person[] addPerson(Person[] passedArr, Person newPerson) {
        passedArr = Arrays.copyOf(passedArr, passedArr.length + 1);
        passedArr[passedArr.length - 1] = newPerson;;
        return passedArr;
    }

}

