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

    private Student[][] students;

    StudentManager() throws FileNotFoundException {

        Scanner courseFile = new Scanner(new File("/Users/jackroten/src/github.com/CSC143/ProjectOne/Data/Courses.csv"));
        Scanner studentsFile = new Scanner(new File("/Users/jackroten/src/github.com/CSC143/ProjectOne/Data/Students.csv"));

        this.courseCount= Integer.parseInt(courseFile.nextLine());
        this.studentCount = 0;
        String courseHeader = courseFile.nextLine();
        String studentHeader = studentsFile.nextLine();

        this.courses = new String[this.courseCount];
        this.students = new Student[this.courseCount][];

        int courseIndex = 0;
        // parse course file to get row number
        // parse student file to get student and course
        while (courseFile.hasNextLine()){
            String line = courseFile.nextLine();
            String course = line.split(",")[0];
            String courseEnrollment = line.split(",")[1];
            int courseCounts= Integer.valueOf(courseEnrollment);
            this.courses[courseIndex] = course;
            this.students[courseIndex] = new Student[courseCounts];
            for (int studentIndex = 0; studentIndex<courseCounts; studentIndex++){
                String studentLine = studentsFile.nextLine();
                this.students[courseIndex][studentIndex] = new Student(studentLine.split(",")[0],
                        studentLine.split(",")[1],
                        studentLine.split(",")[2],
                        studentLine.split(",")[3],
                        studentLine.split(",")[4],
                        studentLine.split(",")[5]);
                this.studentCount++;
            }
            Arrays.sort(this.students[courseIndex], new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.lastName().compareTo(o2.lastName());
                }
            });
            courseIndex++;
        }
//        for (int i = 0; i<this.students.length; i++){
//            for (int j = 0; j<this.students[i].length; j++){
//                System.out.println(this.students[i][j]);
//            }
//        }

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
}
