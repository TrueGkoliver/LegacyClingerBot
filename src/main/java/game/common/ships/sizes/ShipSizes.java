package game.common.ships.sizes;

public class ShipSizes {
	/*
	 * N: Normal
	 * G: All-Ship Add
	 * E: Extradimensional
	 * P: Prethoryn
	 * PR: Precursor
	 * FE: Fallen Empire
	 * C: Machine
	 * V: Variant (ShipVariant)
	 * L: Spaceborne
	 */
	
	public static final ShipVariant V_MACHINE = new ShipVariant("Cybrex", "Contingency", "Automated Mining Drone");
	public static final ShipVariant V_CRYSTAL = new ShipVariant("Sapphire", "Amethyst", "Amber", "Ruby", "Emerald");
	public static final ShipVariant V_AMOEBA = new ShipVariant("Black Orange", "Beige Blue", "Yellow Teal", "Zebra Blue");
	public static final ShipVariant V_TIYANKI = new ShipVariant("Bull", "Cow", "Calf", "Matriarch");
	public static final ShipVariant V_EXTRADIM = new ShipVariant("Unbidden", "Aberrant", "Vehement", "Stellarite");
	public static final ShipVariant V_FALLEN = new ShipVariant("Materialist","Spiritualist","Xenophile","Xenophobe", "Machine Empire", "Militarist", "Pacifist", "Brunai Imperium", "Golden Fallen", "Erebus", "Blue Fallen");
	public static final ShipVariant V_ETHER_DRAKE = new ShipVariant("Blue","Red","Purple", "Nanite");
	public static final ShipVariant V_SPECTRAL_WRAITH = new ShipVariant("Blue","Red","Yellow");
	public static final ShipVariant V_NOMAD = new ShipVariant("Yellow Green","Blue","Yellow", "Green", "Red");
	
	//Normal Ship Sizes
	public static final ShipSize N_CORVETTE = new ShipSize(); //Done
	public static final ShipSize N_CRUISER = new ShipSize(); //Done
	public static final ShipSize N_BATTLESHIP = new ShipSize();
	public static final ShipSize N_DESTROYER = new ShipSize(); //Done
	public static final ShipSize N_TITAN = new ShipSize();
	public static final ShipSize N_JUGGERNAUT = new ShipSize();
	public static final ShipSize N_COLOSSUS = new ShipSize();
	public static final ShipSize N_DEFENSE_STATION = new ShipSize();
	public static final ShipSize N_ION_CANNON = new ShipSize();
	
	//Civilian Craft
	public static final ShipSize N_COLONY_SHIP = new ShipSize();
	public static final ShipSize N_SCIENCE_SHIP = new ShipSize();
	public static final ShipSize N_CONSTRUCTION_SHIP = new ShipSize();
	
	//NSC Ship Sizes
	public static final ShipSize N_STRIKE_CRUISER = new ShipSize(); //Done
	public static final ShipSize N_ESCORT_CARRIER = new ShipSize();
	public static final ShipSize N_CARRIER = new ShipSize();
	public static final ShipSize N_DREADNOUGHT = new ShipSize();
	
	//Precursor Stuff
	public static final ShipSize PR_ESCORT = new ShipSize();
	public static final ShipSize PR_BATTLECRUISER = new ShipSize();
	public static final ShipSize PR_HYPERION = new ShipSize();
	public static final ShipSize PR_ASSAULT_CARRIER = new ShipSize();
	public static final ShipSize PR_GATEKEEPER_WARDEN = new ShipSize();
	public static final ShipSize PR_GUARDIAN = new ShipSize();
	public static final ShipSize PR_SENITEL = new ShipSize();
	public static final ShipSize PR_INSTANT_REPELLER = new ShipSize();
	public static final ShipSize PR_INSTANT_PYLON = new ShipSize();
	public static final ShipSize PR_HERCULEAN = new ShipSize();
	public static final ShipSize PR_ORACLE = new ShipSize();
	public static final ShipSize PR_INITIALIZER = new ShipSize();
	public static final ShipSize PR_EMISSARY = new ShipSize();
	
	//Spaceborne: Machine
	public static final ShipSize C_SEEKER = new ShipSize();
	public static final ShipSize C_WARFORM = new ShipSize();
	public static final ShipSize C_DEFENSIVE = new ShipSize();
	public static final ShipSize C_NEXUS = new ShipSize();
	public static final ShipSize C_CORE = new ShipSize();
	public static final ShipSize C_MASTER_CORE = new ShipSize();
	
	//Spaceborne: Prethoryn
	public static final ShipSize P_SWARMLING = new ShipSize();
	public static final ShipSize P_WARRIOR = new ShipSize();
	public static final ShipSize P_QUEEN = new ShipSize();
	public static final ShipSize P_NEST = new ShipSize();
	public static final ShipSize P_STAR_HIVE = new ShipSize();
	
	//Spaceborne: Extradimensional
	public static final ShipSize E_ESCORT = new ShipSize();
	public static final ShipSize E_CRUISER = new ShipSize();
	public static final ShipSize E_BATTLESHIP = new ShipSize();
	public static final ShipSize E_CONDUIT = new ShipSize();
	public static final ShipSize E_JUNCTION = new ShipSize();
	public static final ShipSize E_ANCHOR = new ShipSize();
	public static final ShipSize E_PORTAL = new ShipSize();
	public static final ShipSize E_DEVOURER = new ShipSize();
	
	//Imperial Systems
	public static final ShipSize I_BOMBER = new ShipSize();
	public static final ShipSize I_FIGHTER = new ShipSize();
	public static final ShipSize I_PATROL = new ShipSize();
	public static final ShipSize I_FRIGATE = new ShipSize();
	public static final ShipSize I_ESCORT_CARRIER = new ShipSize();
	public static final ShipSize I_LIGHT_CRUISER = new ShipSize();
	public static final ShipSize I_MEDIUM_CRUISER = new ShipSize();
	public static final ShipSize I_HEAVY_CRUISER = new ShipSize();
	public static final ShipSize I_STAR_CRUISER = new ShipSize();
	public static final ShipSize I_STAR_DESTROYER = new ShipSize();
	public static final ShipSize I_BATTLECRUISER = new ShipSize();
	public static final ShipSize I_SSD = new ShipSize();
	public static final ShipSize I_HEAVY_INTERDICTOR = new ShipSize();
	public static final ShipSize I_LIGHT_INTERDICTOR = new ShipSize();
	
	//Spaceborne: Pirate
	public static final ShipSize PIRATE_RAIDER = new ShipSize();
	public static final ShipSize PIRATE_FRIGATE = new ShipSize();
	public static final ShipSize PIRATE_CRUISER = new ShipSize();
	public static final ShipSize PIRATE_GALLEON = new ShipSize();
	public static final ShipSize PIRATE_OUTPOST = new ShipSize();
	
	//Spaceborne: 
	
	//FE Generic stuff
	public static final ShipSize FE_ESCORT = new ShipSize();
	public static final ShipSize FE_BATTLECRUISER = new ShipSize();
	public static final ShipSize FE_TITAN = new ShipSize();
	public static final ShipSize FE_OUTPOST = new ShipSize();
	public static final ShipSize FE_FORTRESS = new ShipSize();
	
	
}
