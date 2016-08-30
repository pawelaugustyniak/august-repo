import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DaysToHolidayCalculatorTest {
    DaysToHolidayCalculator calculator;
    List<LocalDate> listOfDates;
    LocalDate date1;
    LocalDate date2;
    LocalDate date3;
    LocalDate date4;
    LocalDate date5;
    LocalDate date6;

    @Before
    public void setUp() throws Exception {
        calculator = new DaysToHolidayCalculator();
        date1 = LocalDate.of(2015, 3, 5);
        date2 = LocalDate.of(2016, 4, 6);
        date3 = LocalDate.of(2015, 1, 1);
        date4 = LocalDate.of(2015, 11, 16);
        date5 = LocalDate.of(2015, 1, 20);
        date6 = LocalDate.of(2005, 1, 1);
        listOfDates = new ArrayList<>();
        listOfDates.add(date1);
        listOfDates.add(date2);
        listOfDates.add(date3);

    }

    @Test
    public void shouldCheckIfDateBelongToList() {
        //when
        boolean ifBelong = calculator.ifDayIsAHoliday(listOfDates, date1);

        //then
        assertEquals(true,ifBelong);
    }

    @Test
    public void shouldCheckIfDateDoesntBelongToList() {
        //when
        boolean ifBelong = calculator.ifDayIsAHoliday(listOfDates, date4);

        //then
        assertEquals(false, ifBelong);
    }

    @Test
    public void shouldCountDaysToTheNextHoliday() {
        //when
        long daysToNextHoliday = calculator.getDaysToHoliday(listOfDates, date5);

        //then
        assertEquals(3,daysToNextHoliday);
    }

    @Test
    public void shouldCountOtherDaysToTheNextHoliday() {
        //when
        long daysToNextHoliday = calculator.getDaysToHoliday(listOfDates, date6);

        //then
        assertEquals(3652, daysToNextHoliday);
    }

}
