
public class SmartPhone extends Phone
{
	public SmartPhone()
	{
		this("Samsung");
	}
	SmartPhone(String brand)
	{
		super(brand);
		System.out.println("Smartphone ready");
	}
}
