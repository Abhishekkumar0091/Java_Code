public class ArrayDemo5 
{
	public static void main(String[] args) 
	{
		int [] arr = new int [] {10,20,30,40,50};
        //Display value of array in this format without using if,else
		//format->[10,20,30,40,50]
		System.out.print("["+arr[0]);
		for(int i = 0; i<arr.length; i++)
		{
		System.out.print(", "+arr[i]);
		}
		System.out.println("]");
}

}
