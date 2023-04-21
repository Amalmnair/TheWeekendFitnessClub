import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;


class CancelTest {
    @Test
    void test1cancelView() {

        ByteArrayInputStream userInput1 = new ByteArrayInputStream("111\n1\n2".getBytes());
        System.setIn(userInput1);
        Cancel.CancelView();
        System.setIn(System.in);

            }

    @Test
    void test2cancelView() {

        ByteArrayInputStream userInput1 = new ByteArrayInputStream("0000".getBytes());
        System.setIn(userInput1);
        Cancel.CancelView();
        System.setIn(System.in);

    }



}