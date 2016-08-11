import java.util.ArrayList;
import java.util.List;

class HolidaysList {

    FileReader fileReader = new FileReader();
    private static final int DATE_COLUMN_INDEX=0;

    List<String> getColumnAt(String filePath, boolean withHeader) {
        List<String> column = getColumnAt(DATE_COLUMN_INDEX, fileReader.holidaysDates(filePath));

        if(!withHeader) return removeHeader(column);

        return column;
    }

    private List<String> getColumnAt(int indexDate, List<String> lines) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            result.add(getColumn(line,indexDate));
        }
        return result;
    }

    private List<String> removeHeader(List<String> lines) {
        lines.remove(lines.get(0));
        return lines;
    }

    private String getColumn(String line, int index) {
        return line.split("\t")[index];
    }
}
