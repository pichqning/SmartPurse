package SSD.SmartPurse;

import java.util.List;

public class THCalculator implements Calculator {

    private double THval;

    public THCalculator (){
        THval = Currency.baht.getValue();
    }

    @Override
    public Money convert(List<Money> monies) {
        double sum = 0;
        for (Money money : monies) {
        double value = money.getValue();
        String curr = money.getCurrency().toLowerCase();
        double other = Currency.valueOf(curr).getValue();
        sum += value*other/THval;
        }
        return new THMoney(sum);
    }
}
