package PizzaIngredient;

import origin.Cheese.Cheese;
import origin.Clams.Clams;
import origin.Dough.Dough;
import origin.Sauce.Sauce;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
//	public Veggies[] createVeggies();
//	public Pepperoni createPepperoni();
	public Clams createClams();
}
