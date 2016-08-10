package pl.raiffeisen;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

class AverageCalculator {
    private static final int PRECISION = 4;

    BigDecimal calculateAverage(List<BigDecimal> salaries) {
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
}
