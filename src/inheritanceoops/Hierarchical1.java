package inheritanceoops;

public class Hierarchical1 extends Hierarchical 
{
	public void nicname()
	{	
	System.out.println("Teja");	
	}
	public void familyhostname()
	{
	System.out.println("pavan");	
		
	}
	public static void main(String[] args) {
		
	Hierarchical1 d=new Hierarchical1();
	
	d.firstname();
	
	d.middlename();
	
	d.lastname();
	
	d.nicname();
	
	d.familyhostname();
	
	}
	
}
