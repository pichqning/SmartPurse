package SSD.SmartPurse;

public class UKCalculator implements Calculator {

    private double val;

    public UKCalculator(){
        val = Currency.valueOf("pound").getValue();
    }

    @Override
    public double convert(Money money) {
        double value = money.getValue();
        String curr = money.getCurrency().toLowerCase();
        double other = Currency.valueOf(curr).getValue();
        return value* val /other;
    }
}
