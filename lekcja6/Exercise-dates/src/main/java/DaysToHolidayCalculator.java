import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

class DaysToHolidayCalculator {


    int getDayToHolidays(List<LocalDate> holidays, LocalDate checkedDate) {
        if(ifDayIsAHoliday(holidays,checkedDate)) {
            return 0;
            System.out.println("Checked day is a holiday.");
        }


    }

    int getDaysFromHoliday(List<LocalDate> holidays, LocalDate checkedDate) {
        if(ifDayIsAHoliday(holidays,checkedDate)) {
            return 0;
            System.out.println("Checked day is a holiday.");
        }

    }

    LocalDate getNextDay(List<LocalDate> holidays, LocalDate checkedDate) {

    }

    private boolean ifDayIsAHoliday(List<LocalDate> holidays, LocalDate date) {
        return holidays.contains(date);
    }

    private void sortListOfDates(List<LocalDate> holidays) {
        Collections.sort(holidays);
    }

    private void addDateToList(List<LocalDate> holidays, LocalDate date) {
        holidays.add(date);
    }

    private void diffrenceBetweenDates(List<LocalDate> holidays, LocalDate date) {
        int index = holidays.indexOf(date);

        LocalDate diff = holidays.get(index) - 
    }

}
