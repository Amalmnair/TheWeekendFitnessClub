import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class AttendTest {

    @Test
    void testattendView() {

        ByteArrayInputStream userInput1 = new ByteArrayInputStream("0000".getBytes());
        System.setIn(userInput1);
        Attend.AttendView();
        System.setIn(System.in);

    }

}