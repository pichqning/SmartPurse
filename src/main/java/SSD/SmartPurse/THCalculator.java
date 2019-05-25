package SSD.SmartPurse;

public class THCalculator implements Calculator {

    private double THval;

    public THCalculator (){
        THval = Currency.valueOf("baht").getValue();
    }

    @Override
    public double convert(Money money) {
        double value = money.getValue();
        String curr = money.getCurrency().toLowerCase();
        double other = Currency.valueOf(curr).getValue();
        return value*THval/other;
    }
}
