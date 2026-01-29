
public class TextThread {

	public static void main(String[] args) 
	{
		Task1 th1 = new Task1();
		Task2 th2 = new Task2();
		th1.start();
		th2.start();
	}

}
