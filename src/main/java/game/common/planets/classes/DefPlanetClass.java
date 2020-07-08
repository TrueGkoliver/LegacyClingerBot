package game.common.planets.classes;

public class DefPlanetClass extends PlanetClass {
	public int web = 0;
	public DefPlanetClass() {
		
	}
	public DefPlanetClass(String name, int weight) {
		super(name, weight);
	}
	public void setWeight(int weight) {
		this.web = weight;
	}
	public int getWeight() {
		return web;
	}
	
	@Override
	public void onAdd() {
		
	}
	@Override
	public void onTick() {
		
	}

}
