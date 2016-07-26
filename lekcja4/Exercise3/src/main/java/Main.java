import java.math.BigDecimal;

/**
 * Created by rb21776 on 2016-07-25.
 */
public class Main {
    public static void main(String[] args) {
        CompoundInterest calculator = new CompoundInterest(new BigDecimal("1500"),new BigDecimal("0.043"),new BigDecimal("4"), new BigDecimal("6"));
        CompoundInterest calculator2 = new CompoundInterest(new BigDecimal("1500"),new BigDecimal("0.043"),new BigDecimal("1"), new BigDecimal("6"));
        BigDecimal a = calculator2.getAccumulatedValue();
        BigDecimal b = calculator.getAccumulatedValue();

        System.out.println(a);
        System.out.println(b);
    }
}
