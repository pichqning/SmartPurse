package SSD.SmartPurse;

public class JPCalculator implements Calculator {

    private double val;

    public JPCalculator(){
        val = Currency.valueOf("yen").getValue();
    }

    @Override
    public double convert(Money money) {
        double value = money.getValue();
        String curr = money.getCurrency().toLowerCase();
        double other = Currency.valueOf(curr).getValue();
        return value* val /other;
    }

}
