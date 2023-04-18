import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseTest {

    @Test
    public void seatAvailable() {
        Database d= new Database();
        assertEquals(0,d.SeatAvailable(15));
        assertEquals(d.s11,d.SeatAvailable(11));
        assertEquals(d.s84,d.SeatAvailable(84));

    }
}