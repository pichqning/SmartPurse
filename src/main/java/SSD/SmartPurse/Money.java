package SSD.SmartPurse;

public class Money {

    protected double value;
    protected String currency;

    public Money (double value) {

    }

    public Money() {

    }

    public double getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return String.format("%d %s", value,currency);
    }
}
