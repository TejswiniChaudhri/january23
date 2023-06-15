package inheritanceoops;

public class Hierarchical2 extends Hierarchical
{
	public void nicname()
	{	
	System.out.println("Teja");	
	}
	public void familyname()
	{
	System.out.println("starfamily");
	}
	
	public static void main(String[] args) 
	
	{
		
	Hierarchical2 c =new Hierarchical2();
	c.firstname();
	c.middlename();
	c.lastname();
	c.nicname();
	c.familyname();
	
	}
	
	
}
