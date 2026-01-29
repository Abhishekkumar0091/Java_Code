public class Account 
{
    private String holderName;
    private int accountNumber;
    public Account(String holderName, int accountNumber) 
    {
    	this.holderName=holderName;
    	this.accountNumber=accountNumber;
    	System.out.println("Account Cerated for "+ holderName);
    }
}
