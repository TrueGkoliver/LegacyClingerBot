package game.common.planets.classes;

public abstract class PlanetClass implements IPlanetClass {
	public int rarityNumber = 0;
	public PlanetClass() {}
	public String name;
	public String getName() {
		return name;
	}
	
	public PlanetClass(String name, int weight) {
		GamePlanets.PLANET_CLASSES.add(this);
		this.name = name;
		this.rarityNumber=weight;
		GamePlanets.totalWeight+=weight;
	}
	public float getAdjustedWeight() {
		System.out.println("This thing's Weight");
		System.out.println(this.rarityNumber);
		System.out.println("Total Weight");
		System.out.println(GamePlanets.totalWeight);
		return ((float)rarityNumber)/((float)GamePlanets.totalWeight);
	}
	public static boolean between(int num, int bound1, int bound2) {
		return (bound1<=num)&&(num>=bound2);
	}
	public String getRarity() {
		return between(rarityNumber, 0, 10) ? "Ungodlike Rarity" :
		between(rarityNumber, 11, 20) ? "Ultra Rare" :
		between(rarityNumber, 21, 30) ? "Super Rare" :
		between(rarityNumber, 31, 40) ? "Rare" :
		between(rarityNumber, 41, 50) ? "Very Uncommon" :
		between(rarityNumber, 51, 60) ? "Uncommon" :
		between(rarityNumber, 61, 70) ? "Not Very Common" :
		between(rarityNumber, 71, 80) ? "Common" :
		between(rarityNumber, 81, 90) ? "Very Common" :
		between(rarityNumber, 91, 100) ? "Omnipresent" : "Undefined";
	}
}
