import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseTest {

    Database d = new Database();
    @Test
    public void testseatAvailable() {

        assertEquals(0, d.SeatAvailable(15));
        assertEquals(d.s11, d.SeatAvailable(11));
        assertEquals(d.s84, d.SeatAvailable(84));
        assertEquals(d.s32, d.SeatAvailable(32));

    }



    @Test
    public void testaddBooking() {

        String[][] db = {
                {"953", "Ryon", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"111", "Wilbert", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"430", "Terrel", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
                {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
        };

        Database.AddBooking("amal","222",db,13);
        assertEquals("amal",db[3][1]);
        assertEquals("222",db[3][0]);
        assertEquals("Ryon",db[0][1]);
        assertEquals("Booked",db[3][5]);
    }

    @Test
    public void testremoveSeat() {

        int st1=Database.s13;
        Database.removeSeat(13);
        assertEquals(st1-1,Database.s13);

        int st2=Database.s54;
        Database.removeSeat(54);
        assertEquals(st2-1,Database.s54);

        int st3=Database.s73;
        Database.removeSeat(73);
        assertEquals(st3-1,Database.s73);

    }

    @Test
    public void test1searchId() {

        int[] ActualArr=Database.SearchId("12345");
        assertEquals(0,ActualArr[0]);


    }

    @Test
    public void test2searchId() {

        int[] ActualArr=Database.SearchId("664");
        assertEquals(11,ActualArr[0]);


    }

    @Test
    public void testselectBookedOption() {

        int[] Arr=new int[32];
        Database.SelectBookedOption(Arr);

    }


    @Test
    public void testcancelClass() {

        String[][] db = {
                {"953", "Ryon", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"111", "Wilbert", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"430", "Terrel", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
                {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
        };

        Database.CancelClass(db,"111",11);
        assertEquals("None",db[1][1]);
        assertEquals("0",db[1][0]);
        assertEquals("Available",db[1][5]);

    }

    @Test
    public void testaddSeat() {

        int st1=Database.s13;
        Database.addSeat(13);
        assertEquals(st1+1,Database.s13);

        int st2=Database.s54;
        Database.addSeat(54);
        assertEquals(st2+1,Database.s54);

        int st3=Database.s73;
        Database.addSeat(73);
        assertEquals(st3+1,Database.s73);

    }
    @Test
    public void testattendClass() {

        String[][] db = {
                {"953", "Ryon", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"111", "Wilbert", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"430", "Terrel", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
                {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
        };

        ByteArrayInputStream userInput1 = new ByteArrayInputStream("good\n4".getBytes());
        System.setIn(userInput1);
        Database.AttendClass(db,"111");
        assertEquals("Attended",db[1][5]);
        System.setIn(System.in);

    }

    @Test
    public void testattendedFeedback() {

        String[][] db = {
                {"953", "Ryon", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"111", "Wilbert", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"430", "Terrel", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
                {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
                {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
        };

        ByteArrayInputStream userInput1 = new ByteArrayInputStream("good\n4".getBytes());
        System.setIn(userInput1);
        Database.AttendedFeedback(db,1);
        assertEquals("good",db[1][7]);
        assertEquals("4",db[1][8]);
        System.setIn(System.in);
    }

    @Test
    public void testmonthlyReportSelect() {

        Database.MonthlyReportSelect(1);
        Database.MonthlyReportSelect(2);

    }

    @Test
    public void championReportSelect() {

        Database.ChampionReportSelect(1);
        Database.ChampionReportSelect(2);

    }

}