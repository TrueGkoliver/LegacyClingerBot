package game.common.planets.classes;

import java.util.ArrayList;
import java.util.Random;
@SuppressWarnings("unused")
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
	
	
	public static final DefaultPlanetClass DESERT_WORLD = new DefaultPlanetClass("Desert World", 80);
	public static final DefaultPlanetClass ARID_WORLD = new DefaultPlanetClass("Arid World", 83);
	public static final DefaultPlanetClass SAVANNA_WORLD = new DefaultPlanetClass("Savanna World", 75);
	public static final DefaultPlanetClass TROPICAL_WORLD = new DefaultPlanetClass("Tropical World", 75);
	public static final DefaultPlanetClass CONTINENTAL_WORLD = new DefaultPlanetClass("Continental World", 75);
	public static final DefaultPlanetClass OCEAN_WORLD = new DefaultPlanetClass("Ocean World", 82);
	public static final DefaultPlanetClass TUNDRA_WORLD = new DefaultPlanetClass("Tundra World", 72);
	public static final DefaultPlanetClass ARCTIC_WORLD = new DefaultPlanetClass("Arctic World", 90);
	public static final DefaultPlanetClass ALPINE_WORLD = new DefaultPlanetClass("Alpine World", 70);
	public static final DefaultPlanetClass GAS_GIANT = new DefaultPlanetClass("Gas Giant", 100);
	public static final DefaultPlanetClass ASTEROID = new DefaultPlanetClass("Asteroid", 100);
	public static final DefaultPlanetClass ICE_ASTEROID = new DefaultPlanetClass("Ice Asteroid", 100);
	public static final DefaultPlanetClass CRYSTALLINE_ASTEROID = new DefaultPlanetClass("Crystalline Asteroid", 100);
	public static final DefaultPlanetClass MOLTEN_WORLD = new DefaultPlanetClass("Molten World", 100);
	public static final DefaultPlanetClass BARREN_WORLD = new DefaultPlanetClass("Barren World", 100);
	public static final DefaultPlanetClass COLD_BARREN_WORLD = new DefaultPlanetClass("Cold Barren World", 100);
	public static final DefaultPlanetClass TOXIC_WORLD = new DefaultPlanetClass("Toxic World", 100);
	public static final DefaultPlanetClass FROZEN_WORLD = new DefaultPlanetClass("Frozen World", 100);
	public static final DefaultPlanetClass TOMB_WORLD = new DefaultPlanetClass("Tomb World", 43);
	public static final DefaultPlanetClass HIVE_WORLD = new DefaultPlanetClass("Hive World", 20);
	public static final DefaultPlanetClass MACHINE_WORLD = new DefaultPlanetClass("Machine World", 20);
	public static final DefaultPlanetClass HIELDED_WORLD = new DefaultPlanetClass("Shielded World", 20);
	public static final DefaultPlanetClass AI_WORLD = new DefaultPlanetClass("AI World", 12);
	public static final DefaultPlanetClass INFESTED_WORLD = new DefaultPlanetClass("Infested World", 12);
	public static final DefaultPlanetClass GAIA_WORLD = new DefaultPlanetClass("Gaia World", 13);
	public static final DefaultPlanetClass CLASS_B_STAR = new DefaultPlanetClass("Class B Star", 100);
	public static final DefaultPlanetClass CLASS_A_STAR = new DefaultPlanetClass("Class A Star", 100);
	public static final DefaultPlanetClass CLASS_F_STAR = new DefaultPlanetClass("Class F Star", 100);
	public static final DefaultPlanetClass CLASS_G_STAR = new DefaultPlanetClass("Class G Star", 100);
	public static final DefaultPlanetClass CLASS_K_STAR = new DefaultPlanetClass("Class K Star", 100);
	public static final DefaultPlanetClass CLASS_M_STAR = new DefaultPlanetClass("Class M Star", 100);
	public static final DefaultPlanetClass CLASS_M_RED_GIANT = new DefaultPlanetClass("Class M Red Giant", 100);
	public static final DefaultPlanetClass CLASS_T_BROWN_DWARF = new DefaultPlanetClass("Class T Brown Dwarf", 100);
	public static final DefaultPlanetClass BLACK_HOLE = new DefaultPlanetClass("Black Hole", 30);
	public static final DefaultPlanetClass NEUTRON_STAR = new DefaultPlanetClass("Neutron Star", 22);
	public static final DefaultPlanetClass PULSAR = new DefaultPlanetClass("Pulsar", 30);
	public static final DefaultPlanetClass HABITABLE_RING_WORLD = new DefaultPlanetClass("Habitable Ring World", 10);
	public static final DefaultPlanetClass RING_WORLD_SUPPORT_SEGMENT = new DefaultPlanetClass("Ring World Support Segment", 10);
	public static final DefaultPlanetClass RING_WORLD_SEAM = new DefaultPlanetClass("Ring World Seam", 10);
	public static final DefaultPlanetClass ORBITAL_HABITAT = new DefaultPlanetClass("Orbital Habitat", 20);
	public static final DefaultPlanetClass SHROUDED_WORLD = new DefaultPlanetClass("Shrouded World", 1);
	public static final DefaultPlanetClass BROKEN_WORLD = new DefaultPlanetClass("Broken World", 100);
	public static final DefaultPlanetClass SHATTERED_WORLD = new DefaultPlanetClass("Shattered World", 100);
	public static final DefaultPlanetClass NANITE_WORLD = new DefaultPlanetClass("Nanite World", 100);
	public static final DefaultPlanetClass CRACKED_EGG_WORLD = new DefaultPlanetClass("Cracked Egg World", 1);
	public static final DefaultPlanetClass ECUMENOPOLIS = new DefaultPlanetClass("Ecumenopolis", 10);
	public static final DefaultPlanetClass RELIC_WORLD = new DefaultPlanetClass("Relic World", 10);
	public static final DefaultPlanetClass FRACTURED_WORLD = new DefaultPlanetClass("Fractured World", 100);
	public static final DefaultPlanetClass ULTRAFRACTURED_WORLD = new DefaultPlanetClass("Ultrafractured World", 50);
	public static final DefaultPlanetClass BIRCH_WORLD = new DefaultPlanetClass("Birch World", 1);
	public static final DefaultPlanetClass LUNAR_SPECULOREFRACTOR_MOON = new DefaultPlanetClass("Lunar Speculorefractor Moon", 1);
	public static final DefaultPlanetClass PLANETARY_COMPUTING_COMPLEX = new DefaultPlanetClass("Planetary Computing Complex", 4);
	public static final DefaultPlanetClass LIFELESS_HABITABLE_WORLD = new DefaultPlanetClass("Lifeless Habitable World", 50);
	public static final DefaultPlanetClass LIFELESS_FOGGED_WORLD = new DefaultPlanetClass("Lifeless Fogged World", 60);
	public static final DefaultPlanetClass LIFELESS_TORRID_WORLD = new DefaultPlanetClass("Lifeless Torrid World", 60);
	public static final DefaultPlanetClass METALLIC_HYDROGEN_GIANT = new DefaultPlanetClass("Metallic Hydrogen Giant", 100);
	public static final DefaultPlanetClass YGGDRASIL_ORCHID = new DefaultPlanetClass("Yggdrasil Orchid", 100);
	public static final DefaultPlanetClass VIRTUAL_WORLD = new DefaultPlanetClass("Virtual World", 3);
	public static final DefaultPlanetClass SQUAREWORLD_SEGMENT = new DefaultPlanetClass("Squareworld Segment", 1);
	public static final DefaultPlanetClass STRIPMINED_WORLD = new DefaultPlanetClass("Stripmined World", 70);
	public static final DefaultPlanetClass DEPLETED_WORLD = new DefaultPlanetClass("Depleted World", 60);
	public static final DefaultPlanetClass CLASS_L_BROWN_DWARF = new DefaultPlanetClass("Class L Brown Dwarf", 67);
	public static final DefaultPlanetClass IGNITED_STAR = new DefaultPlanetClass("Ignited Star", 24);
	public static final DefaultPlanetClass PANTHALASSIC_WORLD = new DefaultPlanetClass("Panthalassic (Melted Frozen) World", 43);
	public static final DefaultPlanetClass SUPERMASSIVE_BLACK_HOLE = new DefaultPlanetClass("Supermassive Black Hole", 4);
	public static final DefaultPlanetClass PENROSE_RINGWORLD_SEGMENT = new DefaultPlanetClass("Penrose Ringworld Segment", 2);
	public static final DefaultPlanetClass PENROSE_RINGWORLD_SUPPORT_SEGMENT = new DefaultPlanetClass("Penrose Ringworld Support Segment", 2);
	public static final DefaultPlanetClass ORBITAL_ELYSIUM = new DefaultPlanetClass("Orbital Elysium", 3);
	public static final DefaultPlanetClass INTERSTELLAR_HABITAT = new DefaultPlanetClass("Interstellar Habitat", 1);
	public static final DefaultPlanetClass INTERSTELLAR_RINGWORLD_HABITAT = new DefaultPlanetClass("Interstellar Ringworld Habitat", 1);
	public static final DefaultPlanetClass CHRONO_SINGULARITY = new DefaultPlanetClass("Chrono-Singularity", 2);
	public static final DefaultPlanetClass GAIA_ALDERSON_SLICE = new DefaultPlanetClass("Gaia Alderson Slice", 1);
	public static final DefaultPlanetClass ALDERSON_COMPUTING_COMPLEX = new DefaultPlanetClass("Alderson Computing Complex", 1);
	public static final DefaultPlanetClass ECUMENOPOLIS_ALDERSON = new DefaultPlanetClass("Ecumenopolis Alderson Slice", 1);
	public static final DefaultPlanetClass DEATH_WORLD = new DefaultPlanetClass("Death World", 10);
	public static final DefaultPlanetClass MICRO_BLACK_HOLE = new DefaultPlanetClass("Micro Black Hole", 1);
	public static final DefaultPlanetClass SYNTHETIC_SUN = new DefaultPlanetClass("Synthetic Sun", 1);
	public static final DefaultPlanetClass PRECURSOR_HABITAT = new DefaultPlanetClass("Precursor Habitat", 1);
	public static final DefaultPlanetClass AQUATIC_WORLD = new DefaultPlanetClass("Aquatic World", 64);
	public static final DefaultPlanetClass AQUATIC_HOT = new DefaultPlanetClass("Hot Aquatic World", 54);
	public static final DefaultPlanetClass COLD_AQUATIC = new DefaultPlanetClass("Cold Aquatic World", 76);
	public static final DefaultPlanetClass AQUA_CITY = new DefaultPlanetClass("Aqua-City", 1);
	public static final DefaultPlanetClass ECO_ARCOLOGY = new DefaultPlanetClass("Eco-Arcology", 1);
	public static final DefaultPlanetClass HIVE_BIOFORGE = new DefaultPlanetClass("Hive Bioforge", 1);
	public static final DefaultPlanetClass ROBO_FACTORY_WORLD = new DefaultPlanetClass("Robo-Factory World", 1);
	public static final DefaultPlanetClass METHANE_WORLD = new DefaultPlanetClass("Methane World", 67);
	public static final DefaultPlanetClass AMMONIA_WORLD = new DefaultPlanetClass("Ammonia World", 45);
	public static final DefaultPlanetClass ASH_WORLD = new DefaultPlanetClass("Ash World", 30);
	public static final DefaultPlanetClass RADIOTROPHIC_WORLD = new DefaultPlanetClass("Radiotrophic World", 50);
	public static final DefaultPlanetClass GAS_GIANT_HABITAT = new DefaultPlanetClass("Gas Giant Habitat", 7);
	public static final DefaultPlanetClass BARREN_HABITAT = new DefaultPlanetClass("Barren World Habitat", 6);
	public static final DefaultPlanetClass COLD_BARREN_HABITAT = new DefaultPlanetClass("Cold Barren World Habitat", 6);
	public static final DefaultPlanetClass MOLTEN_HABITAT = new DefaultPlanetClass("Molten World Habitat", 6);
	public static final DefaultPlanetClass FROZEN_HABITAT = new DefaultPlanetClass("Frozen World Habitat", 6);
	public static final DefaultPlanetClass HOTHOUSE_HABITAT = new DefaultPlanetClass("Hothouse World Habitat", 6);
	public static final DefaultPlanetClass ASTEROID_HABITAT = new DefaultPlanetClass("Asteroid Habitat", 6);
	public static final DefaultPlanetClass INFECTED_WORLD = new DefaultPlanetClass("Infected World", 2);
	public static final DefaultPlanetClass PRAIRIE_WORLD = new DefaultPlanetClass("Prairie World", 60);
	public static final DefaultPlanetClass ANTARCTIC_WORLD = new DefaultPlanetClass("Antarctic World", 45);
	public static final DefaultPlanetClass SNOW_WORLD = new DefaultPlanetClass("Snow World", 40);
	public static final DefaultPlanetClass GLACIAL_WORLD = new DefaultPlanetClass("Glacial World", 50);
	public static final DefaultPlanetClass FRIGID_WORLD = new DefaultPlanetClass("Frigid World", 60);
	public static final DefaultPlanetClass STEPPE_WORLD = new DefaultPlanetClass("Steppe World", 60);
	public static final DefaultPlanetClass ATACAMA_WORLD = new DefaultPlanetClass("Atacama World", 60);
	public static final DefaultPlanetClass BOREAL_WORLD = new DefaultPlanetClass("Boreal World", 60);
	public static final DefaultPlanetClass HIGHLAND_WORLD = new DefaultPlanetClass("Highland World", 60);
	public static final DefaultPlanetClass DUNE_WORLD = new DefaultPlanetClass("Dune World", 70);
	public static final DefaultPlanetClass CRAG_WORLD = new DefaultPlanetClass("Crag World", 70);
	public static final DefaultPlanetClass CASCADIAN_WORLD = new DefaultPlanetClass("Cascadian World", 40);
	public static final DefaultPlanetClass BOG_WORLD = new DefaultPlanetClass("Bog World", 32);
	public static final DefaultPlanetClass MANGROVE_WORLD = new DefaultPlanetClass("Mangrove World", 80);
	public static final DefaultPlanetClass SWAMP_WORLD = new DefaultPlanetClass("Swamp World", 60);
	public static final DefaultPlanetClass ATOLL_WORLD = new DefaultPlanetClass("Atoll World", 66);
	public static final DefaultPlanetClass MESA_WORLD = new DefaultPlanetClass("Mesa World", 67);
	public static final DefaultPlanetClass OUTBACK_WORLD = new DefaultPlanetClass("Outback World", 43);
	public static final DefaultPlanetClass OASIS_WORLD = new DefaultPlanetClass("Oasis World", 45);
	public static final DefaultPlanetClass TEPUI_WORLD = new DefaultPlanetClass("Tepui World", 50);
	public static final DefaultPlanetClass MYCELIUM_WORLD = new DefaultPlanetClass("Mycelium World", 20);
	public static final DefaultPlanetClass RETINAL_WORLD = new DefaultPlanetClass("Retinal World", 100);
	public static final DefaultPlanetClass FOREST_WORLD = new DefaultPlanetClass("Forest World", 100);
	public static final DefaultPlanetClass MEDITERRANEAN_WORLD = new DefaultPlanetClass("Mediterranean World", 75);
	public static final DefaultPlanetClass ULTRALARGE_MEGAFLORA_WORLD = new DefaultPlanetClass("Ultralarge Megaflora World", 50);
	public static final DefaultPlanetClass MEGAFLORA_WORLD = new DefaultPlanetClass("Megaflora World", 50);
	public static final DefaultPlanetClass SALT_WORLD = new DefaultPlanetClass("Salt World", 100);
	public static final DefaultPlanetClass PRIMAL_WORLD = new DefaultPlanetClass("Primal World", 100);
	public static final DefaultPlanetClass KARST_WORLD = new DefaultPlanetClass("Karst World", 100);
	public static final DefaultPlanetClass SUPERHABITABLE_WORLD = new DefaultPlanetClass("Superhabitable World", 30);
	public static final DefaultPlanetClass TIDALLY_LOCKED_WORLD = new DefaultPlanetClass("Tidally-Locked World", 34);
	public static final DefaultPlanetClass GEOTHERMAL_WORLD = new DefaultPlanetClass("Geothermal World", 100);
	public static final DefaultPlanetClass BIOLUMINESCENT_WORLD = new DefaultPlanetClass("Bioluminescent World", 50);
	public static final DefaultPlanetClass SHROUD_WORLD = new DefaultPlanetClass("Shroud World", 100);
	public static final DefaultPlanetClass HOTHOUSE_WORLD = new DefaultPlanetClass("Hothouse World", 100);
	public static final DefaultPlanetClass CRYSTAL_WORLD = new DefaultPlanetClass("Crystal World", 60);
	public static final DefaultPlanetClass FLOATING_WORLD = new DefaultPlanetClass("Floating World", 40);
	public static final DefaultPlanetClass GRAVEYARD_WORLD = new DefaultPlanetClass("Graveyard World", 40);
	public static final DefaultPlanetClass TECHNO_ORGANIC_WORLD = new DefaultPlanetClass("Techno-Organic World", 15);
	public static final DefaultPlanetClass ARCHIVE_HABITAT = new DefaultPlanetClass("Archive World", 3);
	public static final DefaultPlanetClass CLASS_O_STAR = new DefaultPlanetClass("Class O Star", 70);
	public static final DefaultPlanetClass CLASS_O_SUPERGIANT = new DefaultPlanetClass("Class O Supergiant", 50);
	public static final DefaultPlanetClass CLASS_O_HYPERGIANT = new DefaultPlanetClass("Class O Hypergiant", 40);
	public static final DefaultPlanetClass CLASS_B_SUPERGIANT = new DefaultPlanetClass("Class B Supergiant", 50);
	public static final DefaultPlanetClass CLASS_A_SUPERGIANT = new DefaultPlanetClass("Class A Supergiant", 50);
	public static final DefaultPlanetClass CLASS_F_SUPERGIANT = new DefaultPlanetClass("Class F Supergiant", 50);
	public static final DefaultPlanetClass CLASS_G_GIANT = new DefaultPlanetClass("Class G Giant", 60);
	public static final DefaultPlanetClass CLASS_G_SUPERGIANT = new DefaultPlanetClass("Class G Supergiant", 100);
	public static final DefaultPlanetClass CLASS_K_GIANT = new DefaultPlanetClass("Class K Giant", 60);
	public static final DefaultPlanetClass CLASS_K_SUPERGIANT = new DefaultPlanetClass("Class K Supergiant", 50);
	public static final DefaultPlanetClass CLASS_M_SUPERGIANT = new DefaultPlanetClass("Class M Supergiant", 50);
	public static final DefaultPlanetClass CLASS_M_HYPERGIANT = new DefaultPlanetClass("Class M Hypergiant", 40);
	public static final DefaultPlanetClass CLASS_L_STAR = new DefaultPlanetClass("Class L Star", 70);
	public static final DefaultPlanetClass CLASS_Y_STAR = new DefaultPlanetClass("Class Y Star", 70);
	public static final DefaultPlanetClass CLASS_D_STAR = new DefaultPlanetClass("Class D Star", 70);
	public static final DefaultPlanetClass CLASS_C_GIANT = new DefaultPlanetClass("Class C Giant", 56);
	public static final DefaultPlanetClass CLASS_S_GIANT = new DefaultPlanetClass("Class S Giant", 54);
	public static final DefaultPlanetClass CLASS_W_STAR_AZURE = new DefaultPlanetClass("Class W Star (Azure)", 32);
	public static final DefaultPlanetClass CLASS_W_STAR_RED = new DefaultPlanetClass("Class W Star (Red)", 32);
	public static final DefaultPlanetClass CLASS_W_STAR_GREEN = new DefaultPlanetClass("Class W Star (Green)", 32);
	public static final DefaultPlanetClass CLASS_W_STAR_PURPLE = new DefaultPlanetClass("Class W Star (Purple)", 32);
	public static final DefaultPlanetClass NOVA = new DefaultPlanetClass("Nova", 9);
	public static final DefaultPlanetClass SUPERNOVA = new DefaultPlanetClass("Supernova", 7);
	public static final DefaultPlanetClass COLLAPSAR = new DefaultPlanetClass("Collapsar", 6);
	public static final DefaultPlanetClass PROTOSTAR = new DefaultPlanetClass("Protostar", 5);
	public static final DefaultPlanetClass LUMINOUS_BLUE_VARIABLE_STAR_BLUE = new DefaultPlanetClass("Luminous Blue Variable Star (Blue)", 60);
	public static final DefaultPlanetClass LUMINOUS_BLUE_VARIABLE_STAR_GREEN = new DefaultPlanetClass("Luminous Blue Variable Star (Green)", 60);
	public static final DefaultPlanetClass LUMINOUS_BLUE_VARIABLE_STAR_RED = new DefaultPlanetClass("Luminous Blue Variable Star (Red)", 60);
	public static final DefaultPlanetClass T_TAURI_STAR_RED = new DefaultPlanetClass("T Tauri Star (Red)", 63);
	public static final DefaultPlanetClass T_TAURI_STAR_ORANGE = new DefaultPlanetClass("T Tauri Star (Orange)", 63);
	public static final DefaultPlanetClass T_TAURI_STAR_WHITE = new DefaultPlanetClass("T Tauri Star (White)", 63);
	public static final DefaultPlanetClass AWAKENED_EMPIRE_STAR = new DefaultPlanetClass("Awakened Empire Star", 1);
	public static final DefaultPlanetClass MAGNETAR = new DefaultPlanetClass("Magnetar", 34);
	public static final DefaultPlanetClass MICROQUASAR = new DefaultPlanetClass("Microquasar", 24);
	public static final DefaultPlanetClass QUASAR = new DefaultPlanetClass("Quasar", 33);
	public static final DefaultPlanetClass FU_STAR = new DefaultPlanetClass("FU Star", 21);
	public static final DefaultPlanetClass MATRIOSKHA_BRAIN_REALITY_SIMULATOR = new DefaultPlanetClass("Matrioskha Brain Reality Simulator", 2);
	public static final DefaultPlanetClass MATRIOSKHA_BRAIN_INDUSTRIAL_SEGMENT = new DefaultPlanetClass("Matrioskha Brain Industrial Segment", 2);
	public static final DefaultPlanetClass MATRIOSKHA_BRAIN_PROCESSING_SEGMENT = new DefaultPlanetClass("Matrioskha Brain Processing Segment", 2);
	
}
