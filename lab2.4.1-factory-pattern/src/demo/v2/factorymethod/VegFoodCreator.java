package demo.v2.factorymethod;



public class VegFoodCreator extends FoodCreator {

	
	public Food getFood() {
		// TODO Auto-generated method stub
		return new VegFood();
	}

}
