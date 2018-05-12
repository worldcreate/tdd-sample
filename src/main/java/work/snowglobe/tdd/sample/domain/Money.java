package work.snowglobe.tdd.sample.domain;

/**
 * 日本円
 */
public enum Money {
    ONE(1),
    FIVE(5),
    TEN(10),
    FIFTY(50),
    ONE_HUNDRED(100),
    FIVE_HUNDRED(500),
    ONE_THOUSAND(1000),
    TWO_THOUSAND(2000),
    FIVE_THOUSAND(5000),
    TEN_THOUSAND(10000);

    Integer value;

    Money(Integer value) {
        this.value = value;
    }

    public Money of(Integer value) {
        for (Money money : Money.values()) {
            if (money.value.equals(value)) {
                return money;
            }
        }
        throw new IllegalArgumentException(value + " is not member of Money");
    }

    public Integer getValue() {
        return this.value;
    }
}
