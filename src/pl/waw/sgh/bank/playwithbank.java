package pl.waw.sgh.bank;

public class playwithbank {

    public static void main(String[] args) {
        Bank bank = new Bank();
        customer c1 = bank.newCustomer("John", "Brown", "john@brown.com")
        customer c2 = bank.newCustomer("Anna", "Smith", "anna@smith.com")
        Account a1 = bank.newAccount(c1, "Debit");
        Account a2 = bank.newAccount(c1, "Saving");
        Account a3 = bank.newAccount(c1, "");


        Account a4 = bank.newAccount(c2, "Debit");
        Account a5 = bank.newAccount(c2, "Saving");

        System.out.println(bank);
    }
}
