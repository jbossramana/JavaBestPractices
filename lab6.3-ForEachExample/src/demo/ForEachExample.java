package demo;

import java.util.*;  

class ForEachExample
{  
  public static void main(String args[]){  
   //Creating a list of elements  
   ArrayList<String> list=new ArrayList<String>();  
   list.add("Ramana");  
   list.add("Surya");  
   list.add("Aditya");  
   //traversing the list of elements using for-each loop  
   for(String s:list){  
     System.out.println(s);  
   }  
  
 }   
}  