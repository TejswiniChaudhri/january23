package interface23;

public class parent2 implements parent1 
{

	
	public void m1()
	{
		
	System.out.println("m1 is running");	
	}

	
	public void m2() 
	{
	System.out.println("m2 is running");	
		
	
	
	
	}

 public static void main(String[] args)
     {
	
    parent2 a=new parent2();
     
     a.m1();
     a.m2();
     
     System.out.println(a.a);
     }
     
     }
