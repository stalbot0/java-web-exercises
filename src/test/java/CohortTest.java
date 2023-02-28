import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CohortTest extends TestCase {

//    @Before
//    public void initCohortTestData() {
//        Cohort smartPpl = new Cohort();
//
//        Student potsnpans = new Student(34, "Pots and Pans");
//        potsnpans.addGrade(100);
//        potsnpans.addGrade(90);
//        potsnpans.addGrade(95);
//
//        Student slimeball = new Student(35, "Slimeball");
//        slimeball.addGrade(90);
//        slimeball.addGrade(90);
//        slimeball.addGrade(90);
//
//        smartPpl.addStudent(potsnpans);
//        smartPpl.addStudent(slimeball);
//
//        double cohortAvg = smartPpl.getCohortAverage();
//    }

    @Test
    public void testGetCohortAverage() {
        Cohort smartPpl = new Cohort();

        Student potsnpans = new Student(34, "Pots and Pans");
        potsnpans.addGrade(100);
        potsnpans.addGrade(90);
        potsnpans.addGrade(95);

        Student slimeball = new Student(35, "Slimeball");
        slimeball.addGrade(90);
        slimeball.addGrade(90);
        slimeball.addGrade(90);

        smartPpl.addStudent(potsnpans);
        smartPpl.addStudent(slimeball);

        double cohortAvg = smartPpl.getCohortAverage();

        assertEquals(92.0, cohortAvg, 0.5);
    }

    @Test
    public void testAddStudent() {
        Cohort dumbPpl = new Cohort();
        assertEquals(0, dumbPpl.getStudents().size());

        Student dumbGuyOne = new Student(1, "Pea Brain");
        Student dumbGuyTwo = new Student(2, "Smol Brain Guy");

        dumbPpl.addStudent(dumbGuyOne);
        assertEquals(1, dumbPpl.getStudents().size());

        dumbPpl.addStudent(dumbGuyTwo);
        assertEquals(2, dumbPpl.getStudents().size());
    }

    @Test
    public void testGetStudents() {
        Cohort dumbPpl = new Cohort();
        Student dumbGuyOne = new Student(1, "Pea Brain");
        Student dumbGuyTwo = new Student(2, "Smol Brain Guy");

        dumbPpl.addStudent(dumbGuyOne);
        dumbPpl.addStudent(dumbGuyTwo);

//        assertEquals();
    }
}