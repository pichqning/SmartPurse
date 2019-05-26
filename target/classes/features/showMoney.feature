Feature: Show money in any currency
        As a User
        I can know the value of specified currency.

  Background:
    Given A purse with no money inside

  Scenario: Only Thai Baht currency
    When I add more money which is 500000 baht
    When I add more money which is 1000000 baht
    When I add more money which is 3000000 won
    When I add more money which is 2000000 yuan
    When I add more money which is 5000000 yen
    Then amount of baht value should be 1500000.000
    When I deposit some money which is 500000 baht
    Then amount of baht value should be 1000000.000
    When I deposit all money in the purse

  Scenario: No any currency
    Then amount of baht value should be 0.0
    Then amount of won value should be 0.0
    When I add more money which is 500000 baht
    When I add more money which is 1000000 baht
    When I add more money which is 3000000 won
    When I add more money which is 2000000 yuan
    When I add more money which is 5000000 yen
    Then amount of dollar value should be 0.0
    Then amount of pound value should be 0.0
