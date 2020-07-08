package game.common.planets;

import java.util.HashMap;

import game.common.planets.classes.PlanetClass;

public class PlanetInstance {
	public boolean ringworld;
	public boolean orbital_habitat;
	public boolean shielded;
	/**
	 * 0: Not Fractured
	 * 1: Cracked
	 * 2: Broken
	 * 3: Fractured
	 * 4: Big Fractured
	 * 5: Very much fractured
	 * 
	 */
	public int fracturedLevel = 0;
	public boolean planetShip;
	public boolean ruined;
	public boolean interstellarHabitat;
	public boolean insterstellarRingworld;
	public boolean squareWorld;
	//0-100
	public int averageTemperature;
	public boolean relic;
	public boolean birchWorld;
	public boolean penroseRingworld;
	public boolean flat;
	public boolean aldersonDisc;
	public boolean precursorHabitat;
	public boolean dysonSwarm;
	public boolean sphere;
	
	public PlanetClass classIn;
	public int id;
	public String name;
	public boolean capital;
	public int population;
	public PlanetInstance(PlanetClass classIn) {}
	public PlanetInstance(PlanetClass classIn, int idIn, String nameIn, boolean isCapital, int population) {
		this.classIn = classIn;
		this.id = idIn;
		this.name = nameIn;
		this.capital = isCapital;
		this.population = population;
	}
	public HashMap<String, Boolean> serializeStructureInfo() {
		HashMap<String, Boolean> hm = new HashMap<String,Boolean>();
		hm.put("planetShip", planetShip);
		hm.put("interstellarHabitat", interstellarHabitat);
		hm.put("interstellarRingworld", insterstellarRingworld);
		hm.put("squareWorld", squareWorld);
		hm.put("ringworld", ringworld);
		hm.put("orbitalHabitat", orbital_habitat);
		hm.put("planetShip", planetShip);
		hm.put("dysonSwarm", dysonSwarm);
		hm.put("birchWorld", birchWorld);
		hm.put("penroseRingworld", penroseRingworld);
		hm.put("flatWorld", flat);
		hm.put("aldersonDisc", aldersonDisc);
		hm.put("precursorHabitat", precursorHabitat);
		hm.put("sphere", sphere);
		return hm;
	}
	
}
