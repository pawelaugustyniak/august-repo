import java.time.LocalDate;
import java.util.List;

public class ListOfDates {
    public static final boolean WITH_HEADER = true;
    HolidaysList holidaysList = new HolidaysList();
    HolidaysDates holidaysDates = new HolidaysDates();

    List<LocalDate> getDates(String filePath) {
        return  holidaysDates.getDatesFromStrings(holidaysList.getColumnAt(filePath, WITH_HEADER));
    }


}
