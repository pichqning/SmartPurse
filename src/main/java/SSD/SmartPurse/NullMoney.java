package SSD.SmartPurse;

public class NullMoney extends Money {
    public NullMoney(double value) {
        super(value);
    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public String getCurrency() {
        return "No such money.";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
