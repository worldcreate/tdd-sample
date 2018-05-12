package work.snowglobe.tdd.sample.vending_machine;

import work.snowglobe.tdd.sample.Money;

public class VendingMachine {

    Money inputMoney;

    public VendingMachine() {
    }

    public void insertMoney(Money money) {
        this.inputMoney = money;
    }

    public Integer getCurrentMoney() {
        if (inputMoney == Money.TEN) {
            return 10;
        } else if (inputMoney == Money.FIFTY) {
            return 50;
        }
        return null;
    }
}
