package PizzaStore;

import Pizza.CheesePizza;
import Pizza.ClamsPizza;
import Pizza.Pizza;
import PizzaIngredient.ChicagoPizzaIngredientFactory;
import PizzaIngredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		if(item.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		}
//		else if(item.equals("veggie"))
//			return new ChicagoStyleVeggiePizza();
		else if(item.equals("clam")){
			pizza = new ClamsPizza(ingredientFactory);
			pizza.setName("Chicago Style Clams Pizza");
		}
//		else if(item.equals("pepperoni"))
//			return new NYStylePepperoniPizza();
		return pizza;
	}

}
