package SSD.SmartPurse;

public class CHCalculator implements Calculator {

    private double val;

    public CHCalculator(){
        val = Currency.valueOf("yuan").getValue();
    }

    @Override
    public double convert(Money money) {
        double value = money.getValue();
        String curr = money.getCurrency().toLowerCase();
        double other = Currency.valueOf(curr).getValue();
        return value* val /other;
    }
}
