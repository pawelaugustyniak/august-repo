package pl.raiffeisen;

import java.math.BigDecimal;

/**
 * Created by rb21776 on 2016-07-21.
 */
public class RandomNumbersGenerator {


    public static BigDecimal getRandomBetween(BigDecimal from, BigDecimal to) {
        BigDecimal difference = to.subtract(from);
        return from.add(
                difference.multiply(getRandomBigDecimal()));
    }

    public static BigDecimal getRandomBigDecimal() {
        return new BigDecimal(Math.random());
    }
}
