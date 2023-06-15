package inheritance;

public class Manju extends Anju   //sub class
{

   public void mobile()
{
   System.out.println("iphone");

}

   public static void main(String[] args)
{

   Manju a=new Manju();
  
   a.home();
   a.car();
   a.mobile();
}
}
