package PizzaIngredient;

import origin.Cheese.Cheese;
import origin.Cheese.MozzarellaCheese;
import origin.Clams.Clams;
import origin.Clams.FrozenClams;
import origin.Dough.Dough;
import origin.Dough.ThickCrustDough;
import origin.Sauce.PlumTomatoSauce;
import origin.Sauce.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams();
	}

}
