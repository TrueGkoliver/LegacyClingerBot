package game.common.planets.classes;

public class DefPlanetClass extends PlanetClass {
	public int rarityNumber = 0;
	public DefPlanetClass() { }
	public DefPlanetClass(String name, int weight) {
		super(name, weight);
	}
	public void setWeight(int weight) {
		this.rarityNumber = weight;
	}
	public int getWeight() {
		return rarityNumber;
	}




}
