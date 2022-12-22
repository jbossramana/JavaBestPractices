package demo.v1.factorymethod;

public class Customer
{
    public static void main(String[] args)
    {
        Food customer1 = FoodServer.getFood("veg");
        System.out.println("Customer1");
        System.out.println("Items: "+customer1.getItems().toString());
        System.out.println("Bill: "+customer1.getBill());
        Food customer2 = FoodServer.getFood("special");
        System.out.println("Customer2");
        System.out.println("Items: "+customer2.getItems().toString());
        System.out.println("Bill: "+customer2.getBill());
    }
}
