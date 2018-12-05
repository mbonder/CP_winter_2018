package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class debitacccounts extends Account {


    public debitacccounts(Integer accountID, Double balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
    }

    public debitacccounts(Integer accountID, Double balance, Customer customer) {
        super(accountID, balance, customer);
    }


}
