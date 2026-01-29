
public class Atm 
{
   private String holderName;
   private int accountNumber;
    public Atm(String holderName,int accountNumber)
    {
    	this.holderName=holderName;
    	this.accountNumber=accountNumber;
    	System.out.println("Account created for "+holderName);
    }
}
