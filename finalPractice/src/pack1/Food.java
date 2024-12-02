package pack1;
public abstract class Food {
	protected String category;
	protected String origin;
	protected boolean isOrganic;
	public Food() {
		
	}
	public Food(String category, String origin, boolean isOrganic) {
		this.category = category;
		this.origin = origin;
		this.isOrganic = isOrganic;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public boolean isOrganic() {
		return isOrganic;
	}
	public void isOrganic(boolean isOrganic) {
		this.isOrganic = isOrganic;
	}
	@Override
	public String toString() {
		return "Nutritional value of " + category + " : basic nutriotional information not specified";
	}
	public abstract String nutritionalinfo();
	public void displayNutritionalValue() {
	}
}