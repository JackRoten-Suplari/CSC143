import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void constructorToString(){
        assertThrows(IllegalArgumentException.class, () -> new Student("211091", "Chenery",
                "Ashla", "achenery2f@chron.com", "791-478-9345"));
        assertThrows(IllegalArgumentException.class, () -> new Student(" ", "Chenery",
                "Ashla", "achenery2f@chron.com", "791-478-9345"));
        assertThrows(IllegalArgumentException.class, () -> new Student("211091", null,
                "Ashla", "achenery2f@chron.com", "791-478-9345"));
        assertThrows(IllegalArgumentException.class, () -> new Student("211091", "Chenery",
                "     ", "achenery2f@chron.com", "791-478-9345"));
        assertThrows(IllegalArgumentException.class, () -> new Student("211091", "Chenery",
                "Ashla", "", "791-478-9345"));
        assertThrows(IllegalArgumentException.class, () -> new Student("211091", "Chenery",
                "Ashla", "achenery2f@chron.com", null));

    }

    @Test
    void testToString() throws FileNotFoundException {
        Student studentRecord = new Student( "211091", "Chenery",
                "Ashla", "achenery2f@chron.com", "791-478-9345");
        String studentString = "CSC110d, 211091, Chenery, Ashla, achenery2f@chron.com, 791-478-9345";
        assertEquals(studentString, studentRecord.toString());
    }
}