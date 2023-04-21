import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    @Test
    void bookView() {
    }

    @Test
    void checkSeats() {
    }

    @Test
    void testbookSeat() {

        ByteArrayInputStream userInput1 = new ByteArrayInputStream("amal\n222".getBytes());
        System.setIn(userInput1);
        Booking.BookSeat();
        System.setIn(System.in);

    }
}