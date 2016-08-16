import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;


class DaysToHolidayCalculator {



    long getDaysToHoliday(List<LocalDate> holidays,LocalDate checkedDate) {
        LocalDate nextDate;
        if(ifDayIsAHoliday(holidays,checkedDate)) {
            System.out.println("Checked date is a holiday");
            return 0;
        }
        else
        addDateToHolidays(holidays,checkedDate);
        sortHolidays(holidays);
        int indexOfDayNextToCheckedDate = getIndexOfDate(holidays, checkedDate)+1;
        nextDate = holidays.get(indexOfDayNextToCheckedDate);
        long diff = ChronoUnit.DAYS.between(checkedDate, nextDate);
        holidays.remove(indexOfDayNextToCheckedDate - 1);
        return diff;
    }

    long getDaysFromHoliday(List<LocalDate> holidays, LocalDate checkedDate) {
        LocalDate nextDate;
        if(ifDayIsAHoliday(holidays,checkedDate)) {
            System.out.println("Checked date is a holiday");
            return 0;
        }
        else
            addDateToHolidays(holidays,checkedDate);
        sortHolidays(holidays);
        int indexOfDayNextToCheckedDate = getIndexOfDate(holidays, checkedDate)-1;
        nextDate = holidays.get(indexOfDayNextToCheckedDate);
        long diff = ChronoUnit.DAYS.between(nextDate, checkedDate);
        holidays.remove(indexOfDayNextToCheckedDate + 1);
        return diff;

    }


    boolean ifDayIsAHoliday(List<LocalDate> holidays, LocalDate date) {
        return holidays.contains(date);
    }

    private void addDateToHolidays(List<LocalDate> holidays, LocalDate date) {
        holidays.add(date);
    }

    private void sortHolidays(List<LocalDate> holidays) {
        Collections.sort(holidays);
    }

    private int getIndexOfDate(List<LocalDate> holidays, LocalDate date) {
        return holidays.indexOf(date);
    }

    private boolean ifDateIsAtTheBegining(List<LocalDate> list, LocalDate date) {
       return date == list.get(0);
    }

    private boolean ifDateIsAtTheEnd(List<LocalDate> list, LocalDate date) {
        return date == list.get(list.size()-1);
    }

}