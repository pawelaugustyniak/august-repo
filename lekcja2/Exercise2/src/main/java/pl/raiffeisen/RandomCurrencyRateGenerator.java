package pl.raiffeisen;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by rb21776 on 2016-07-21.
 */
public class RandomCurrencyRateGenerator {

    public static final String TWO = "2.0";
    public static final int ACCOUNT_PRECISION = 5;

    private static BigDecimal divideByTwoRoundingUp(BigDecimal spread) {
        return spread.divide(
                new BigDecimal(TWO),
                new MathContext(ACCOUNT_PRECISION, RoundingMode.HALF_UP));
    }

    public CurrencyRate getRandomCurrencyRate(BigDecimal from,
                                              BigDecimal to,
                                              BigDecimal spreadMin,
                                              BigDecimal spreadMax) {

        BigDecimal currencyRateCenter = RandomNumbersGenerator.getRandomBetween(from, to);

        BigDecimal spread = RandomNumbersGenerator.getRandomBetween(spreadMin, spreadMax);
        BigDecimal halfOfSpread = divideByTwoRoundingUp(spread);

        BigDecimal bid = currencyRateCenter.add(halfOfSpread);
        BigDecimal ask = currencyRateCenter.subtract(halfOfSpread);
//        BigDecimal ask = currencyRateCenter.add(halfOfSpread.negate());

        CurrencyRate currencyRate = new CurrencyRate();
        currencyRate.setAsk(ask);
        currencyRate.setBid(bid);

        return currencyRate;
    }
}
