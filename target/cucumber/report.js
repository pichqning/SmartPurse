$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/showMoney.feature");
formatter.feature({
  "line": 1,
  "name": "Show money in any currency",
  "description": "      As a User\r\n      I can know the value of specified currency.",
  "id": "show-money-in-any-currency",
  "keyword": "Feature"
});
formatter.before({
  "duration": 111036,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "A purse with no money inside",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPurse.clearMoney()"
});
formatter.result({
  "duration": 123289157,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Only Thai Baht currency",
  "description": "",
  "id": "show-money-in-any-currency;only-thai-baht-currency",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I add more money which is 500000 baht",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I add more money which is 1000000 baht",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I add more money which is 3000000 won",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I add more money which is 2000000 yuan",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I add more money which is 5000000 yen",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "amount of baht value should be 1500000.000",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I deposit some money which is 500000 baht",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "amount of baht value should be 1000000.000",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I deposit all money in the purse",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "500000",
      "offset": 26
    },
    {
      "val": "baht",
      "offset": 33
    }
  ],
  "location": "StepDefPurse.addMoreMoney(double,String)"
});
formatter.result({
  "duration": 3625124,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000000",
      "offset": 26
    },
    {
      "val": "baht",
      "offset": 34
    }
  ],
  "location": "StepDefPurse.addMoreMoney(double,String)"
});
formatter.result({
  "duration": 211791,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3000000",
      "offset": 26
    },
    {
      "val": "won",
      "offset": 34
    }
  ],
  "location": "StepDefPurse.addMoreMoney(double,String)"
});
formatter.result({
  "duration": 205109,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000000",
      "offset": 26
    },
    {
      "val": "yuan",
      "offset": 34
    }
  ],
  "location": "StepDefPurse.addMoreMoney(double,String)"
});
formatter.result({
  "duration": 170153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5000000",
      "offset": 26
    },
    {
      "val": "yen",
      "offset": 34
    }
  ],
  "location": "StepDefPurse.addMoreMoney(double,String)"
});
formatter.result({
  "duration": 166554,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "baht",
      "offset": 10
    },
    {
      "val": "1500000.000",
      "offset": 31
    }
  ],
  "location": "StepDefPurse.amountSpecific(String,double)"
});
formatter.result({
  "duration": 2776931,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500000",
      "offset": 30
    },
    {
      "val": "baht",
      "offset": 37
    }
  ],
  "location": "StepDefPurse.depositMoney(double,String)"
});
formatter.result({
  "duration": 238008,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "baht",
      "offset": 10
    },
    {
      "val": "1000000.000",
      "offset": 31
    }
  ],
  "location": "StepDefPurse.amountSpecific(String,double)"
});
formatter.result({
  "duration": 372691,
  "status": "passed"
});
formatter.match({
  "location": "StepDefPurse.removeAll()"
});
formatter.result({
  "duration": 38554,
  "status": "passed"
});
formatter.before({
  "duration": 27245,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "A purse with no money inside",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPurse.clearMoney()"
});
formatter.result({
  "duration": 18506,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "No any currency",
  "description": "",
  "id": "show-money-in-any-currency;no-any-currency",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "amount of baht value should be 0.0",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "amount of won value should be 0.0",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I add more money which is 500000 baht",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I add more money which is 1000000 baht",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I add more money which is 3000000 won",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I add more money which is 2000000 yuan",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I add more money which is 5000000 yen",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "amount of dollar value should be 0.0",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "amount of pound value should be 0.0",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "baht",
      "offset": 10
    },
    {
      "val": "0.0",
      "offset": 31
    }
  ],
  "location": "StepDefPurse.amountSpecific(String,double)"
});
formatter.result({
  "duration": 159872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "won",
      "offset": 10
    },
    {
      "val": "0.0",
      "offset": 30
    }
  ],
  "location": "StepDefPurse.amountSpecific(String,double)"
});
formatter.result({
  "duration": 167582,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500000",
      "offset": 26
    },
    {
      "val": "baht",
      "offset": 33
    }
  ],
  "location": "StepDefPurse.addMoreMoney(double,String)"
});
formatter.result({
  "duration": 290956,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000000",
      "offset": 26
    },
    {
      "val": "baht",
      "offset": 34
    }
  ],
  "location": "StepDefPurse.addMoreMoney(double,String)"
});
formatter.result({
  "duration": 351100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3000000",
      "offset": 26
    },
    {
      "val": "won",
      "offset": 34
    }
  ],
  "location": "StepDefPurse.addMoreMoney(double,String)"
});
formatter.result({
  "duration": 420498,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000000",
      "offset": 26
    },
    {
      "val": "yuan",
      "offset": 34
    }
  ],
  "location": "StepDefPurse.addMoreMoney(double,String)"
});
formatter.result({
  "duration": 243149,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5000000",
      "offset": 26
    },
    {
      "val": "yen",
      "offset": 34
    }
  ],
  "location": "StepDefPurse.addMoreMoney(double,String)"
});
formatter.result({
  "duration": 320257,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dollar",
      "offset": 10
    },
    {
      "val": "0.0",
      "offset": 33
    }
  ],
  "location": "StepDefPurse.amountSpecific(String,double)"
});
formatter.result({
  "duration": 251888,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pound",
      "offset": 10
    },
    {
      "val": "0.0",
      "offset": 32
    }
  ],
  "location": "StepDefPurse.amountSpecific(String,double)"
});
formatter.result({
  "duration": 211791,
  "status": "passed"
});
});