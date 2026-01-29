
public class Text 
{
  public static void main(String[] args)
  {
	  LetterTask task = new LetterTask();
	  MyThread th1 = new MyThread(task);
	  MyThread th2 = new MyThread(task);
	  MyThread th3 = new MyThread(task);
	  th1.start();
	  th2.start();
	  th3.start();
	  
  }
}
  

