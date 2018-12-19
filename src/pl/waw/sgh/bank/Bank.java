package pl.waw.sgh.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank<accType> {


    private List<Customer> custList = new ArrayList<>();


    private List<Account> accList = new ArrayList<>();

    private Integer lastCustID = 0;

    private Integer lastAccID = 100;

    //public API

    public Customer newCustomer(String firstName,
                                String lastName,
                                String email) {

        Customer cust = new Customer(lastCustID++, firstName, lastName, email);
        custList.add(cust);
        return cust;
    }

    public Account newAccount(Customer cust, String accType) {
        Account acc;
        switch (accType) {
            case "Savings":
                acc = new savingsaccount(lastAccID++, 0.0, cust);
                break;
            case "Debit":
                acc = new debitacccounts(lastAccID++, 0.0, cust);
                break;
            default:
                acc = new Checkingaccount(lastAccID++, 0.0, cust);
        }
        accList.add(acc);
        return acc;
    }

    private void findAccountbyID(Integer accID){
        for (Account acc : accList) {
            if (acc.getAccountID().equals(accID)) {

            }

        }
    }


    public void transfer(Integer fromAccID, Integer toAccID, Double amount) {

    }

    @Override
    public String toString() {
        return "Bank{" +
                "custs=\n" + custList +
                ",\naccs=\n" + accList +
                '}';
    }
}