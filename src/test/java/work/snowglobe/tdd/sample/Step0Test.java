package work.snowglobe.tdd.sample;

import org.junit.Test;
import work.snowglobe.tdd.sample.domain.Money;
import work.snowglobe.tdd.sample.domain.vending_machine.VendingMachine;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


/**
 * <ul>
 *     <li>10円玉、50円玉、100円玉、500円玉、1000円札を１つずつ投入できる。</li>
 *     <li>投入は複数回できる。</li>
 *     <li>投入金額の総計を取得できる。</li>
 *     <li>払い戻し操作を行うと、投入金額の総計を釣り銭として出力する。</li>
 * </ul>
 *
 */
public class Step0Test {

    /**
     * 10円挿入テスト
     *
     * @throws IOException
     */
    @Test public void insertTenCoinTest() throws IOException {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertMoney(Money.TEN);
        assertThat(vendingMachine.getCurrentMoney(), is(10));
    }

    /**
     * 50円挿入テスト
     *
     * @throws IOException
     */
    @Test public void insertFiftyCoinTest() throws IOException {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertMoney(Money.FIFTY);
        assertThat(vendingMachine.getCurrentMoney(), is(50));
    }
}
