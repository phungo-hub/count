import static org.junit.jupiter.api.Assertions.*;
//import java.util.Date;
import org.junit.jupiter.api.Test;

class NextDayCalculatorTest {

    @Test
    void testGetNextDay0() {
        int date = 1;
        int month = 1;
        int year = 2018;
        Date expected = new Date(2018,1,2);
        NextDayCalculator calc = new NextDayCalculator();
        Date result = calc.getNextDay(new Date(year, month, date));

        assertEquals(expected.toString(), result.toString());
    }
}