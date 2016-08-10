package pl.raiffeisen;

import java.math.BigDecimal;
import java.util.*;

class AverageSalaryCalculator {

    private static final int SALARY_COLUMN_INDEX = 1;
    private static final boolean NO_HEADER = false;
    private CsvEditor csvEditor = new CsvEditor();
    private AmountsParser amountsParser;
    private AverageCalculator averageCalculator = new AverageCalculator();

    AverageSalaryCalculator(Locale locale) {
        amountsParser = new AmountsParser(locale);
    }

    BigDecimal calculate(String inputFile) {
        return averageCalculator.calculateAverage(
                amountsParser.parseSalaries(
                        getSalaryColumn(inputFile)));
    }

    private List<String> getSalaryColumn(String inputFile) {
        return csvEditor.getColumnAt(SALARY_COLUMN_INDEX, inputFile, NO_HEADER);
    }

}