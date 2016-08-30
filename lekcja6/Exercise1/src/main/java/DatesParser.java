import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class DatesParser {

    List<LocalDate> getDatesFromStrings(List<String> stringDates) {
        List<LocalDate> dates = new ArrayList<>();
        for (String stringDate : stringDates) {
            dates.add(parseDate(stringDate));
        }
        return dates;
    }

    private LocalDate parseDate(String text) {
        return LocalDate.parse(text,
                DateTimeFormatter.ISO_LOCAL_DATE);
    }
}