package demo.v1.factorymethod;

import java.util.HashSet;
import java.util.Set;

public abstract class Food

{
    protected double billPerPerson;
    protected Set items;
 
    public Food(double billPerPerson)
 
    {
        this.billPerPerson=billPerPerson;
        this.items=new HashSet<>();
    }
 
    public double getBill()
 
    {
        return billPerPerson;
 
    }
 
    public Set getItems()
    {
        return items;
    }
}