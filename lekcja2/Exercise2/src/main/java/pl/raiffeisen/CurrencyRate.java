package pl.raiffeisen;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by rb21776 on 2016-07-21.
 */
public class CurrencyRate {
    private BigDecimal ask;
    private BigDecimal bid;

    @Override
    public String toString() {
        MathContext mathContext = new MathContext(5);
        return "CurrencyRate{" +
                "ask=" + ask.round(mathContext) +
                ", bid=" + bid.round(mathContext) +
                '}';
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setAsk(BigDecimal ask) {
        this.ask = ask;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }
}
