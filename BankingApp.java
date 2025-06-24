
package bankingapp;


public class BankingApp {

    public static void main(String[] args) {
        BankAccount user_b1 = new BankAccount("15205"
                ,"Abdurahmon Anvariy", 1000);
        user_b1.deposit(500);
        user_b1.withdraw(200);
        user_b1.addAnnualInterest();
        
        SavingsAccount user_s1 = new SavingsAccount("12304", "John Doe"
                , 2000,300);
        
        user_s1.withdraw(500);
        user_s1.withdraw(250);
        
        System.out.println("Bank Account Details:");
        System.out.println(user_b1.getAccountDetails());
        System.out.println("Savings Account Details:");
        System.out.println(user_s1.getAccountDetails());
    }
    
}
