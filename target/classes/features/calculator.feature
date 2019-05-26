Feature: Calculate the amount value of specific currency
        As a user
        I can know the amount of specific currency no matter what original currency it was.

Background:
  Given A purse with money value 100.00 and baht currency inside
  Given the same purse with money value 10000.00 and yen currency inside
  Given the same purse with money value 3.00 and dollar currency inside
  Given the same purse with money value 10000.00 and won currency inside

Scenario: Converting to some currency
  When I ask for all my money in yuan currency
  Then amount of the converted money should be 753.571 yuan
  When I ask for all my money in won currency
  Then amount of the converted money should be 125595.238 won
  When I ask for all my money in pound currency
  Then amount of the converted money should be 83.071 pound

  Scenario: Convert empty purse
    When I remove all money in the purse
    When I ask for all my money in baht currency
    Then amount of the converted money should be 0.000 baht
