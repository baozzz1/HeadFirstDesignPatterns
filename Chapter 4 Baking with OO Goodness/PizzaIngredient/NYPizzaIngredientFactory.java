package PizzaIngredient;

import origin.Cheese.Cheese;
import origin.Cheese.ReggianoCheese;
import origin.Clams.Clams;
import origin.Clams.FreshClams;
import origin.Dough.Dough;
import origin.Dough.ThinCrustDough;
import origin.Sauce.MarinaraSauce;
import origin.Sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}

}
