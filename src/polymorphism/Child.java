package polymorphism;

public class Child extends Parent
{

public void  b()
{
System.out.println("method b child");
}
public void c()
{
	
System.out.println("method c child");	
}
public static void main(String[] args) {
	{
	
	Child d=new Child();	
	d.a();
	d.b();
	d.c();
	
	}


}
}
