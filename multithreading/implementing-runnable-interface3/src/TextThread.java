
public class TextThread {

	public static void main(String[] args) 
	{
		Task1 t1 = new Task1();
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(new Task2());
		Thread th3 = new Thread(t1);
		th1.start();
		th2.start();
		th3.start();
	}

}
