import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//
public class StudentManager implements StudentManagerInterface{

    private int courseCount;
    private int studentCount;

    private String[] courses;

    StudentManager() throws FileNotFoundException {

        Scanner courseFile = new Scanner(new File("/Users/jackroten/src/github.com/CSC143/ProjectOne/Data/Courses.csv"));
        Scanner studentsFile = new Scanner(new File("/Users/jackroten/src/github.com/CSC143/ProjectOne/Data/Students.csv"));

        this.courseCount= Integer.parseInt(courseFile.nextLine());
        String courseHeader = courseFile.nextLine();
        String studentHeader = studentsFile.nextLine();

        this.courses = new String[this.courseCount];
        Student students[][] = new Student[this.courseCount][];

        int courseIndex = 0;
        // parse course file to get row number
        // parse student file to get student and course
        while (courseFile.hasNextLine()){
            String line = courseFile.nextLine();
            String course = line.split(",")[0];
            String courseEnrollment = line.split(",")[1];
            int courseCounts= Integer.valueOf(courseEnrollment);
            this.courses[courseIndex] = course;
            students[courseIndex] = new Student[courseCounts];
            for (int studentIndex = 0; studentIndex<courseCounts; studentIndex++){
                String studentLine = studentsFile.nextLine();
                students[courseIndex][studentIndex] = new Student(studentLine.split(",")[0],
                        studentLine.split(",")[1],
                        studentLine.split(",")[2],
                        studentLine.split(",")[3],
                        studentLine.split(",")[4],
                        studentLine.split(",")[5]);
            }
            Arrays.sort(students[courseIndex], new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.lastName().compareTo(o2.lastName());
                }
            });
            courseIndex++;
        }
        // TODO: Remove later
        for (int i = 0; i < students.length; i++){
            for(int j = 0; j < students[i].length; j++){
                System.out.println(students[i][j] + " ");
            }
        }
    }
    
    public int getCourseCount() {
        return this.courseCount;
    }


    public int getStudentCount(int courseIndex) {
        // Count all lines in the array by course index
        return 0;
    }


    public int getStudentCount() {
        // Count all lines in array, in total
        return this.studentCount;
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
//    public int compare(Student student1, Student student2){
//        return student1.lastName().compareTo(student2.lastName());
//    }

//    public static void main(String[] args) throws FileNotFoundException {
//        StudentManager studentManager = new.StudentManager();
//    }
}
