package pl.raiffeisen;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.*;
import java.util.*;

class AverageSalaryCalculator {

    private static final int SALARY_COLUMN_INDEX = 1;
    private static final boolean NO_HEADER = false;
    private CsvEditor csvEditor = new CsvEditor();
    private static final int PRECISION = 4;
    private final NumberFormat currencyInstance;

    AverageSalaryCalculator(Locale locale) {
        currencyInstance = DecimalFormat.getCurrencyInstance(locale);
        ((DecimalFormat) currencyInstance).setParseBigDecimal(true);
    }

    BigDecimal calculate(String inputFile) {
        return calculateAverage(
                parseSalaries(
                        getSalaryColumn(inputFile)));
    }

    private List<String> getSalaryColumn(String inputFile) {
        return csvEditor.getColumnAt(SALARY_COLUMN_INDEX, inputFile, NO_HEADER);
    }

    private BigDecimal calculateAverage(List<BigDecimal> salaries) {
        return getSum(salaries)
                .divide(
                        new BigDecimal(salaries.size()),
                        new MathContext(PRECISION, RoundingMode.HALF_UP));
    }

    private BigDecimal getSum(List<BigDecimal> salaries) {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal salary : salaries) {
            sum = sum.add(salary);
        }

        return sum;
    }

    private List<BigDecimal> parseSalaries(List<String> salaryStrings) {
        checkEnoughLines(salaryStrings);
        List<BigDecimal> result = new ArrayList<>();
        for (String salaryString : salaryStrings) {
            result.add(getParsedSalary(salaryString));
        }
        return result;
    }

    private BigDecimal getParsedSalary(String salaryString) {
        try {
            return (BigDecimal) currencyInstance.parse(salaryString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    private void checkEnoughLines(List<String> lines) {
        if (lines.size() < 2) throw new RuntimeException("Too few lines");
    }


}