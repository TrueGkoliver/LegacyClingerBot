package game.common.planets.classes;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class GamePlanets {
	public static ArrayList<PlanetClass> PLANET_CLASSES = new ArrayList<PlanetClass>(); 
	public static int totalWeight;
	public static float getAdjustedWeight(PlanetClass classIn) {
		float floatWeb = (float)classIn.rarityNumber;
		float floatWeight = (float)totalWeight;
		return floatWeb/floatWeight;
	}
	public static Random rand = new Random();
	public static PlanetClass getRandomClassWithWeight() {
		float weightIndex = rand.nextFloat();
		float creativeI = 0.0F;
		for (int i=0; i<PLANET_CLASSES.size(); i++) {
			int index = i;
			PlanetClass classIn = PLANET_CLASSES.get(i);
			if (index!=0) {
				PlanetClass before = PLANET_CLASSES.get(index-1);
				float beforeWeight = getAdjustedWeight(before);
				float adjustedWeight = getAdjustedWeight(classIn);
				creativeI+=adjustedWeight;
				String rarity;
				long numeral = Math.round(classIn.rarityNumber/10.0) * 10;
				
				
				System.out.println(classIn.getName());
				System.out.println(beforeWeight);
				System.out.println(weightIndex);
				System.out.println(adjustedWeight);
				if ((beforeWeight < weightIndex) && (weightIndex <= creativeI)) {
					return classIn;
				}
				
			} else {
				if ((weightIndex <= getAdjustedWeight(classIn))) {
					return classIn;
				}
			}
			
			
		}
		return null;
		
	}
	
	
	public static final DefPlanetClass DESERT_WORLD = new DefPlanetClass("Desert World", 80);
	public static final DefPlanetClass ARID_WORLD = new DefPlanetClass("Arid World", 83);
	public static final DefPlanetClass SAVANNA_WORLD = new DefPlanetClass("Savanna World", 75);
	public static final DefPlanetClass TROPICAL_WORLD = new DefPlanetClass("Tropical World", 75);
	public static final DefPlanetClass CONTINENTAL_WORLD = new DefPlanetClass("Continental World", 75);
	public static final DefPlanetClass OCEAN_WORLD = new DefPlanetClass("Ocean World", 82);
	public static final DefPlanetClass TUNDRA_WORLD = new DefPlanetClass("Tundra World", 72);
	public static final DefPlanetClass ARCTIC_WORLD = new DefPlanetClass("Arctic World", 90);
	public static final DefPlanetClass ALPINE_WORLD = new DefPlanetClass("Alpine World", 70);
	public static final DefPlanetClass GAS_GIANT = new DefPlanetClass("Gas Giant", 100);
	public static final DefPlanetClass ASTEROID = new DefPlanetClass("Asteroid", 100);
	public static final DefPlanetClass ICE_ASTEROID = new DefPlanetClass("Ice Asteroid", 100);
	public static final DefPlanetClass CRYSTALLINE_ASTEROID = new DefPlanetClass("Crystalline Asteroid", 100);
	public static final DefPlanetClass MOLTEN_WORLD = new DefPlanetClass("Molten World", 100);
	public static final DefPlanetClass BARREN_WORLD = new DefPlanetClass("Barren World", 100);
	public static final DefPlanetClass COLD_BARREN_WORLD = new DefPlanetClass("Cold Barren World", 100);
	public static final DefPlanetClass TOXIC_WORLD = new DefPlanetClass("Toxic World", 100);
	public static final DefPlanetClass FROZEN_WORLD = new DefPlanetClass("Frozen World", 100);
	public static final DefPlanetClass TOMB_WORLD = new DefPlanetClass("Tomb World", 43);
	public static final DefPlanetClass HIVE_WORLD = new DefPlanetClass("Hive World", 20);
	public static final DefPlanetClass MACHINE_WORLD = new DefPlanetClass("Machine World", 20);
	public static final DefPlanetClass HIELDED_WORLD = new DefPlanetClass("Shielded World", 20);
	public static final DefPlanetClass AI_WORLD = new DefPlanetClass("AI World", 12);
	public static final DefPlanetClass INFESTED_WORLD = new DefPlanetClass("Infested World", 12);
	public static final DefPlanetClass GAIA_WORLD = new DefPlanetClass("Gaia World", 13);
	public static final DefPlanetClass CLASS_B_STAR = new DefPlanetClass("Class B Star", 100);
	public static final DefPlanetClass CLASS_A_STAR = new DefPlanetClass("Class A Star", 100);
	public static final DefPlanetClass CLASS_F_STAR = new DefPlanetClass("Class F Star", 100);
	public static final DefPlanetClass CLASS_G_STAR = new DefPlanetClass("Class G Star", 100);
	public static final DefPlanetClass CLASS_K_STAR = new DefPlanetClass("Class K Star", 100);
	public static final DefPlanetClass CLASS_M_STAR = new DefPlanetClass("Class M Star", 100);
	public static final DefPlanetClass CLASS_M_RED_GIANT = new DefPlanetClass("Class M Red Giant", 100);
	public static final DefPlanetClass CLASS_T_BROWN_DWARF = new DefPlanetClass("Class T Brown Dwarf", 100);
	public static final DefPlanetClass BLACK_HOLE = new DefPlanetClass("Black Hole", 30);
	public static final DefPlanetClass NEUTRON_STAR = new DefPlanetClass("Neutron Star", 22);
	public static final DefPlanetClass PULSAR = new DefPlanetClass("Pulsar", 30);
	public static final DefPlanetClass HABITABLE_RING_WORLD = new DefPlanetClass("Habitable Ring World", 10);
	public static final DefPlanetClass RING_WORLD_SUPPORT_SEGMENT = new DefPlanetClass("Ring World Support Segment", 10);
	public static final DefPlanetClass RING_WORLD_SEAM = new DefPlanetClass("Ring World Seam", 10);
	public static final DefPlanetClass ORBITAL_HABITAT = new DefPlanetClass("Orbital Habitat", 20);
	public static final DefPlanetClass SHROUDED_WORLD = new DefPlanetClass("Shrouded World", 1);
	public static final DefPlanetClass BROKEN_WORLD = new DefPlanetClass("Broken World", 100);
	public static final DefPlanetClass SHATTERED_WORLD = new DefPlanetClass("Shattered World", 100);
	public static final DefPlanetClass NANITE_WORLD = new DefPlanetClass("Nanite World", 100);
	public static final DefPlanetClass CRACKED_EGG_WORLD = new DefPlanetClass("Cracked Egg World", 1);
	public static final DefPlanetClass ECUMENOPOLIS = new DefPlanetClass("Ecumenopolis", 10);
	public static final DefPlanetClass RELIC_WORLD = new DefPlanetClass("Relic World", 10);
	public static final DefPlanetClass FRACTURED_WORLD = new DefPlanetClass("Fractured World", 100);
	public static final DefPlanetClass ULTRAFRACTURED_WORLD = new DefPlanetClass("Ultrafractured World", 50);
	public static final DefPlanetClass BIRCH_WORLD = new DefPlanetClass("Birch World", 1);
	public static final DefPlanetClass LUNAR_SPECULOREFRACTOR_MOON = new DefPlanetClass("Lunar Speculorefractor Moon", 1);
	public static final DefPlanetClass PLANETARY_COMPUTING_COMPLEX = new DefPlanetClass("Planetary Computing Complex", 4);
	public static final DefPlanetClass LIFELESS_HABITABLE_WORLD = new DefPlanetClass("Lifeless Habitable World", 50);
	public static final DefPlanetClass LIFELESS_FOGGED_WORLD = new DefPlanetClass("Lifeless Fogged World", 60);
	public static final DefPlanetClass LIFELESS_TORRID_WORLD = new DefPlanetClass("Lifeless Torrid World", 60);
	public static final DefPlanetClass METALLIC_HYDROGEN_GIANT = new DefPlanetClass("Metallic Hydrogen Giant", 100);
	public static final DefPlanetClass YGGDRASIL_ORCHID = new DefPlanetClass("Yggdrasil Orchid", 100);
	public static final DefPlanetClass VIRTUAL_WORLD = new DefPlanetClass("Virtual World", 3);
	public static final DefPlanetClass SQUAREWORLD_SEGMENT = new DefPlanetClass("Squareworld Segment", 1);
	public static final DefPlanetClass STRIPMINED_WORLD = new DefPlanetClass("Stripmined World", 70);
	public static final DefPlanetClass DEPLETED_WORLD = new DefPlanetClass("Depleted World", 60);
	public static final DefPlanetClass CLASS_L_BROWN_DWARF = new DefPlanetClass("Class L Brown Dwarf", 67);
	public static final DefPlanetClass IGNITED_STAR = new DefPlanetClass("Ignited Star", 24);
	public static final DefPlanetClass PANTHALASSIC_WORLD = new DefPlanetClass("Panthalassic (Melted Frozen) World", 43);
	public static final DefPlanetClass SUPERMASSIVE_BLACK_HOLE = new DefPlanetClass("Supermassive Black Hole", 4);
	public static final DefPlanetClass PENROSE_RINGWORLD_SEGMENT = new DefPlanetClass("Penrose Ringworld Segment", 2);
	public static final DefPlanetClass PENROSE_RINGWORLD_SUPPORT_SEGMENT = new DefPlanetClass("Penrose Ringworld Support Segment", 2);
	public static final DefPlanetClass ORBITAL_ELYSIUM = new DefPlanetClass("Orbital Elysium", 3);
	public static final DefPlanetClass INTERSTELLAR_HABITAT = new DefPlanetClass("Interstellar Habitat", 1);
	public static final DefPlanetClass INTERSTELLAR_RINGWORLD_HABITAT = new DefPlanetClass("Interstellar Ringworld Habitat", 1);
	public static final DefPlanetClass CHRONO_SINGULARITY = new DefPlanetClass("Chrono-Singularity", 2);
	public static final DefPlanetClass GAIA_ALDERSON_SLICE = new DefPlanetClass("Gaia Alderson Slice", 1);
	public static final DefPlanetClass ALDERSON_COMPUTING_COMPLEX = new DefPlanetClass("Alderson Computing Complex", 1);
	public static final DefPlanetClass ECUMENOPOLIS_ALDERSON = new DefPlanetClass("Ecumenopolis Alderson Slice", 1);
	public static final DefPlanetClass DEATH_WORLD = new DefPlanetClass("Death World", 10);
	public static final DefPlanetClass MICRO_BLACK_HOLE = new DefPlanetClass("Micro Black Hole", 1);
	public static final DefPlanetClass SYNTHETIC_SUN = new DefPlanetClass("Synthetic Sun", 1);
	public static final DefPlanetClass PRECURSOR_HABITAT = new DefPlanetClass("Precursor Habitat", 1);
	public static final DefPlanetClass AQUATIC_WORLD = new DefPlanetClass("Aquatic World", 64);
	public static final DefPlanetClass AQUATIC_HOT = new DefPlanetClass("Hot Aquatic World", 54);
	public static final DefPlanetClass COLD_AQUATIC = new DefPlanetClass("Cold Aquatic World", 76);
	public static final DefPlanetClass AQUA_CITY = new DefPlanetClass("Aqua-City", 1);
	public static final DefPlanetClass ECO_ARCOLOGY = new DefPlanetClass("Eco-Arcology", 1);
	public static final DefPlanetClass HIVE_BIOFORGE = new DefPlanetClass("Hive Bioforge", 1);
	public static final DefPlanetClass ROBO_FACTORY_WORLD = new DefPlanetClass("Robo-Factory World", 1);
	public static final DefPlanetClass METHANE_WORLD = new DefPlanetClass("Methane World", 67);
	public static final DefPlanetClass AMMONIA_WORLD = new DefPlanetClass("Ammonia World", 45);
	public static final DefPlanetClass ASH_WORLD = new DefPlanetClass("Ash World", 30);
	public static final DefPlanetClass RADIOTROPHIC_WORLD = new DefPlanetClass("Radiotrophic World", 50);
	public static final DefPlanetClass GAS_GIANT_HABITAT = new DefPlanetClass("Gas Giant Habitat", 7);
	public static final DefPlanetClass BARREN_HABITAT = new DefPlanetClass("Barren World Habitat", 6);
	public static final DefPlanetClass COLD_BARREN_HABITAT = new DefPlanetClass("Cold Barren World Habitat", 6);
	public static final DefPlanetClass MOLTEN_HABITAT = new DefPlanetClass("Molten World Habitat", 6);
	public static final DefPlanetClass FROZEN_HABITAT = new DefPlanetClass("Frozen World Habitat", 6);
	public static final DefPlanetClass HOTHOUSE_HABITAT = new DefPlanetClass("Hothouse World Habitat", 6);
	public static final DefPlanetClass ASTEROID_HABITAT = new DefPlanetClass("Asteroid Habitat", 6);
	public static final DefPlanetClass INFECTED_WORLD = new DefPlanetClass("Infected World", 2);
	public static final DefPlanetClass PRAIRIE_WORLD = new DefPlanetClass("Prairie World", 60);
	public static final DefPlanetClass ANTARCTIC_WORLD = new DefPlanetClass("Antarctic World", 45);
	public static final DefPlanetClass SNOW_WORLD = new DefPlanetClass("Snow World", 40);
	public static final DefPlanetClass GLACIAL_WORLD = new DefPlanetClass("Glacial World", 50);
	public static final DefPlanetClass FRIGID_WORLD = new DefPlanetClass("Frigid World", 60);
	public static final DefPlanetClass STEPPE_WORLD = new DefPlanetClass("Steppe World", 60);
	public static final DefPlanetClass ATACAMA_WORLD = new DefPlanetClass("Atacama World", 60);
	public static final DefPlanetClass BOREAL_WORLD = new DefPlanetClass("Boreal World", 60);
	public static final DefPlanetClass HIGHLAND_WORLD = new DefPlanetClass("Highland World", 60);
	public static final DefPlanetClass DUNE_WORLD = new DefPlanetClass("Dune World", 70);
	public static final DefPlanetClass CRAG_WORLD = new DefPlanetClass("Crag World", 70);
	public static final DefPlanetClass CASCADIAN_WORLD = new DefPlanetClass("Cascadian World", 40);
	public static final DefPlanetClass BOG_WORLD = new DefPlanetClass("Bog World", 32);
	public static final DefPlanetClass MANGROVE_WORLD = new DefPlanetClass("Mangrove World", 80);
	public static final DefPlanetClass SWAMP_WORLD = new DefPlanetClass("Swamp World", 60);
	public static final DefPlanetClass ATOLL_WORLD = new DefPlanetClass("Atoll World", 66);
	public static final DefPlanetClass MESA_WORLD = new DefPlanetClass("Mesa World", 67);
	public static final DefPlanetClass OUTBACK_WORLD = new DefPlanetClass("Outback World", 43);
	public static final DefPlanetClass OASIS_WORLD = new DefPlanetClass("Oasis World", 45);
	public static final DefPlanetClass TEPUI_WORLD = new DefPlanetClass("Tepui World", 50);
	public static final DefPlanetClass MYCELIUM_WORLD = new DefPlanetClass("Mycelium World", 20);
	public static final DefPlanetClass RETINAL_WORLD = new DefPlanetClass("Retinal World", 100);
	public static final DefPlanetClass FOREST_WORLD = new DefPlanetClass("Forest World", 100);
	public static final DefPlanetClass MEDITERRANEAN_WORLD = new DefPlanetClass("Mediterranean World", 75);
	public static final DefPlanetClass ULTRALARGE_MEGAFLORA_WORLD = new DefPlanetClass("Ultralarge Megaflora World", 50);
	public static final DefPlanetClass MEGAFLORA_WORLD = new DefPlanetClass("Megaflora World", 50);
	public static final DefPlanetClass SALT_WORLD = new DefPlanetClass("Salt World", 100);
	public static final DefPlanetClass PRIMAL_WORLD = new DefPlanetClass("Primal World", 100);
	public static final DefPlanetClass KARST_WORLD = new DefPlanetClass("Karst World", 100);
	public static final DefPlanetClass SUPERHABITABLE_WORLD = new DefPlanetClass("Superhabitable World", 30);
	public static final DefPlanetClass TIDALLY_LOCKED_WORLD = new DefPlanetClass("Tidally-Locked World", 34);
	public static final DefPlanetClass GEOTHERMAL_WORLD = new DefPlanetClass("Geothermal World", 100);
	public static final DefPlanetClass BIOLUMINESCENT_WORLD = new DefPlanetClass("Bioluminescent World", 50);
	public static final DefPlanetClass SHROUD_WORLD = new DefPlanetClass("Shroud World", 100);
	public static final DefPlanetClass HOTHOUSE_WORLD = new DefPlanetClass("Hothouse World", 100);
	public static final DefPlanetClass CRYSTAL_WORLD = new DefPlanetClass("Crystal World", 60);
	public static final DefPlanetClass FLOATING_WORLD = new DefPlanetClass("Floating World", 40);
	public static final DefPlanetClass GRAVEYARD_WORLD = new DefPlanetClass("Graveyard World", 40);
	public static final DefPlanetClass TECHNO_ORGANIC_WORLD = new DefPlanetClass("Techno-Organic World", 15);
	public static final DefPlanetClass ARCHIVE_HABITAT = new DefPlanetClass("Archive World", 3);
	public static final DefPlanetClass CLASS_O_STAR = new DefPlanetClass("Class O Star", 70);
	public static final DefPlanetClass CLASS_O_SUPERGIANT = new DefPlanetClass("Class O Supergiant", 50);
	public static final DefPlanetClass CLASS_O_HYPERGIANT = new DefPlanetClass("Class O Hypergiant", 40);
	public static final DefPlanetClass CLASS_B_SUPERGIANT = new DefPlanetClass("Class B Supergiant", 50);
	public static final DefPlanetClass CLASS_A_SUPERGIANT = new DefPlanetClass("Class A Supergiant", 50);
	public static final DefPlanetClass CLASS_F_SUPERGIANT = new DefPlanetClass("Class F Supergiant", 50);
	public static final DefPlanetClass CLASS_G_GIANT = new DefPlanetClass("Class G Giant", 60);
	public static final DefPlanetClass CLASS_G_SUPERGIANT = new DefPlanetClass("Class G Supergiant", 100);
	public static final DefPlanetClass CLASS_K_GIANT = new DefPlanetClass("Class K Giant", 60);
	public static final DefPlanetClass CLASS_K_SUPERGIANT = new DefPlanetClass("Class K Supergiant", 50);
	public static final DefPlanetClass CLASS_M_SUPERGIANT = new DefPlanetClass("Class M Supergiant", 50);
	public static final DefPlanetClass CLASS_M_HYPERGIANT = new DefPlanetClass("Class M Hypergiant", 40);
	public static final DefPlanetClass CLASS_L_STAR = new DefPlanetClass("Class L Star", 70);
	public static final DefPlanetClass CLASS_Y_STAR = new DefPlanetClass("Class Y Star", 70);
	public static final DefPlanetClass CLASS_D_STAR = new DefPlanetClass("Class D Star", 70);
	public static final DefPlanetClass CLASS_C_GIANT = new DefPlanetClass("Class C Giant", 56);
	public static final DefPlanetClass CLASS_S_GIANT = new DefPlanetClass("Class S Giant", 54);
	public static final DefPlanetClass CLASS_W_STAR_AZURE = new DefPlanetClass("Class W Star (Azure)", 32);
	public static final DefPlanetClass CLASS_W_STAR_RED = new DefPlanetClass("Class W Star (Red)", 32);
	public static final DefPlanetClass CLASS_W_STAR_GREEN = new DefPlanetClass("Class W Star (Green)", 32);
	public static final DefPlanetClass CLASS_W_STAR_PURPLE = new DefPlanetClass("Class W Star (Purple)", 32);
	public static final DefPlanetClass NOVA = new DefPlanetClass("Nova", 9);
	public static final DefPlanetClass SUPERNOVA = new DefPlanetClass("Supernova", 7);
	public static final DefPlanetClass COLLAPSAR = new DefPlanetClass("Collapsar", 6);
	public static final DefPlanetClass PROTOSTAR = new DefPlanetClass("Protostar", 5);
	public static final DefPlanetClass LUMINOUS_BLUE_VARIABLE_STAR_BLUE = new DefPlanetClass("Luminous Blue Variable Star (Blue)", 60);
	public static final DefPlanetClass LUMINOUS_BLUE_VARIABLE_STAR_GREEN = new DefPlanetClass("Luminous Blue Variable Star (Green)", 60);
	public static final DefPlanetClass LUMINOUS_BLUE_VARIABLE_STAR_RED = new DefPlanetClass("Luminous Blue Variable Star (Red)", 60);
	public static final DefPlanetClass T_TAURI_STAR_RED = new DefPlanetClass("T Tauri Star (Red)", 63);
	public static final DefPlanetClass T_TAURI_STAR_ORANGE = new DefPlanetClass("T Tauri Star (Orange)", 63);
	public static final DefPlanetClass T_TAURI_STAR_WHITE = new DefPlanetClass("T Tauri Star (White)", 63);
	public static final DefPlanetClass AWAKENED_EMPIRE_STAR = new DefPlanetClass("Awakened Empire Star", 1);
	public static final DefPlanetClass MAGNETAR = new DefPlanetClass("Magnetar", 34);
	public static final DefPlanetClass MICROQUASAR = new DefPlanetClass("Microquasar", 24);
	public static final DefPlanetClass QUASAR = new DefPlanetClass("Quasar", 33);
	public static final DefPlanetClass FU_STAR = new DefPlanetClass("FU Star", 21);
	public static final DefPlanetClass MATRIOSKHA_BRAIN_REALITY_SIMULATOR = new DefPlanetClass("Matrioskha Brain Reality Simulator", 2);
	public static final DefPlanetClass MATRIOSKHA_BRAIN_INDUSTRIAL_SEGMENT = new DefPlanetClass("Matrioskha Brain Industrial Segment", 2);
	public static final DefPlanetClass MATRIOSKHA_BRAIN_PROCESSING_SEGMENT = new DefPlanetClass("Matrioskha Brain Processing Segment", 2);
	
}
