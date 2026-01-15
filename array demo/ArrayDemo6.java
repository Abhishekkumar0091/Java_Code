public class ArrayDemo6 
{
	public static void main(String[] args) 
	{
		int [] x =  {10,20,30,40};
		//Declare a double size array and
		//copy each array of above into this array
		int [] y =new int[x.length*2];
		for(int i =0; i<x.length; i++)
		{
			y[i]=x[i];
		}
		
		for(int i=0; i<y.length; i++)
		{
			System.out.println(y[i]);
			
		}
	}
}
	
