
public class Student 
{
    private String name;
    private String course;
   public Student() {
	   System.out.println("defult constructor called");
   };
    public Student(String name,String course)
    {
    	this.name=name;
    	this.course=course;
    }
    
	@Override
	public String toString() 
	{
		return "Student [name=" + name + ", course=" + course + "]";
	}
    
}
