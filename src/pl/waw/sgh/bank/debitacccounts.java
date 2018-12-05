package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class debitaccounts extends Account {


    public debitaccounts(Integer accountID, Double balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
    }

    public debitaccounts(Integer accountID, Double balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
