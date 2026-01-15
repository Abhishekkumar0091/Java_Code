public class ArrayDemo8 
{
	static void doTask(int[] y)
	{
		for(int i=0; i<y.length; i++)
		{
			y[i]=-1;
		}
	}
	public static void main(String[] args) 
	{
		int[] x= {10,20,30,40};
		doTask(x);
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}
	
