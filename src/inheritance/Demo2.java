package inheritance;

public class Demo2 extends Demo1
{
public void nicname()
{	
System.out.println("Teja");	
}

  public static void main(String[] args) 
  {

 Demo2 a=new Demo2();
  
 a.firstname();
 a.middlename();
 a.lastname();
 a.nicname();
 
  }
}
