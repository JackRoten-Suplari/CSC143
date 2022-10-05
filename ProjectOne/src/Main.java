import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
            throws FileNotFoundException{
        String coursePath = "/Users/jackroten/src/github.com/CSC143/ProjectOne/Data/Courses.csv";
        String studentPath = "/Users/jackroten/src/github.com/CSC143/ProjectOne/Data/Students.csv";
        // Use Scanner for reading in data

        File courses = new File(coursePath);
        File students = new File(studentPath);

        // Construct StudentManager
        StudentManager studentManager = new StudentManager();


        // You can create 2D array from course.csv, there are 15 courses, and each line has an array value i.e. 27, 24, ...

        // Read a whole line and parse for integer

    }
}