
public class TextThread {

	public static void main(String[] args) 
	{
		Thread th = new Thread(new Task());
		th.start();
	}

}
