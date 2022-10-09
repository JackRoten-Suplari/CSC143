import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Construct StudentManager:
        StudentManager studentManager = new StudentManager();

        // Initial tests for interface usage:
        System.out.println("Test Output");
        System.out.println(studentManager.getStudentCount());
        System.out.println(studentManager.getStudentCount(3));
        System.out.println(studentManager.getStudentCount("CSC142c"));
        System.out.println(studentManager.getCourseName(3));
        System.out.println(studentManager.getStudent(3, 2));
//        Student[] students = studentManager.getStudents(3);

//        for (int student = 0; student< students.length; student++){
//            System.out.println(students[student].toString());
//        }
//        System.out.println(studentManager.findStudentCourse("163584"));


        // All implemented methods are working as expected!!
        // Arrays are created as expected!!
        // Currently all code works as assignment asks, as far as I understand it.

        // TODO: Confirm java doc usage and implement.
        // TODO: Write tests for each method in StudentManager.
        // TODO: Use Xlint and review the usage of that in lecture.
        // TODO: Review instructions and check if anything else needs to be coded

    }
}