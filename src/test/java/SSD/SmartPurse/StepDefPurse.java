package SSD.SmartPurse;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Do;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefPurse  {
    Purse purse;

    @Before
    public void init() {
        purse = Purse.getInstance();
    }

    @Given("A purse with money value (\\d+.\\d+) and (.*) currency inside")
    public void addNewMoney(double value,String currency) {
        purse.addMoney(value,currency);
    }

    @Given("the same purse with money value (\\d+.\\d+) and (.*) currency inside")
    public void addMoney(double value,String currency) {
        purse.addMoney(value,currency);
    }

    @Given("A purse with no money inside")
    public void clearMoney () {
        assertEquals(0,purse.getMoneyList().size());
        purse.removeAll();
    }

    @When("I add more money which is (\\d+.\\d+) (.*)")
    public void addMoreMoney (double value , String currency){
        purse.addMoney(value,currency);
        assertNotNull(purse.getMoneyList());
    }

    @When("I deposit some money which is (\\d+.\\d+) (.*)")
    public void depositMoney (double value ,String currency){
        Money money = purse.deposit(value,currency);
        assertNotNull(money);
    }

    @When("I ask for all my money in (.*) currency")
    public void convertMoney (String currency) {
        assertNotNull(purse.convertMoney(currency));
    }

    @Then("amount of (.*) value should be (\\d+.\\d+)")
    public void amountSpecific (String currency , double value) {
        String money = purse.showSpecificByCur(currency);
        assertEquals( String.format("%.3f %s", value,currency),money);
    }

    @Then("amount of the converted money should be (\\d+.\\d+) (.*)")
    public void amountCurrency (double value , String currency){
        Money m = purse.convertMoney(currency);
        assertEquals(value,m.getValue());
    }

    @When("I deposit all money in the purse")
    public void removeAll(){
        purse.removeAll();
        assertEquals(0,purse.moneyList.size());
    }

    @Then("the size of my purse should be (\\d+)")
    public void getSize(int size) {
        assertEquals(size,purse.moneyList.size());
    }


}
