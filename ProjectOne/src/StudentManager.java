import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//
public class StudentManager implements StudentManagerInterface{

    private int course_number;
    private int enrollment_number;
    private int[] course_array;
    // private Student[] student;

    // private Student student;

    StudentManager() throws FileNotFoundException {

        Scanner courseFile = new Scanner(new File("/Users/jackroten/src/github.com/CSC143/ProjectOne/Data/Courses.csv"));
        Scanner studentsFile = new Scanner(new File("/Users/jackroten/src/github.com/CSC143/ProjectOne/Data/Students.csv"));

        this.course_number = Integer.parseInt(courseFile.nextLine());
        String courseHeader = courseFile.nextLine();
        String studentHeader = studentsFile.nextLine();
        System.out.println(this.course_number);
        this.course_array = new int[this.course_number];

//        System.out.println(courseHeader);
//        System.out.println(studentHeader);
//        System.out.println();

        this.enrollment_number = 0;
        int student_number = 0;

        int i = 0;
        // parse course file to get row number
        while (courseFile.hasNextLine()){

            String line = courseFile.nextLine();
            String enrollment = line.split(",")[1];
            int class_size = Integer.valueOf(enrollment);
            this.course_array[i] = class_size;
            System.out.println(class_size);
            this.enrollment_number+=class_size;
            i++;
        }
        System.out.println(this.enrollment_number);

        String[] courseCols = courseHeader.split(",");
        String[] studentCols = studentHeader.split(",");

        System.out.println(Arrays.toString(courseCols));
        System.out.println(Arrays.toString(studentCols));

        int courseColLen = courseCols.length;
        int studentColLen = studentCols.length;
        System.out.println(courseColLen);
        System.out.println(studentColLen);

        Student student =  new Student("CSC143", "123", "Skelington", "Jack", "jackskelington@halloween.com", "143255556");

        System.out.println(student.course());
        // this.student = new Student("123","Roten","Jack","Email.com","7609000766");

        System.out.println(student.id());
        System.out.println(student.lastName());

        /*
        the 2D array has the dimensions classid's then student records. Each record is a student's information
        There are three layers here. An array lenght of number of classes, then sub arrays, the lenght of the number
        of students per class, and each student is a record.
         */

//        for (int k = 0; k<this.enrollment_number; k++){
//            String line = studentsFile.nextLine();
//            String[] student_info = line.split(",");
//            for (int j = 0; j<studentColLen;j++) {
//                this.student_array[k][j] = student_info;
//            }
//        }


    }

    
    public int getCourseCount() {
        return this.course_number;
    }


    public int getStudentCount(int courseIndex) {
        // Count all lines in the array by course index
        return 0;
    }


    public int getStudentCount() {
        // Count all lines in array, in total
        return this.enrollment_number;
    }


    public int getStudentCount(String courseName) {
        // Count all lines in the array by courseName
        return 0;
    }


    public String getCourseName(int courseIndex) {
        // get course name
        return null;
    }


    public Student getStudent(int courseIndex, int studentIndex) {
        return null;
    }


    public Student[] getStudents(int courseIndex) {
        return null;
    }


    public int findStudentCourse(String id) {
        return 0;
    }

//    /**
//     *
//     * @param other
//     * @return
//     */
//    public int compareTo(Student other){
//        return this.lastName() - other.lastName();
//    }

//    public static void main(String[] args) throws FileNotFoundException {
//        StudentManager studentManager = new.StudentManager();
//    }
}
