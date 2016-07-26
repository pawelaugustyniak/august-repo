import java.math.BigDecimal;
import java.util.Random;
import java.lang.IllegalArgumentException;

/**
 * Created by Paweł on 2016-07-20.
 */
public class DecimalRandom {
    public static void main(String[] args) {

        BigDecimal minValue = new BigDecimal("3.1");
        BigDecimal maxValue = new BigDecimal("4.6");

        BigDecimal minSpread = new BigDecimal("0.0001");
        BigDecimal maxSpread = new BigDecimal("0.01");


        BigDecimal randomBetweenMinMaxValues = randomTwoDecimalsInt(minValue, maxValue);
        BigDecimal randomBetweenMinMaxSpread = randomTwoDecimalsDouble(minSpread, maxSpread);
        BigDecimal randomSpread = randomBetweenMinMaxSpread.setScale(4, BigDecimal.ROUND_CEILING);

        BigDecimal ask=  randomBetweenMinMaxValues.setScale(4, BigDecimal.ROUND_HALF_DOWN);
        System.out.println("Random spread: " +randomSpread);
        System.out.println("Ask rate: " +ask);


        BigDecimal bid = ask.add(randomSpread).setScale(4, BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Bid spread: "+ bid);

        BigDecimal centerInitial = bid.add(ask);
        BigDecimal center = centerInitial.divide(new BigDecimal("2"));
        System.out.println("Center: "+ center);


    }


    public static BigDecimal randomTwoDecimalsInt(BigDecimal min, BigDecimal max) {

        int ifgreater = max.compareTo(min);

        if(ifgreater<=0) {
            try {
                throw new IllegalAccessException("max must be greater than min");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        int minInt = min.intValue();
        int maxInt = max.intValue();

        Random random = new Random();

        double scope =  random.nextDouble();
        BigDecimal minBig = new BigDecimal(minInt);
        BigDecimal maxBig = new BigDecimal(maxInt);
        BigDecimal dblbBig = new BigDecimal(scope);

        BigDecimal a = maxBig.subtract(minBig); // max-min
        BigDecimal b = a.multiply(dblbBig);     //(min+max)*scope

        BigDecimal c = b.add(minBig);            //max+ (min+max)*scope


        return c;
    }

    public static BigDecimal randomTwoDecimalsDouble(BigDecimal min, BigDecimal max) {

        int ifgreater = max.compareTo(min);

        if(ifgreater<=0) {
            try {
                throw new IllegalAccessException("max must be greater than min");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        double minDbl = min.doubleValue();
        double maxDbl = max.doubleValue();

        Random random = new Random();

        double scope =  random.nextDouble();
        BigDecimal minBig = new BigDecimal(minDbl);
        BigDecimal maxBig = new BigDecimal(maxDbl);
        BigDecimal dblbBig = new BigDecimal(scope);

        BigDecimal a = maxBig.subtract(minBig); // max-min
        BigDecimal b = a.multiply(dblbBig);     //(min+max)*scope

        BigDecimal c = b.add(minBig);            //max+ (min+max)*scope


        return c;
    }


}
