package SSD.SmartPurse;

import java.util.List;

public class KRCalculator implements Calculator {

    private double KRval;

    public KRCalculator(){
        KRval = Currency.won.getValue();
    }

    @Override
    public Money convert(List<Money> monies) {
        double sum = 0;
        for (Money money : monies) {
            double value = money.getValue();
            String curr = money.getCurrency().toLowerCase();
            double other = Currency.valueOf(curr).getValue();
            sum += value*other/KRval;
        }
        return new KRMoney(sum);
    }
}
