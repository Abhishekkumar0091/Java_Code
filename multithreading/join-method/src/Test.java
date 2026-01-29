
public class Test 
{
	public static void main(String[] args) throws Exception
	{ 
		long start = System.currentTimeMillis();
		System.out.println();
		TableTask t1 = new TableTask(7);
		TableTask t2 = new TableTask(10);
		TableTask t3 = new TableTask(12);
		TableTask t4 = new TableTask(8);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
	    long stop = System.currentTimeMillis();
	    long time = stop-start;
	    System.out.println("Total time takan "+time+" millisecond");
	}

}
