import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by rb21776 on 2016-07-25.
 */
public class CompoundInterest {

    BigDecimal principalSum;  // V_o    1500
    BigDecimal nominalInterestRate; // r   0.043
    BigDecimal compoundingFrequency;  // m  4
    BigDecimal numberOfYear;  //n  6

    public CompoundInterest(BigDecimal principalSum, BigDecimal nominalInterestRate, BigDecimal compoundingFrequency, BigDecimal numberOfYear) {
        this.principalSum = principalSum;
        this.nominalInterestRate = nominalInterestRate;
        this.compoundingFrequency = compoundingFrequency;
        this.numberOfYear = numberOfYear;
    }

    BigDecimal getAccumulatedValue() {

        BigDecimal Vo = principalSum;
        BigDecimal r = nominalInterestRate;
        BigDecimal m = compoundingFrequency;
        BigDecimal n = numberOfYear;
        BigDecimal one = new BigDecimal("1");
        BigDecimal rPlus1= r.add(one);
        int nInt = n.intValue();
        BigDecimal rADD1POWn = rPlus1.pow(nInt);
        BigDecimal rDIVm = r.divide(m);
        BigDecimal rDIVmADD1 = rDIVm.add(one);
        BigDecimal nMULTIPLYm = n.multiply(m);
        int mnInt = nMULTIPLYm.intValue();
        BigDecimal rDIVmADD1POWrm = rDIVmADD1.pow(mnInt);





        if (compoundingFrequency.equals(new BigDecimal("1")))
            return Vo.multiply(rADD1POWn).setScale(4,BigDecimal.ROUND_FLOOR);
        else
            return Vo.multiply(rDIVmADD1POWrm).setScale(4,BigDecimal.ROUND_FLOOR);

    }


}
