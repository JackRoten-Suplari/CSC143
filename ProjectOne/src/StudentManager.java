import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Manages student and course data
 * @author      Jack Roten
 * @version     2022-10-09
 */
public class StudentManager implements StudentManagerInterface{

    /**
     * count of courses
     */
    private int courseCount;
    /**
     * count of students
     */
    private int studentCount;
    /**
     * array of course names
     */
    private String[] courses;
    /**
     * jagged array of students by course number and Students in each course
     */
    private Student[][] students;

    /**
     * Constructor, handles student and course files, formatting data into 2D and 1D arrays respectively
     * @throws FileNotFoundException if file has error
     */
    StudentManager() throws FileNotFoundException {
        // retrieve student and course data
        Scanner courseFile = new Scanner(new File("Data/Courses.csv").getAbsoluteFile());
        Scanner studentsFile = new Scanner(new File("Data/Students.csv").getAbsoluteFile());

        // update course and student counts to prepare creating course and student arrays
        this.courseCount= Integer.parseInt(courseFile.nextLine());
        this.studentCount = 0;
        int courseIndex = 0;
        courseFile.nextLine();
        studentsFile.nextLine();

        // initialize courses and students arrays
        this.courses = new String[this.courseCount];
        this.students = new Student[this.courseCount][];

        // Create jagged array of student data based on course name and sorted by last name
        while (courseFile.hasNextLine()){
            String line = courseFile.nextLine();
            String course = line.split(",")[0];
            String courseEnrollment = line.split(",")[1];
            int courseCounts = Integer.valueOf(courseEnrollment);
            this.courses[courseIndex] = course;
            this.students[courseIndex] = new Student[courseCounts];
            for (int studentIndex = 0; studentIndex<courseCounts; studentIndex++){
                String studentLine = studentsFile.nextLine();
                this.students[courseIndex][studentIndex] = new Student(
                        studentLine.split(",")[1],
                        studentLine.split(",")[2],
                        studentLine.split(",")[3],
                        studentLine.split(",")[4],
                        studentLine.split(",")[5]);
                this.studentCount++;
            }
            Arrays.sort(this.students[courseIndex], Comparator.comparing(Student::lastName));
            courseIndex++;
        }
    }
    
    public int getCourseCount() {
        return this.courseCount;
    }


    public int getStudentCount(int courseIndex) {
        return this.students[courseIndex].length;
    }


    public int getStudentCount() {
        return this.studentCount;
    }


    public int getStudentCount(String courseName) {
        for (int courseIndex = 0; courseIndex < this.courseCount; courseIndex++) {
            if (this.courses[courseIndex].equals(courseName)) {
                return this.students[courseIndex].length;
            }
        }
        return -1;
    }


    public String getCourseName(int courseIndex) {
        return this.courses[courseIndex];
    }


    public Student getStudent(int courseIndex, int studentIndex) {
        return this.students[courseIndex][studentIndex];
    }


    public Student[] getStudents(int courseIndex) {
        return this.students[courseIndex];
    }


    public int findStudentCourse(String id) {
        int courseIndex;
        for (courseIndex = 0; courseIndex < students.length; courseIndex++){
            for (int studentIndex = 0; studentIndex < students[courseIndex].length; studentIndex++){
                if (id.equals(this.students[courseIndex][studentIndex].id())){
                    return courseIndex;
                }
            }
        }
        return -1;
    }

    /**
     *
     * @return Total Student Data
     */
    public String toString(){
        String studentsString = "";
        for (int course = 0; course<this.students.length; course++){
            for (int student = 0; student<this.students[course].length; student++){
                studentsString += this.courses[course] + ", " +this.students[course][student].toString() + "\n";
            }
        }
        return studentsString;
    }
}
