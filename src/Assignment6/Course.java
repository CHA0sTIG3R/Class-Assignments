package Assignment6;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length){
            students = arrayCopy(students);
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }
    
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int index = getIndex(student);
        for (int i = index; i < students.length-1; i++){
            students[i] = students[i + 1];
        }
        numberOfStudents--;
    }

    private String [] arrayCopy(String [] arr){
        return  Arrays.copyOf(arr, arr.length + 100);
    }

    private int getIndex(String s){
        int i = 0;
        while (i <= students.length && !students[i].equalsIgnoreCase(s)){
            i++;
        }
        if (i <= students.length){
            return i;
        }
        else{
            return -1;
        }
    }

    public void clear() {
        students = new String[100];
        numberOfStudents = 0;
    }
}
