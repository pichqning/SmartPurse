package SSD.SmartPurse;

public class Money {

    protected int value;
    protected String currency;

    public Money (int value) {

    }

    public Money() {

    }

    public int getValue() {
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
