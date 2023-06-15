package polymorphism;

public class Demo2 extends Demo1
{

public String money()	
{
super.money();	
System.out.println("1000");
return null;

}	
public void mobile()
{
System.out.println("Realme 8 pro");
}
public static void main(String[] args) 
{
	
  //Demo2 a=new Demo2();	
	
	//a.mobile();
	//a.money();
	
	//Demo1 b=new Demo1();
	//b.money();
	
	Demo1 c=new Demo2();
	c.money();
	
}	
}
