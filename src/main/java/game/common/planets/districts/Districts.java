package game.common.planets.districts;

import game.common.planets.jobs.Job;
import game.common.planets.jobs.Jobs;
import game.common.resources.Resource;
import util.DoubleSet;

import java.util.HashMap;

public class Districts {
	public static HashMap<Resource, Integer> create(DoubleSet... set) {
		return DoubleSet.generate(set);
	}
	public static DoubleSet gen(Job job, Integer integer) {
		return DoubleSet.make(job, integer);
	}
	public static HashMap<Job, Integer> make(Job job, Integer integer) {
		return DoubleSet.generate(DoubleSet.make(job, integer));
	}

	public static final District HOUSING = new District("general/housing", null, 5);
	public static final District FARMING = new District("general/farming", make(Jobs.FARMER, 5), 2);
	public static final District GENERATOR = new District("general/generator", make(Jobs.TECHNICIAN, 5), 2);
	public static final District MINING = new District("general/mining", make(Jobs.MINER, 5), 2);
	public static final DistrictSet DEFAULT = new DistrictSet(HOUSING, FARMING, GENERATOR, MINING);
	
	public static final District RINGWORLD_HOUSING = new District("ringworld/housing", null, 50);
	public static final District RINGWORLD_RESEARCH = new District("ringworld/research", null, 20);
	public static final District RINGWORLD_GENERATOR = new District("ringworld/generator", make(Jobs.TECHNICIAN, 20), 20);
	public static final District RINGWORLD_FARMING = new District("ringworld/farming", make(Jobs.FARMER, 20), 20);
	public static final District RINGWORLD_COMMERCIAL = new District("ringworld/commercial", null, 20);
	public static final DistrictSet RINGWORLD = new DistrictSet(RINGWORLD_HOUSING, RINGWORLD_RESEARCH, RINGWORLD_GENERATOR, RINGWORLD_FARMING, RINGWORLD_COMMERCIAL);
	
	public static final District ARCOLOGY_HOUSING = new District("arcology/housing", null, 15);
	public static final District ARCOLOGY_FOUNDRY = new District("arcology/foundry", make(Jobs.ARTISAN, 15), 10);
	public static final District ARCOLOGY_INDUSTRIAL = new District("arcology/industrial", null, 10);
	public static final District ARCOLOGY_LEISURE = new District("arcology/leisure", null, 10);
	public static final DistrictSet ARCOLOGY = new DistrictSet(ARCOLOGY_HOUSING, ARCOLOGY_FOUNDRY, ARCOLOGY_INDUSTRIAL, ARCOLOGY_LEISURE);
	
	public static final District HABITAT_HABITATION = new District("habitat/housing", null, 8);
	public static final District HABITAT_TRADE = new District("habitat/trade", null, 3);
	public static final District HABITAT_LEISURE = new District("habitat/leisure", null, 3);
	public static final District HABITAT_ASTRO_MINING = new District("habitat/astro_mining", make(Jobs.MINER, 3), 3);
	public static final District HABITAT_REACTOR = new District("habitat/reactor", make(Jobs.TECHNICIAN, 3), 3);
	public static final District HABITAT_RESEARCH = new District("habitat/research", null, 3);
	public static final DistrictSet HABITAT = new DistrictSet(HABITAT_HABITATION, HABITAT_TRADE, HABITAT_LEISURE, HABITAT_LEISURE, HABITAT_ASTRO_MINING, HABITAT_REACTOR, HABITAT_RESEARCH);
	
	//Industrial Processing Segment
	public static final District VIRTUAL_ALLOYS = new District("virtual/industrial/alloys", null, 10);
	public static final District VIRTUAL_RARE_RESOURCE = new District("virtual/industrial/rare", null, 10);
	public static final District VIRTUAL_MINERALS = new District("virtual/industrial/minerals", null, 10);
	public static final District VIRTUAL_ENERGY = new District("virtual/industrial/energy", null, 10);
	public static final DistrictSet INDUSTRIAL_PROCESSING_INDUSTRIAL = new DistrictSet(VIRTUAL_ALLOYS, VIRTUAL_RARE_RESOURCE, VIRTUAL_MINERALS, VIRTUAL_ENERGY);
	
	//Research Segment
	public static final District VIRTUAL_SCIENCE = new District("virtual/research/science", null, 10);
	public static final District VIRTUAL_SHIPYARD = new District("virtual/research/shipyard", null, 10);
	public static final DistrictSet RESEARCH_SEGMENT = new DistrictSet(VIRTUAL_SCIENCE, VIRTUAL_SHIPYARD);
	
	//Simulator
	public static final District VIRTUAL_HOUSING = new District("virtual/sim/housing", null, 50);
	public static final District VIRTUAL_UNITY = new District("virtual/sim/unity", null, 10);
	public static final District VIRTUAL_CONSUMER_GOODS = new District("virtual/sim/consumer_goods", null, 10);
	public static final DistrictSet VIRTUAL_SIMULATOR = new DistrictSet(VIRTUAL_HOUSING, VIRTUAL_UNITY, VIRTUAL_CONSUMER_GOODS);
	
	//Gaia Alderson Disc
	public static final District G_ALDERSON_CITY = new District("alderson/gaia/city", null, 200);
	public static final District G_ALDERSON_GENERATOR = new District("alderson/gaia/generator", null, 80);
	public static final District G_ALDERSON_FARM = new District("alderson/gaia/farm", null, 80);
	public static final District G_ALDERSON_MINING = new District("alderson/gaia/mining", null, 80);
	public static final DistrictSet GAIA_ALDERSON = new DistrictSet(G_ALDERSON_CITY, G_ALDERSON_GENERATOR, G_ALDERSON_FARM, G_ALDERSON_MINING);
	
	//Planetary Computer Alderson Disc
	public static final District PC_ALDERSON_BASE = new District("alderson/plancomputer/base", null, 20);
	public static final District PC_ALDERSON_ADMIN = new District("alderson/plancomputer/admin", null, 80);
	
	//Ecumneopolis
	public static final District E_ALDERSON_HOUSING = new District("alderson/ecumneopolis/housing", null, 500);
	public static final District E_ALDERSON_ARMS_INDUSTRY = new District("alderson/ecumneopolis/arms_industry", null, 120);
	public static final District E_ALDERSON_CIVILIAN_INDUSTRY = new District("alderson/ecumneopolis/civilian_industry", null, 120);
	public static final District E_ALDERSON_LEISURE_ALDERSON = new District("alderson/ecumneopolis/leisure", null, 120);
	
	//Squareworld
	public static final District SQUAREWORLD_FARMS = new District("squareworld/farm", null, 20);
	public static final District SQUAREWORLD_ALLOYS = new District("squareworld/alloys", null, 20);
	public static final DistrictSet SQUAREWORLD = DistrictSet.add(RINGWORLD, new DistrictSet(SQUAREWORLD_ALLOYS));
	
	//Mega Shipyard
	public static final District SHIPYARD_ENERGY = new District("mega_shipyard/energy", null, 2);
	public static final District SHIPYARD_ALLOYS = new District("mega_shipyard/alloys", null, 2);
	public static final DistrictSet MEGA_SHIPYARD = new DistrictSet(SHIPYARD_ENERGY, SHIPYARD_ALLOYS);
	
	//Planetary Computer
	public static final District PLANETARY_COMPUTER_BASE = new District("plancomputer/base", null, 2);
	public static final District PLANETARY_COMPUTER_ADMIN = new District("plancomputer/admin", null, 8);
	public static final DistrictSet PLANETARY_COMPUTER = new DistrictSet(PLANETARY_COMPUTER_BASE, PLANETARY_COMPUTER_ADMIN);
	
	//Penrose Ringworld
	public static final District PENROSE_LAB = new District("penrose/lab", null, 10);
	public static final District PENROSE_GENERATOR = new District("penrose/generator", null, 20);
	public static final District PENROSE_FARMING = new District("penrose/farming", null, 20);
	public static final DistrictSet PENROSE = new DistrictSet(PENROSE_LAB, PENROSE_GENERATOR, PENROSE_FARMING);
	
	//Interstellar Habitat Ringworld
	public static final District IHR_ALLOYS = new District("ih_ringworld/alloys", null, 10);
	public static final District IHR_GENERATOR = new District("ih_ringworld/generator", null, 10);
	public static final District IHR_LAB = new District("ih_ringworld/lab", null, 20);
	public static final District IHR_HOUSING = new District("ih_ringworld/housing", null, 50);
	public static final DistrictSet INTERSTELLAR_HABITAT_RINGWORLD = new DistrictSet(IHR_ALLOYS, IHR_GENERATOR, IHR_LAB, IHR_HOUSING);
	
	//Interstellar Habitat
	public static final District IH_LAB = new District("ih/lab", null, 4);
	public static final District IH_SCAVENGER = new District("ih/scavenger", null, 0);
	public static final DistrictSet INTERSTELLAR_HABITAT = DistrictSet.add(HABITAT, new DistrictSet(IH_LAB, IH_SCAVENGER));
	
	//Gas Giant Habitat
	public static final District GG_LAB = new District("gg/lab", null, 0);
	public static final District GG_GENERATOR = new District("gg/generator", null, 4);
	public static final DistrictSet GAS_GIANT_HABITAT = new DistrictSet(GG_LAB, GG_GENERATOR);
	
	//Orbital Elysium
	public static final District ELYSIUM_PRESERVE = new District("elysium/preserve", null, 0);
	public static final District ELYSIUM_LEISURE = new District("elysium/leisure", null, 0);
	public static final District ELYSIUM_ENERGY = new District("elysium/energy", null, 0);
	public static final DistrictSet ORBITAL_ELYSIUM = new DistrictSet(ELYSIUM_PRESERVE, ELYSIUM_LEISURE, ELYSIUM_ENERGY);
	
	//Birch World Insulae
	public static final District BW_STRUCTURE_INSULA = new District("bw/structure", null, 0);
	public static final District BW_EXTRACTION_INSULA = new District("bw/extraction", null, 0);
	public static final District BW_ECUMNEOPOLIS_INSULA = new District("bw/ecumneopolis", null, 150);
	public static final District BW_PRESERVE_INSULA = new District("bw/preserve", null, 100);
	public static final DistrictSet BIRCH_WORLD = new DistrictSet(BW_STRUCTURE_INSULA, BW_EXTRACTION_INSULA, BW_ECUMNEOPOLIS_INSULA, BW_PRESERVE_INSULA);
	
}
