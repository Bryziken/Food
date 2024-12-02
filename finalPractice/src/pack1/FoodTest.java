package pack1;
public class FoodTest {
	public static void main(String[] args) {
		Vegetable v1 = new Vegetable("Elote", "Tierra", true, "si");
		v1.displayNutritionalValue();
		Fruit f1 = new Fruit("Apple", "Tierra", true, "Vitamin C");
		f1.displayNutritionalValue();
	}
}