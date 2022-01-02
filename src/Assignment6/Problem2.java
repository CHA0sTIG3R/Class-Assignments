package Assignment6;


public class Problem2 {
    public static void main(String[] args) {
        Course myCourse = new Course("Data Structures");
        myCourse.addStudent("David");
        myCourse.addStudent("John");
        myCourse.addStudent("Jane");

        System.out.println(myCourse.getNumberOfStudents());
        for (int i = 0; i < myCourse.getNumberOfStudents(); i++){
            System.out.println(myCourse.getStudents()[i]);
        }

        myCourse.dropStudent("John");

        System.out.println(myCourse.getNumberOfStudents());
        for (int i = 0; i < myCourse.getNumberOfStudents(); i++){
            System.out.println(myCourse.getStudents()[i]);
        }
    }
}
