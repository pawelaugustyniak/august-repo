import java.time.LocalDate;
import java.util.List;

public class Main {

    public static final boolean NO_HEADER = false;

    public static void main(String[] args) {

        String filePath = ".\\src\\holidays.csv";
        DatesParser datesParser = new DatesParser();
        CsvEditor csvEditor = new CsvEditor();
        LocalDate newDate = LocalDate.of(2009, 5, 20);
        DaysToHolidayCalculator calculator = new DaysToHolidayCalculator();
        List<String> stringsOfDates = csvEditor.getColumnAt(filePath, NO_HEADER);
        List<LocalDate> listOfDates = datesParser.getDatesFromStrings(stringsOfDates);
        boolean ifDate = calculator.ifDayIsAHoliday(listOfDates, newDate);
        long daysTo = calculator.getDaysToHoliday(listOfDates, newDate);
        long daysFrom = calculator.getDaysFromHoliday(listOfDates, newDate);
        System.out.println("if date "+newDate+" is a holiday: "+ifDate);
        System.out.println("Days to holiday from "+ newDate+": "+daysTo);
        System.out.println("Days from holiday to date "+ newDate+": "+daysFrom);

    }
}
