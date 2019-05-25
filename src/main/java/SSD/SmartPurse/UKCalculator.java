package SSD.SmartPurse;

import java.util.List;

public class UKCalculator implements Calculator {

    private double val;

    public UKCalculator(){
        val = Currency.pound.getValue();
    }

    @Override
    public Money convert(List<Money> monies) {
        double sum = 0;
        for (Money money : monies) {
            double value = money.getValue();
            String curr = money.getCurrency().toLowerCase();
            double other = Currency.valueOf(curr).getValue();
            sum += value*other/val;
        }
        return new UKMoney(sum);
    }
}
