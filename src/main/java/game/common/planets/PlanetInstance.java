package game.common.planets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

import game.common.planets.buildings.AbstractBuilding;
import game.common.planets.classes.PlanetClass;
import game.common.planets.districts.District;
import game.common.resources.Resource;
import util.DoubleSet;

public class PlanetInstance {
	public Function<String, Integer > getAttributeIdByString = (String s)->{
		switch (s) {
			case "planetShip": return 0;
			case "ruined": return 1;
			case "interstellarHabitat": return 2;
			case "interstellarRingworld": return 3;
			case "squareWorld": return 4;
			case "relic": return 5;
			case "birchWorld": return 6;
			case "penroseRingworld": return 7;
			case "precursorHabitat": return 8;
			case "dysonSwarm": return 9;
			case "sphere": return 10;
			case "ringworld": return 11;
			case "orbitalHabitat": return 12;
			case "shielded": return 13;
			default: return 10;
		}
	};
	public Boolean[] attributes = new Boolean[] {
			false, //planetShip
			false, //ruined
			false, //interstellarHabitat
			false, //interstellarRingworld
			false, //squareWorld
			false, //Relic,
			false, //Birch World,
			false, //penroseRingworld
			false, //flat
			false, //aldersonDisc
			false, //precursorHabitat,
			false, //dysonSwarm,
			false, //sphere
			false, //Ringworld
			false, //Orbital Habitat
			false //Shielded
	};





	//0-100
	public int averageTemperature;
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
	public PlanetClass classIn;
	public int id;
	public String name;
	public boolean capital;

	public int population = 0;
	public int miningStations = 0;
	public int scienceStations = 0;

	public ArrayList<AbstractBuilding> BUILDINGS;
	public ArrayList<District> DISTRICTS;
	public PlanetInstance(PlanetClass classIn) {}
	public PlanetInstance(PlanetClass classIn, int idIn, String nameIn, boolean isCapital, int population) {
		this.classIn = classIn;
		this.id = idIn;
		this.name = nameIn;
		this.capital = isCapital;
		this.population = population;
	}
	public boolean getAttribute(String name) {
		return attributes[getAttributeIdByString.apply(name)];
	}

	public static class PlanetAttributeBuilder {

	}
}
