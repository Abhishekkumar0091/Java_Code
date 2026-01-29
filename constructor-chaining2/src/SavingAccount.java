
public class SavingAccount extends Account
{
    private double balance;
    
    //Default saving account
    public SavingAccount()
    {
    	this("unknown",0,0.0);
    	System.out.println("Defult save account");
    }
    public SavingAccount(String holderName, int accountNumber, double balance)
    {
    	super(holderName,accountNumber);
    	this.balance=balance;
    	System.out.println("Saving account with " + balance+ " created");
    	System.out.println("Real saving Account");
    }
    
}
