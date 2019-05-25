package SSD.SmartPurse;

public class USCalculator implements Calculator {

    private double val;

    public USCalculator(){
        val = Currency.valueOf("usd").getValue();
    }

    @Override
    public double convert(Money money) {
        double value = money.getValue();
        String curr = money.getCurrency().toLowerCase();
        double other = Currency.valueOf(curr).getValue();
        return value* val /other;
    }
}
