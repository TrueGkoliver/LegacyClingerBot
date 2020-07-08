package game.common.planets.classes;

public abstract class PlanetClass implements IPlanetClass {
	public int web = 0;
	public PlanetClass() {}
	public String name;
	public String getName() {
		return name;
	}
	
	public PlanetClass(String name, int weight) {
		GamePlanets.PLANET_CLASSES.add(this);
		this.name = name;
		this.web=weight;
		GamePlanets.totalWeight+=weight;
	}
	public float getAdjustedWeight() {
		System.out.println("This thing's Weight");
		System.out.println(this.web);
		System.out.println("Total Weight");
		System.out.println(GamePlanets.totalWeight);
		return ((float)web)/((float)GamePlanets.totalWeight);
	}

}
