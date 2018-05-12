package work.snowglobe.tdd.sample.domain.vending_machine;

import work.snowglobe.tdd.sample.domain.Money;

/**
 * 自動販売機クラス
 */
public class VendingMachine {

    Integer currentMoney = 0;

    public VendingMachine() {
    }

    /**
     * お金の挿入を行う
     *
     * @param money 挿入金額
     */
    public void insertMoney(Money money) {
        if (money == Money.TEN) {
            this.currentMoney += 10;
        } else if (money == Money.FIFTY) {
            this.currentMoney += 50;
        }
    }

    public Integer getCurrentMoney() {
        return currentMoney;
    }
}
