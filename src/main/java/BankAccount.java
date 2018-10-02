import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        accountNumber = 0;
        accountType = accountCategory;
        accountBalance = 0.0;
        ownerName = name;
        interestEarned = 0.0;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    //Getters
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getInterestEarned() {
        return interestEarned;
    }


    //Setters
    public void setAccountNumber(final int setNumber) {
        accountNumber = setNumber;
    }
    public void setAccountBalance(final double setBalance) {
        accountBalance = setBalance;
    }
    public void setOwnerName(final String setOwner) {
        ownerName = setOwner;
    }
    public void setInterestEarned(final double setEarned) {
        interestRate = setEarned;
    }
}
