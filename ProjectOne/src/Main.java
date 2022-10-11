import java.io.FileNotFoundException;

/**
 * Executes StudentManager class and outputs results of interface methods
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Construct StudentManager:
        StudentManager studentManager = new StudentManager();

        // Examples of studentManager usage:
        int[] courseIndices = {2, 3, 14};
        int[] studentIndices = {5,10,15};
        String[] courses = {"CSC110c", "CSC110d", "CSC143c"};

        System.out.println("Basic examples of studentManager methods and usage:");
        System.out.println("Output of all student data: \n" + studentManager);
        System.out.println("Total course count: " + studentManager.getCourseCount());
        System.out.println("Total student count: " + studentManager.getStudentCount() + "\n");

        for (int example = 0; example<courseIndices.length; example++){
            System.out.println("Total students for course with index " +
                    courseIndices[example] + ": " + studentManager.getStudentCount(courseIndices[example]));
            System.out.println("Total students for course " + courses[example] +
                    ": " + studentManager.getStudentCount(courses[example]));

            System.out.println("Course name for course with index " + courseIndices[example] +
                    ": " + studentManager.getCourseName(courseIndices[example]));
            System.out.println("Student at course index " + courseIndices[example] +
                    " and student index " + studentIndices[example] +
                    ": \n" + studentManager.getStudent(courseIndices[example], studentIndices[example]) + "\n");
        }
    }
}