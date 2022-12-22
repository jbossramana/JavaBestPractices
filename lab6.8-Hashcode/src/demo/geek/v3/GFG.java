package demo.geek.v3;

import java.util.HashMap;
import java.util.Map;

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
        
        for(Geek geek : map.keySet())
        {
            System.out.println(map.get(geek).toString());
        }
  
    }
}