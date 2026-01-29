class A 
{
    B method1() 
    {
    	System.out.println("method 1 called");
        return new B();
    }
}

class B 
{
    C method2() 
    {
    	System.out.println("method 2 called");
        return new C();
    }
}

class C
{
    D method3() 
    {
    	System.out.println("method 3 called");
        return new D();
    }
}

class D
{
    bb method4() 
    {
    	System.out.println("method 4 called");
        return new bb();
    }
}

class bb 
{ 
	void show()
	{
		System.out.println("show called");
	}
}
