package work.snowglobe.tdd.sample.vending_machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class VendingMachine {
    InputStream inputStream;
    public VendingMachine(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void insertCoin() {

    }

    public Integer getCurrentMoney() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = bufferedReader.readLine();
        return Integer.parseInt(line);
    }
}
