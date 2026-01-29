
public class MyThread extends Thread
{
   private LetterTask task;
   public MyThread(LetterTask task)
   {
	   this.task=task;
   }
   public void run()
   {
	   task.printLetters();
   }
 }
