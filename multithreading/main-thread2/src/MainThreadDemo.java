class DemoThread extends Thread
  {
	  public void run()
	  {
		  System.out.println("A");
		  System.out.println("B");
		  System.out.println("C");
	  }
  }

public class MainThreadDemo extends Thread
{
  public static void main(String[] args)
  {
	 DemoThread th  = new DemoThread();
	 th.start();
	 try
	 {
		 th.join();
	 }
	 catch(Exception ex) {}
	 System.out.println("X");
	 System.out.println("Y");
	 System.out.println("Z");
}
}
  

