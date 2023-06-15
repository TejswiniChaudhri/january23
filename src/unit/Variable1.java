	package unit;

public class Variable1 
{
    public static void m1() 
    {
   
    System.out.println("method m1 is running");
    
    }
	
	public void m2()
	{
	
	System.out.println("method m2 is running");
	
	}
	
	public static void m3()
	{
	System.out.println("method m3 is running");
	}
	public static void main(String[] args)
	{
	m1();
	
	Variable1 a1 = new Variable1();
	a1.m2();
	
	m3();
	
	
	}
	
	
}
