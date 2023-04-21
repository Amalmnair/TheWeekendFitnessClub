import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    @Test
    void testbookView() {

        ByteArrayInputStream userInput1 = new ByteArrayInputStream("3".getBytes());
        System.setIn(userInput1);
        Booking.BookView();
        System.setIn(System.in);

    }




    @Test
    void testcheckSeats() {

        Booking.CheckSeats();

    }

    @Test
    void testbookSeat() {

        ByteArrayInputStream userInput1 = new ByteArrayInputStream("amal\n222".getBytes());
        System.setIn(userInput1);
        Booking.BookSeat();
        System.setIn(System.in);

    }
}