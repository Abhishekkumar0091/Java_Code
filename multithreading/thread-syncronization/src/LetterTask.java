
public class LetterTask 
{
     public synchronized void printLetters() 
     {
    	 System.out.println(Thread.currentThread().getName()+" started!");
    	 for(int c=65;c<=90;c++)
    	 {
    		 System.out.print((char)c+" ");
    	 }
    	 System.out.println();
    	 System.out.println(Thread.currentThread().getName()+" teminated\n");
     }
}
