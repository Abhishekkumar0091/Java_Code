
public class SavingAccount extends Atm
{
    private double balance; 
    public SavingAccount()
    {
    	//Default Saving account
    	this("unknown",0,0.0);
    	System.out.println("Defult account created");
    }
       //saving account with balance
   public SavingAccount(String holderName,int accountNumber,double balance)
   {
	   super(holderName,accountNumber);
	   this.balance=balance;
	   System.out.println("Saving Account with "+balance+ " created");
   }
}
