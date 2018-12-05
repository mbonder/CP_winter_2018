package pl.waw.sgh.bank;

public class savingsaccount extends Account {


    public savingsaccount(Integer accountID, Double balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
    }

    public savingsaccount(Integer accountID, Double balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
