package pl.raiffeisen;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class AmountsParser {

    private final NumberFormat currencyInstance;

    public AmountsParser(Locale locale) {
        currencyInstance = DecimalFormat.getCurrencyInstance(locale);
        ((DecimalFormat) currencyInstance).setParseBigDecimal(true);
    }

    List<BigDecimal> parseSalaries(List<String> salaryStrings) {
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
