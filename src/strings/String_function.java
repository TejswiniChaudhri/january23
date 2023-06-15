package strings;

public class String_function 
{

  public static void main (String[]  args)
  {
   
  String a="Tejswini Hemraj Chaudhri";
  
  String b="Anjali Hemraj Chaudhri";

  String c="MANJUSHREE HEMRAJ CHAUDHRI";
 
  String d ="TEJSWINI HEMRAJ CHAUDHRI";
 
  String e = "xyz abc xyz pqr stu xyz abc";
  
  int length = a.length();  // 1).Length => It shows the length of string.
  
  System.out.println(length);
  
  System.out.println(a.toUpperCase());  //2).toUppercase => it is used to small letter convert into capital letter.
  
  System.out.println(c.toLowerCase());  //3).toLowercase => it is used to capital letter convert into small letter.
  
  boolean result= a.endsWith("i");      //4). endwith  this function is case sensitive.
  
  System.out.println(result);
  //or
  boolean pass = b.endsWith("y");       //---//---
  System.out.println(pass);
  
  boolean result1 = b.startsWith("A"); //  5). startwith this function is case sensitive.
  
  System.out.println(result1);
 
  boolean eqresult = a.equals(c);     // 6).eqaul => this function is used to compare two string at the same type,
                                      //   return type of this function is boolean,this function is case sensitive
  
  System.out.println(eqresult);
  
 
  boolean eqresult1 = a.equalsIgnoreCase(d);   //  7).equalsIgnoreCase => this function is used to compare two string at the same type,
                                               //   return type of this function is boolean,this function is not case sensitive.

   System.out.println(eqresult1);
  
  
   String news =a.replace("Tej","Yash");    // 8).replace => it is used to replace any character of the string.
  
   System .out.println(news);
      //OR
   
   System.out.println(a.replace("Tej", "Yash"));
   
   System.out.println(e.replaceAll("xyz", "ijk"));   //9).replaceAll-> this is use to replace specific word
   
   System.out.println(e.replaceFirst("xyz","Hey"));  //10). replacefirst => this is use to replace first of the string
   
   
  }


 // substring ---->it return type charcter /part of the string based on index values
  //concatenation-=-> it is used to connect word to the particular string
  // index of --> by using these function we will get index values by providing the character ,return type of this is integer.
  //compliler will check from starting index
  // find character--> by using this function we can find the particular 
  // last index of-->by using these function we will get index values by providing the character ,return type of this is integer.
  //compliler will check from end index
  //contains-->it check whether string is containing specific sequence of char or not.
  //slipt--> it is used to the  string as per the requirement/// return type array.
  
  
  
  
  
  
  
  

}
