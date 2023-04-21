import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CancelTest {

    @Test
    void cancelView() {

        ByteArrayInputStream userInput1 = new ByteArrayInputStream("111\n1\n2".getBytes());
        System.setIn(userInput1);
        Cancel.CancelView();
        System.setIn(System.in);

            }


}