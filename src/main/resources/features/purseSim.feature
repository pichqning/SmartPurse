Feature: Simulated Smart Purse such as add, remove and remove all
        As a User
        I can add money, remove some money, and remove all money

  Background:
    Given A purse with money value 100.00 and baht currency inside
    Given the same purse with money value 10000.00 and yen currency inside
    Given the same purse with money value 3.00 and dollar currency inside
    Given the same purse with money value 10000.00 and won currency inside

  Scenario: add more money
    Then the size of my purse should be 4
    When I add more money which is 1250.00 yuan
    Then the size of my purse should be 5
    When I add more money which is 50.00 pound
    Then the size of my purse should be 6
    When I add more money which is 10.0 dollar
    Then the size of my purse should be 7


  Scenario: deposit money
    When I deposit some money which is 100.00 baht
    Then the size of my purse should be 10
    When I deposit some money which is 1250.00 yuan
    Then the size of my purse should be 9

  Scenario: deposit not existed money
    When I deposit some money which is 1000000.00 baht
    Then the size of my purse should be 13

  Scenario: deposit all money
    When I deposit all money in the purse
    Then the size of my purse should be 0
