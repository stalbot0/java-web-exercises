package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String studentName) {
        this.name = studentName;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public int getGradeAverage() {
       int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "name = " + name + ", grades =" + grades;
    }

    //accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
}
