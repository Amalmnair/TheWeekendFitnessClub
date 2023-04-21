import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseTest {

    Database d = new Database();
    @Test
    public void seatAvailable() {

        assertEquals(0, d.SeatAvailable(15));
        assertEquals(d.s11, d.SeatAvailable(11));
        assertEquals(d.s84, d.SeatAvailable(84));
        assertEquals(d.s32, d.SeatAvailable(32));

    }

    @org.junit.jupiter.api.Test
    void selectBookingClass() {
    }

    @org.junit.jupiter.api.Test
    void addBooking() {



    }

    @org.junit.jupiter.api.Test
    void removeSeat() {
    }

    @org.junit.jupiter.api.Test
    void searchId() {
    }

    @org.junit.jupiter.api.Test
    void selectBookedOption() {
    }

    @org.junit.jupiter.api.Test
    void selectCancelClass() {
    }

    @org.junit.jupiter.api.Test
    void cancelClass() {
    }

    @org.junit.jupiter.api.Test
    void addSeat() {
    }

    @org.junit.jupiter.api.Test
    void selectAttendClass() {
    }

    @org.junit.jupiter.api.Test
    void attendClass() {
    }

    @org.junit.jupiter.api.Test
    void attendedFeedback() {
    }

    @org.junit.jupiter.api.Test
    void monthlyReportSelect() {
    }

    @org.junit.jupiter.api.Test
    void monthlyReport() {
    }

    @org.junit.jupiter.api.Test
    void championReportSelect() {
    }

    @org.junit.jupiter.api.Test
    void championReport() {
    }
}