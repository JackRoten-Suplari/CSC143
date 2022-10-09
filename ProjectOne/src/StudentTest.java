import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void constructor(){
        Student studentRecord = new Student("CSC110d", "211091", "Chenery",
                "Ashla", "achenery2f@chron.com", "791-478-9345");
        String studentString = "CSC110d, 211091, Chenery, Ashla, achenery2f@chron.com, 791-478-9345";
        assertEquals(studentString, studentRecord.toString());
    }
}