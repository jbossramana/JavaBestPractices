package demo.geek.v1;

import java.util.HashMap;
import java.util.Map;

//Driver code
class GFG 
{
 public static void main (String[] args) 
 {
       
     // creating two Objects with 
     // same state
     Geek g1 = new Geek("aditya", 1);
     Geek g2 = new Geek("aditya", 1);
       
     Map<Geek, String> map = new HashMap<Geek, String>();
     map.put(g1, "CSE");
     map.put(g2, "IT");
       
     System.out.println("HashCode for g1: "+ g1.hashCode());
     System.out.println("HashCode for g2 : "+ g2.hashCode());
     
     if(g1==g2)
    	 System.out.println("== Equal");
     else 
    	 System.out.println("== Not Equal");
     
     
     if(g1.equals(g2))
    	 System.out.println(".equals() Equal");
     else 
    	 System.out.println(".equals() Not Equal");
     
     
     for(Geek geek : map.keySet())
     {
         System.out.println(map.get(geek).toString());
     }
     

     
     

 }
}