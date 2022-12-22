package demo.v2.factorymethod;

public class SpecialFoodCreator extends FoodCreator {

	@Override
	public Food getFood() {
		// TODO Auto-generated method stub
		return new SpecialFood();
	}

}
