
public class SavingsAccount extends BankAccount {
    private double withdrawalLimit;
    
    SavingsAccount(String accountNumber, String accountHolderName, double balance, double withdrawalLimit){
        super(accountNumber,accountHolderName,balance);
        this.withdrawalLimit = withdrawalLimit; 
    }
    
    @Override
    public void withdraw(double amount){
        if(amount > 0 && amount <= this.getBalance() && amount <= this.withdrawalLimit){
            super.withdraw(amount);
        }
    } 
    
        
   
}
