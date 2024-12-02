package pack1;
public class Fruit extends Food{
	private String mainVitamin;
	public Fruit() {
	}
	public Fruit(String category, String origin, boolean isOrganic, String mainVitamin) {
		super(category, origin, isOrganic);
		this.mainVitamin = mainVitamin;
	}
	public String getMainVitamin() {
		return mainVitamin;
	}
	@Override
	public void displayNutritionalValue() {
		System.out.println("Nutritional value of " + category + ": main Vitamin: " + mainVitamin);
	}
	@Override
	public String nutritionalinfo() {
		return null;
	}
}