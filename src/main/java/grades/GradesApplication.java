package grades;

import util.Input;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;


public class GradesApplication {

    private Random random = new Random();
    private int randomGrade = random.nextInt(100) + 1;
    private static Input input = new Input();

    public static void main(String[] args) {
        //keys represent GitHub usernames, values are the students themselves
        HashMap<String, Student> students = new HashMap<>();

        Student stalbot0 = new Student("Stephen Talbot");
        createStudentGrades(stalbot0, 99, 98, 70);
        students.putIfAbsent("stalbot0", stalbot0);

        Student cpriestley = new Student("Clayton Presley");
        createStudentGrades(cpriestley, 100, 100, 98);
        students.putIfAbsent("cpriestley", cpriestley);

        Student jeremymwood = new Student("Jeremy Wood");
        createStudentGrades(jeremymwood, 99, 97, 85);
        students.putIfAbsent("jeremymwood", jeremymwood);

        Student mattguardiola = new Student("Matt Guardiola");
        createStudentGrades(mattguardiola, 100, 90, 92);
        students.putIfAbsent("mattguardiola", mattguardiola);

        doUserChoice(students);
    }

    public static void createStudentGrades(Student student, int grade1, int grade2, int grade3) {
        student.addGrade(grade1);
        student.addGrade(grade2);
        student.addGrade(grade3);
    }

    public static void printStudentUsernames(HashMap<String, Student> student) {
        System.out.println("GitHub Usernames...");
        Set<String> keys = student.keySet();
        for (String key : keys) {
//            Student aStudent = students.get(key); // this would get the names of the students, not their GitHub usernames
            System.out.printf("|%s| ", key);
        }
        System.out.println("\n");
    }

    public static void doUserChoice(HashMap<String, Student> passedMap) {
        do {
            printStudentUsernames(passedMap);
            System.out.println("Which student would you like to see more information about?");
            String userChoice = input.getString();
            if (passedMap.containsKey(userChoice)) {
                ;
                System.out.println(passedMap.get(userChoice));
            } else {
                System.out.println("No usernames found");
            }
            System.out.println("Would you like to continue?");
        } while(input.yesNo());
    }

    public static void viewAllGrades() {
        String userViewsAllGrades = input.getString("Would you like to view all of the users grades?");
        if (input.yesNo()) {

        }
    }
}
