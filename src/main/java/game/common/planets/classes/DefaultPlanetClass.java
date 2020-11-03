package game.common.planets.classes;

public class DefaultPlanetClass extends PlanetClass {
	public int rarityNumber = 0;
	public DefaultPlanetClass() { }
	public DefaultPlanetClass(String name, int weight) {
		super(name, weight);
	}
	public void setWeight(int weight) {
		this.rarityNumber = weight;
	}
	public int getWeight() {
		return rarityNumber;
	}




}
