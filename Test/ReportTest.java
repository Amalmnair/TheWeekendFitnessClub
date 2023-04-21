import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class ReportTest {

    @Test
    void test1monthlyReportView() {
        ByteArrayInputStream userInput1 = new ByteArrayInputStream("1".getBytes());
        System.setIn(userInput1);
        Report.MonthlyReportView();
        System.setIn(System.in);
    }

    @Test
    void test2monthlyReportView() {
        ByteArrayInputStream userInput2 = new ByteArrayInputStream("2".getBytes());
        System.setIn(userInput2);
        Report.MonthlyReportView();
        System.setIn(System.in);
    }
    @Test
    void test1championReportView() {
        ByteArrayInputStream userInput1 = new ByteArrayInputStream("1".getBytes());
        System.setIn(userInput1);
        Report.ChampionReportView();
        System.setIn(System.in);

    }
    @Test
    void test2championReportView() {
        ByteArrayInputStream userInput2 = new ByteArrayInputStream("2".getBytes());
        System.setIn(userInput2);
        Report.ChampionReportView();
        System.setIn(System.in);

    }

}