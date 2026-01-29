
public class TableTask extends Thread
{
    private int num;
    public TableTask(int num)
    {
       this.num=num;
    }
    public void run()
    {
    	performTask();
    }
    public void performTask()
    {
    	for(int c=1; c<=10; c++)
    	{
    		int res = num*c;
    		System.out.println(num+"*"+c+"="+res);
    	}
    }
	
   }

