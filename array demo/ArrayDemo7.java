public class ArrayDemo7 
{
	static void doTask(int[] y)
	{
		y[0]=900;
	}
	public static void main(String[] args) 
	{
		int[] x= {10,20,30,40};
		doTask(x);
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}
	
