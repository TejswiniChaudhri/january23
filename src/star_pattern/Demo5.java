package star_pattern;

public class Demo5 {

	public static void main(String[] args) 
	{

		 int a=10;
		  
		  for(int i=1;i<=a;i++)
		  {		  

		  for(int j=0;j<i;j++)  
		  {
				
			System.out.print( "* ");	
				
			}
		  
		   System.out.println();	
	      }	
		  
		  
		  for(int i=1; i<=a-1;i++)
		  {

			for(int j=0; j<a-i;j++)  
			{
			System.out.print("* ");	
		   }
			
			System.out.println();
			  
		  }  
			  
		  }	

}
