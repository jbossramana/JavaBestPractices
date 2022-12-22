package demo.v2.factorymethod;



public class Customer
{
    public static void main(String[] args)
    {
    	FoodCreator vegServer = new VegFoodCreator();
        Food customer1 = vegServer.getFood();
        System.out.println("Customer1");
        System.out.println("Items: "+customer1.getItems().toString());
        System.out.println("Bill: "+customer1.getBill());
        
        FoodCreator specialFoodServer = new SpecialFoodCreator();
        
        Food customer2 = specialFoodServer.getFood();
        System.out.println("Customer2");
        System.out.println("Items: "+customer2.getItems().toString());
        System.out.println("Bill: "+customer2.getBill());
    }
}
