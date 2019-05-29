package Pizza;
import java.util.ArrayList;

import origin.Cheese.Cheese;
import origin.Clams.Clams;
import origin.Dough.Dough;
import origin.Sauce.Sauce;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Clams clams;
	ArrayList toppings = new ArrayList();

	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minues at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "";
	}
}
