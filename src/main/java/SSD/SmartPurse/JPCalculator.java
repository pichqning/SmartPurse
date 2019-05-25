package SSD.SmartPurse;

import java.util.List;

public class JPCalculator implements Calculator {

    private double val;

    public JPCalculator(){
        val = Currency.yen.getValue();
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
        return new JPMoney(sum);
    }
}
