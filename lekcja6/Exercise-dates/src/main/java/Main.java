import java.time.LocalDate;
import java.util.List;

public class Main {

    public static final boolean WITH_HEADER = true;

    public static void main(String[] args) {
        HolidaysList holidaysList = new HolidaysList();
        HolidaysDates holidaysDates = new HolidaysDates();
        HolidayChecker holidayChecker = new HolidayChecker();
        List<LocalDate> holidays = holidaysDates.getDatesFromStrings(holidaysList.getColumnAt(".\\src\\holidays.csv", WITH_HEADER));

        System.out.println(holidaysDates.getDatesFromStrings(holidaysList.getColumnAt(".\\src\\holidays.csv", WITH_HEADER)));

        LocalDate date = LocalDate.of(2009, 04, 13);

        System.out.println(date);
        boolean a = holidayChecker.ifDayIsAHoliday(holidays, date);
        System.out.println(a);

    }
}
