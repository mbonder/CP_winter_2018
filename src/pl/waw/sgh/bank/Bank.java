package pl.waw.sgh.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank<accType> {


    private List<Customer> custList = new ArrayList<>();


    private List<Account> accList = new ArrayList<>();

    private Integer lastCustID = 0;

    private Integer lastAccID = 100;

    //public API

    public Customer newCustomer (String firstName,
                                 String lastName,
                                 String email) {

        Customer cust = new Customer(lastCustID++, firstName, lastName, email);
        custList.add(cust);
        return cust;
    }

    public Account newAccount(Customer cust, String accType);
        Account acc;
        switch (accType) {
        case "Savings":
            acc = new savingsaccount(lastAccID++, 0.0, Customer);
            break;
            case "Debit"
                acc = new debitaccounts(lastAccID++, 0.0, Customer);
            break;
        default:
            acc = new Checkingaccount(lastAccID++, 0.0, Customer);
    }
    accList.add(acc)
    return acc;
    }
}
