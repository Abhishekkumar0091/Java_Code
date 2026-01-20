
public class TableTask 
{
   private int num;
   public TableTask(int num)
   {
	   this.num=num;
   }
  public void performTask()
  {
	  for(int c = 0; c<=10; c++)
	  {
		  int res = num*c;
		  System.out.println(num+"*"+c+"="+res);
	  }
  }
   }

