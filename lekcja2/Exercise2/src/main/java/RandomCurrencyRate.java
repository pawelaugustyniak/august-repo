import pl.raiffeisen.CurrencyRate;
import pl.raiffeisen.RandomCurrencyRateGenerator;
import pl.raiffeisen.RandomNumbersGenerator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class RandomCurrencyRate {

    public static void main(String[] args) {


        RandomCurrencyRateGenerator generator = new RandomCurrencyRateGenerator();

       CurrencyRate randomCurrencyRate = generator.getRandomCurrencyRate(new BigDecimal("3.5"),
                new BigDecimal("4.5"),
                new BigDecimal("0.0001"),
                new BigDecimal("0.5"));

        System.out.println(randomCurrencyRate);
    }

}
