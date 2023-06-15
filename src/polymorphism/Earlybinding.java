package polymorphism;

public class Earlybinding {



		
public  void m1()
{
System.out.println("method without argument");	

}	
	
public  void m1(int a)

{
System.out.println("method with argument");	
}
	
  public void m1(boolean b)
 {
System.out.println("method with argument boolean");	
 
 }	
public static void main(String[] args)
{
Earlybinding a=new Earlybinding();

a.m1();
a.m1(false);
a.m1(0);



}
}