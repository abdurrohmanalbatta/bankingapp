package bankingapp;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private static final double INTEREST_RATE = 0.03;
    
    BankAccount(String accountNumber, String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }
    BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    
    public void addAnnualInterest(){
        this.balance += this.balance * INTEREST_RATE;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public String getAccountDetails(){
        return  "Account Number: " + this.accountNumber 
                + "\nAccount Holder: " + this.accountHolderName  
                + "\nBalance: $" + this.balance + "\n"; 
    }
}
