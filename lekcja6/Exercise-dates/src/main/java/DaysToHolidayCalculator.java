import java.time.LocalDate;
import java.util.List;

class DaysToHolidayCalculator {

    ListOfDates listOfDates = new ListOfDates();
    HolidayChecker holidayChecker = new HolidayChecker();

    int getDaysToHoliday(LocalDate checkedDate) {
        if(holidayChecker.ifDayIsAHoliday( listOfDates.getDates(),checkedDate))
    }

    int getDaysFromHoliday(LocalDate checkedDate) {

    }


}
