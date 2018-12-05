package pl.waw.sgh.bank;

public class Checkingaccount extends Account {

    public Checkingaccount(Integer accountID, Double balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
    }

    public Checkingaccount(Integer accountID, Double balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
