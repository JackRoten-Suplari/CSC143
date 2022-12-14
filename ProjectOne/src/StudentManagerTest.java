import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class StudentManagerTest {

    @Test
    void constructor() throws FileNotFoundException {
        StudentManager studentManager = new StudentManager();
        assertEquals(15, studentManager.getCourseCount());
        assertEquals(403, studentManager.getStudentCount());

    }


    @Test
    void getCourseCount() throws FileNotFoundException {
        assertEquals(15, new StudentManager().getCourseCount());
    }

    @Test
    void getStudentCountTotal() throws FileNotFoundException {
        assertEquals(403, new StudentManager().getStudentCount());

    }

    @Test
    void GetStudentCountByIndex() throws FileNotFoundException {
        assertEquals(30, new StudentManager().getStudentCount(3));

    }

    @Test
    void GetStudentCountByCourse() throws FileNotFoundException {
        assertEquals(30, new StudentManager().getStudentCount("CSC142c"));
        assertEquals(-1, new StudentManager().getStudentCount("CSC142f"));

    }

    @Test
    void getCourseName() throws FileNotFoundException {
        assertEquals("CSC110d", new StudentManager().getCourseName(3));

    }

    @Test
    void getStudent() throws FileNotFoundException {
        assertEquals(new Student( "211091", "Chenery",
                        "Ashla", "achenery2f@chron.com", "791-478-9345"),
                new StudentManager().getStudent(3, 2));
    }

    @Test
    void getStudents() throws FileNotFoundException {
        Student[] students = new StudentManager().getStudents(3);
        String studentsOutputString = "";
        String studentsTestString = "216362, Antusch, Reinaldos, rantusch2a@vinaora.com, 131-428-7767\n" +
                "137984, Cambell, Wat, wcambell2j@google.de, 132-241-3826\n" +
                "211091, Chenery, Ashla, achenery2f@chron.com, 791-478-9345\n" +
                "114764, Coie, Berry, bcoie23@hp.com, 634-226-7375\n" +
                "200143, Debrett, Seamus, sdebrett2v@mapy.cz, 227-645-9390\n" +
                "253616, Diggens, Bethena, bdiggens2c@unc.edu, 176-692-5945\n" +
                "277492, Duffield, Kerwin, kduffield2w@mit.edu, 648-262-6154\n" +
                "203413, Flippen, Alla, aflippen2n@sitemeter.com, 898-756-6331\n" +
                "146767, Golly, Henrie, hgolly26@technorati.com, 275-809-2493\n" +
                "112421, Grosvener, Hayes, hgrosvener2m@jimdo.com, 813-122-0800\n" +
                "259061, Hillen, Daffi, dhillen2p@vimeo.com, 480-752-9588\n" +
                "116503, Jehu, Elinore, ejehu2q@buzzfeed.com, 185-593-2883\n" +
                "190201, Kliesl, Roley, rkliesl2h@i2i.jp, 635-501-6097\n" +
                "251256, Mableson, Livvy, lmableson2k@trellian.com, 556-375-8852\n" +
                "248421, Mattiuzzi, Sawyer, smattiuzzi2l@goodreads.com, 460-785-7290\n" +
                "105946, McCrow, Pincus, pmccrow2r@slashdot.org, 622-807-0936\n" +
                "136923, McQuilty, Rhona, rmcquilty2u@webeden.co.uk, 197-208-6770\n" +
                "103862, Midford, Marnia, mmidford2g@163.com, 434-956-3244\n" +
                "144140, Mongain, Neille, nmongain2t@harvard.edu, 813-700-2230\n" +
                "144119, Navan, Bevon, bnavan29@nasa.gov, 459-997-7908\n" +
                "281103, Rigglesford, Darill, drigglesford2e@dagondesign.com, 210-902-7645\n" +
                "229847, Sillars, Kissie, ksillars28@arizona.edu, 297-966-3341\n" +
                "109468, Simionato, Shelby, ssimionato24@eepurl.com, 947-431-8593\n" +
                "105571, Smidmoor, Terrence, tsmidmoor27@telegraph.co.uk, 441-838-8468\n" +
                "233176, Speedy, Judah, jspeedy2s@t-online.de, 790-483-6548\n" +
                "269275, Swale, Deedee, dswale2o@163.com, 412-260-0058\n" +
                "152915, Trodd, Arley, atrodd2b@home.pl, 722-820-2317\n" +
                "165845, Verheijden, Wang, wverheijden25@rakuten.co.jp, 509-338-4326\n" +
                "238185, Wanstall, Myrna, mwanstall2i@pinterest.com, 902-713-9428\n" +
                "140439, Woodburn, Louisette, lwoodburn2d@alexa.com, 704-710-1440\n";

        for (int student = 0; student< students.length; student++){
            studentsOutputString += students[student].toString() + "\n";

        }
        System.out.println(studentsOutputString);
        assertEquals(studentsTestString, studentsOutputString);
    }

    @Test
    void findStudentCourse() throws FileNotFoundException {
        assertEquals(14, new StudentManager().findStudentCourse("163584"));
        assertEquals(-1, new StudentManager().findStudentCourse("1635845"));
    }

    @Test
    void testToString() throws FileNotFoundException {
        assertNotEquals("", new StudentManager().toString());
    }
}