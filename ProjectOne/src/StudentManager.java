import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class StudentManager{

    StudentManager() throws FileNotFoundException {

        Scanner courseFile = new Scanner(new File("/Users/jackroten/src/github.com/CSC143/ProjectOne/Data/Courses.csv"));
        Scanner studentsFile = new Scanner(new File("/Users/jackroten/src/github.com/CSC143/ProjectOne/Data/Students.csv"));

        int course_number = Integer.parseInt(courseFile.nextLine());
        String courseHeader = courseFile.nextLine();
        String studentHeader = studentsFile.nextLine();
        System.out.println(course_number);
        int[] course_array = new int[course_number];

        System.out.println(courseHeader);
        System.out.println(studentHeader);
        System.out.println();

        //
        int enrollment_number = 0;
        int student_number = 0;

        int i = 0;
        // parse course file to get row number
        while (courseFile.hasNextLine()){

            String line = courseFile.nextLine();
            String enrollment = line.split(",")[1];
            int class_size = Integer.valueOf(enrollment);
            course_array[i] = class_size;
            System.out.println(class_size);
            enrollment_number+=class_size;
            i++;
        }
        System.out.println(enrollment_number);

        String[] courseCols = courseHeader.split(",");
        String[] studentCols = studentHeader.split(",");

        System.out.println(Arrays.toString(courseCols));
        System.out.println(Arrays.toString(studentCols));

        int courseColLen = courseCols.length;
        int studentColLen = studentCols.length;
        System.out.println(courseColLen);
        System.out.println(studentColLen);

        String[][] student_array = new String[enrollment_number][studentColLen];
        for (int k = 0; k<enrollment_number; k++){
            String line = studentsFile.nextLine();
            String[] student_info = line.split(",");
            for (int j = 0; j<studentColLen;j++) {
                student_array[k][j] = student_info[j];
            }
//            for (String s : student_info) {
//                student_array[k][j] = s;
//                j++;
//            }
        }
//        while (studentsFile.hasNextLine()){
//            String line = studentsFile.nextLine();
//            String[] student_info = line.split(",");
//            int j = 0;
//            for (String s : student_info) {
//                student_array[j][i] = s;
//                j++;
//            }
//            i++;
//        }
        System.out.println(Arrays.deepToString(student_array));
    }
    public static void main(String[] args) throws FileNotFoundException {

        StudentManager studentManager = new StudentManager();

    }

//    public String[] constructCourseArray(){
//
//    }
//
//    public String[][] constructStudentsArray(){
//
//    }
//
//    @Override
//    public String toString(){
//
//    }

}
