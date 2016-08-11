import java.time.LocalDate;
        import java.util.List;

class HolidayChecker {

    boolean ifDayIsAHoliday(List<LocalDate> holidays, LocalDate date) {
        return holidays.contains(date);
    }
}
