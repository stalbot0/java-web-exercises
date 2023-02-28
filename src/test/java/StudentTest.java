import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

//gets ID and name
//gets array list of grades
//adds a grade
//gets grade average
public class StudentTest {
    protected Student stovetop = new Student(33, "Stovetop");

    @Test
    public void testCreationOfStudent() {
        assertEquals(33, stovetop.getId());
        assertEquals("Stovetop", stovetop.getName());
        assertEquals(0, stovetop.getGrades().size());
    }

    @Test
    public void testAddGrade() {
        stovetop.addGrade(89);
        stovetop.addGrade(95);
        stovetop.addGrade(93);

        assertEquals(0, stovetop.getGrades().indexOf(89));
        assertEquals(1, stovetop.getGrades().indexOf(95));
        assertEquals(2, stovetop.getGrades().indexOf(93));

        assertEquals(3, stovetop.getGrades().size());
    }

    @Test
    public void testGetGradeAverage() {
        stovetop.addGrade(89);
        stovetop.addGrade(95);
        stovetop.addGrade(93);

        Integer [] gradesArr = {89, 95, 93};
       assertArrayEquals(gradesArr, stovetop.getGrades().toArray(new Integer[gradesArr.length]));
    }
}
