package array;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args)
	{

		
	 //Declare ArrayList	
	//ArrayList<Integer> al=new ArrayList<Integer>();	
	//ArrayList <String> al=new arrayList<String>();
	//List al=new ArrayList();
    ArrayList al=new ArrayList(); 
	
    
    //add new element to the arrayList
    al.add(100);
    al.add("welcome");
    al.add(15.5);
    al.add('T');
    al.add(true);
	
	System.out.println(al);  //[100,welcome,15.5,T,true]

//size()
	System.out.println("Number of removing element in array list:"+al.size());
	
	//for(int i=0;i<=al.size();i++)
	{
	//System.out.println(al.get(i));	
	}	
		
	}
	}


