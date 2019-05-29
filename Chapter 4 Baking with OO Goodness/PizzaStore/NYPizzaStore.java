package PizzaStore;

import Pizza.CheesePizza;
import Pizza.ClamsPizza;
import Pizza.Pizza;
import PizzaIngredient.NYPizzaIngredientFactory;
import PizzaIngredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}
//		else if(item.equals("veggie"))
//			return new NYStyleVeggiePizza();
		else if(item.equals("clam")) {
			pizza = new ClamsPizza(ingredientFactory);
			pizza.setName("New York Style Clams Pizza");
		}
//		else if(item.equals("pepperoni"))
//			return new NYStylePepperoniPizza();
		return pizza;
	}

}
