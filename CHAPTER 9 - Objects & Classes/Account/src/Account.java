import java.util.Date;

public class Account {

    // private variables
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    // no-arg constructor
    public Account() {
        this(0, 0.0);
    }
    // arg constructor
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }
    // getters
    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return Account.annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return Account.annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return this.balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
