import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class HolidaysDates {

    List<LocalDate> getDatesFromStrings(List<String> listOfStrings) {

        List<LocalDate> dates = new ArrayList<>();
        for(int i =0; i<listOfStrings.size();i++) {
            dates.add(LocalDate.parse(listOfStrings.get(i),
                                        DateTimeFormatter.ISO_LOCAL_DATE));
        }
        return dates;
    }
}
