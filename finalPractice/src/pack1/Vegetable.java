package pack1;
public class Vegetable extends Food {
	private String mainMineral;
	public Vegetable() {
	}
	public Vegetable(String category, String origin, boolean isOrganic, String mainMineral) {
		super(category, origin, isOrganic);
		this.mainMineral = mainMineral;
	}
	public String getMainMineral() {
		return mainMineral;
	}
	public void setMainMineral(String mainMineral) {
		this.mainMineral = mainMineral;
	}
	@Override
	public void displayNutritionalValue() {
		System.out.println(toString());
	}
	@Override
	public String nutritionalinfo() {
		return null;
	}
}