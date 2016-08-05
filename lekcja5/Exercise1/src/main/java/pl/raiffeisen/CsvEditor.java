package pl.raiffeisen;

import java.util.ArrayList;
import java.util.List;

class CsvEditor {
    LinesReader linesReader = new LinesReader();

    List<String> getColumnAt(int index, String src, boolean withHeader) {
        List<String> column = getColumnAt(index, linesReader.readLines(src));
        if(!withHeader) {
            return removeHeader(column);
        }
        return column;
    }

    private List<String> getColumnAt(int index, List<String> lines) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            result.add(getColumn(line,index));
        }
        return result;
    }

    private List<String> removeHeader(List<String> lines) {
        lines.remove(lines.get(0));
        return lines;
    }

    private String getColumn(String line, int index) {
        return line.split(";")[index];
    }
}
