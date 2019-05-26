package SSD.SmartPurse;

public class Money {

    protected double value;
    protected String currency;

    public Money (double value) {

    }

    public Money() {

    }

    public double getValue() {
        double formatVal = Double.parseDouble(String.format("%.3f",value));
        return formatVal;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return String.format("%.3f %s", value,currency);
    }
}
