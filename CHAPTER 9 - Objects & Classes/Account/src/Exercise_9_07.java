public class Exercise_9_07 {
    public static void main(String[] args) {
        // new Account object
        Account account = new Account(1122, 20000);
        // sets annual interest rate for all objects of Account class
        Account.setAnnualInterestRate(4.5);

        // invoke withdraw and deposit methods
        account.withdraw(2500);
        account.deposit(3000);
        // display account object details
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " +
                account.getMonthlyInterest());
        System.out.println("This account was created at " +
                account.getDateCreated());
    }
}
