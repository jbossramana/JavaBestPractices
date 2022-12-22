package demo.v1.factorymethod;

public class FoodServer

{
    public static Food getFood(String foodType)
 
    {
        if (foodType.equals("veg"))
        {
            return new VegFood();
        }
        else if (foodType.equals("special"))
        {
            return new SpecialFood();
        }
        else
        {
            System.out.println("We are not serving " + foodType);
            return null;
        }
    }
}