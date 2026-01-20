
public class Test 
{
	public static void main(String[] args)
	{ 
		TableTask t1 = new TableTask(7);
		TableTask t2 = new TableTask(10);
		TableTask t3 = new TableTask(12);
		TableTask t4 = new TableTask(8);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	      
	}

}
