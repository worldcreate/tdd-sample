package work.snowglobe.tdd.sample.domain.vending_machine;

import work.snowglobe.tdd.sample.domain.Money;

/**
 * 自動販売機クラス
 */
public class VendingMachine {

    Money inputMoney;

    public VendingMachine() {
    }

    /**
     * お金の挿入を行う
     *
     * @param money 挿入金額
     */
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
