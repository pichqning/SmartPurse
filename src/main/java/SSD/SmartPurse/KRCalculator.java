package SSD.SmartPurse;

public class KRCalculator implements Calculator {

    private double KRval;

    public KRCalculator(){
        KRval = Currency.valueOf("won").getValue();
    }

    @Override
    public double convert(Money money) {
        double value = money.getValue();
        String curr = money.getCurrency().toLowerCase();
        double other = Currency.valueOf(curr).getValue();
        return value*KRval/other;
    }
}
