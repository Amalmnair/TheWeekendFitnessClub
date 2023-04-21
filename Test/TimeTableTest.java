import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.sql.Time;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TimeTableTest {


    @Test
    void test1timetableDay() {

        Scanner userInput1 = new Scanner(new ByteArrayInputStream("10".getBytes()));
        TimeTable.sc=userInput1;
        assertEquals(52, TimeTable.TimetableDay(1));

    }

    @Test
    void test2timetableDay() {

        Scanner userInput1 = new Scanner(new ByteArrayInputStream("15".getBytes()));
        TimeTable.sc=userInput1;
        assertEquals(81, TimeTable.TimetableDay(1));

    }

    @Test
    void test3timetableDay() {

        Scanner userInput1 = new Scanner(new ByteArrayInputStream("15".getBytes()));
        TimeTable.sc=userInput1;
        assertEquals(83, TimeTable.TimetableDay(2));

    }
    @Test
    void test4timetableDay() {

        Scanner userInput1 = new Scanner(new ByteArrayInputStream("10".getBytes()));
        TimeTable.sc=userInput1;
        assertEquals(54, TimeTable.TimetableDay(2));

    }


    @Test
    void test1timetableClass() {

        Scanner userInput2 = new Scanner(new ByteArrayInputStream("5".getBytes()));
        TimeTable.sc=userInput2;
        assertEquals(51, TimeTable.TimetableClass(1));
        System.setIn(System.in);


    }

    @Test
    void test2timetableClass() {

        Scanner userInput2 = new Scanner(new ByteArrayInputStream("6".getBytes()));
        TimeTable.sc=userInput2;
        assertEquals(62, TimeTable.TimetableClass(2));
        System.setIn(System.in);


    }

    @Test
    void test3timetableClass() {

        Scanner userInput2 = new Scanner(new ByteArrayInputStream("7".getBytes()));
        TimeTable.sc=userInput2;
        assertEquals(73, TimeTable.TimetableClass(3));
        System.setIn(System.in);


    }

    @Test
    void test4timetableClass() {

        Scanner userInput2 = new Scanner(new ByteArrayInputStream("8".getBytes()));
        TimeTable.sc=userInput2;
        assertEquals(84, TimeTable.TimetableClass(4));
        System.setIn(System.in);


    }



}