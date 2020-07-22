package game.common.ships.sizes.sections;

import java.util.HashMap;

import game.common.ships.weapons.SlotType;
import util.DoubleSet;
import static util.DoubleSet.make;
@SuppressWarnings("unused")
public class Sections {
	private static SlotType L = SlotType.ST_GUN_L;
	private static SlotType M = SlotType.ST_GUN_M;
	private static SlotType S = SlotType.ST_GUN_S;
	private static SlotType G = SlotType.ST_TORPEDO;
	private static SlotType H = SlotType.ST_HANGAR;
	private static SlotType P = SlotType.ST_PD;
	private static SlotType X = SlotType.ST_GUN_XL;
	private static SlotType T = SlotType.ST_TITAN;
	private static SlotType W = SlotType.ST_COLOSSUS;
	public static class SlotMix {
		SlotType type;
		int amt;
		public SlotMix(SlotType type, int amt) {
			this.type = type;
			this.amt = amt;
		}
	}
	public static SlotMix join(SlotType type, int amt) {
		return new SlotMix(type, amt);
	}
	public static HashMap<SlotType,Integer> generateSection(SlotMix... mixes) {
		HashMap<SlotType, Integer> tbr = new HashMap<SlotType, Integer>();
		for (int i=0; i<mixes.length; i++) {
			SlotMix mix = mixes[i];
			tbr.put(mix.type, mix.amt);
		}
		return tbr;
	}
	public static final HashMap<SlotType, Integer> S_C_DELTA_CORVETTE_A = generateSection(join(SlotType.ST_GUN_S, 1), join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_C_DELTA_CORVETTE_B = generateSection(join(SlotType.ST_GUN_S, 3));
	public static final HashMap<SlotType, Integer> S_C_DELTA_CORVETTE_C = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_PD, 1));
	public static final HashMap<SlotType, Integer> S_C_MISSILE_BOAT = generateSection(join(SlotType.ST_GUN_S, 1), join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_C_MISSILE_BOAT_2 = generateSection(join(SlotType.ST_PD, 1), join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_C_PICKET_SHIP = generateSection(join(SlotType.ST_PD, 1), join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_C_SHIFTER_CORE = generateSection(join(SlotType.ST_HANGAR, 1), join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_C_HANGAR_BOAT = generateSection(join(SlotType.ST_HANGAR, 1), join(SlotType.ST_PD, 2));
	public static final HashMap<SlotType, Integer> S_C_ASSAULT = generateSection(join(SlotType.ST_GUN_M, 1), join(SlotType.ST_GUN_S, 2));
	
	public static final ShipSection CORVETTE_DELTA_A = new ShipSection("Delta Corvette A", S_C_DELTA_CORVETTE_A);
	public static final ShipSection CORVETTE_DELTA_B = new ShipSection("Delta Corvette B", S_C_DELTA_CORVETTE_B);
	public static final ShipSection CORVETTE_DELTA_C = new ShipSection("Delta Corvette C", S_C_DELTA_CORVETTE_C);
	public static final ShipSection CORVETTE_MISSILE = new ShipSection("Missile Boat", S_C_MISSILE_BOAT);
	public static final ShipSection CORVETTE_MISSILE_2 = new ShipSection("PD Missile Boat", S_C_MISSILE_BOAT_2);
	public static final ShipSection CORVETTE_PICKET_SHIP = new ShipSection("Picket Ship", S_C_PICKET_SHIP);
	public static final ShipSection CORVETTE_SHIFTER_CORE = new ShipSection("Shifter Core", S_C_SHIFTER_CORE);
	public static final ShipSection CORVETTE_HANGAR_BOAT = new ShipSection("Hangar Boat", S_C_HANGAR_BOAT);
	public static final ShipSection CORVETTE_ASSAULT = new ShipSection("Assault Boat", S_C_ASSAULT);
	
	//Destroyer: Bottom Section
	public static final HashMap<SlotType, Integer> S_D1_DELTA_DESTROYER_A = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_GUN_M, 1));
	public static final HashMap<SlotType, Integer> S_D1_DELTA_DESTROYER_B = generateSection(join(SlotType.ST_PD, 2), join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_D1_DELTA_DESTROYER_C = generateSection(join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_D1_DELTA_DESTROYER_D = generateSection(join(SlotType.ST_PD, 1), join(SlotType.ST_GUN_S, 2));
	
	public static final HashMap<SlotType, Integer> S_D1_ARTILLERY = generateSection(join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_D1_GUNSHIP = generateSection(join(SlotType.ST_GUN_M, 1), join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_D1_PICKET = generateSection(join(SlotType.ST_PD, 1), join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_D1_PD_DESTROYER = generateSection(join(SlotType.ST_GUN_M, 1), join(SlotType.ST_PD, 4));
	public static final HashMap<SlotType, Integer> S_D1_MISSILE = generateSection(join(SlotType.ST_TORPEDO, 2));
	
	//Destroyer: Top Section
	public static final HashMap<SlotType, Integer> S_D2_DELTA_DESTROYER_A = generateSection(join(SlotType.ST_PD, 2));
	public static final HashMap<SlotType, Integer> S_D2_DELTA_DESTROYER_B = generateSection(join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_D2_DELTA_DESTROYER_C = generateSection(join(SlotType.ST_GUN_M, 1));
	public static final HashMap<SlotType, Integer> S_D2_DELTA_DESTROYER_D = generateSection(join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_D2_INTERCEPTOR = generateSection(join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_D2_GUNSHIP = generateSection(join(SlotType.ST_GUN_M, 1));
	public static final HashMap<SlotType, Integer> S_D2_PICKET = generateSection(join(SlotType.ST_PD, 2));
	public static final HashMap<SlotType, Integer> S_D2_PD_DESTROYER = generateSection(join(SlotType.ST_PD, 4));

	//Cruiser: Bottom
	public static final HashMap<SlotType, Integer> S_CR1_DELTA_CRUISER_A = generateSection(join(SlotType.ST_TORPEDO, 2));
	public static final HashMap<SlotType, Integer> S_CR1_DELTA_CRUISER_B = generateSection(join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_CR1_DELTA_CRUISER_C = generateSection(join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_CR1_DELTA_CRUISER_D = generateSection(join(SlotType.ST_PD, 2), join(SlotType.ST_GUN_M, 1));
	
	public static final HashMap<SlotType, Integer> S_CR1_ARTILLERY = generateSection(join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_CR1_MISSILE = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_CR1_PINPOINT = generateSection(join(SlotType.ST_PD, 2), join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_CR1_BROADSIDE = generateSection(join(SlotType.ST_GUN_M, 2));
	
	
	//Cruiser: Middle
	public static final HashMap<SlotType, Integer> S_CR2_DELTA_CRUISER_A = generateSection(join(SlotType.ST_PD, 2), join(SlotType.ST_HANGAR, 1));
	public static final HashMap<SlotType, Integer> S_CR2_DELTA_CRUISER_B = generateSection(join(SlotType.ST_GUN_M, 1), join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_CR2_DELTA_CRUISER_C = generateSection(join(SlotType.ST_TORPEDO, 3));
	public static final HashMap<SlotType, Integer> S_CR2_DELTA_CRUISER_D = generateSection(join(SlotType.ST_GUN_M, 3));
	
	public static final HashMap<SlotType, Integer> S_CR2_HANGAR_CORE = generateSection(join(SlotType.ST_PD, 2), join(SlotType.ST_HANGAR, 1));
	public static final HashMap<SlotType, Integer> S_CR2_ARTILLERY_CORE = generateSection(join(SlotType.ST_GUN_M, 1), join(SlotType.ST_GUN_L, 1));
	
	public static final HashMap<SlotType, Integer> S_CR2_BROADSIDE_CORE = generateSection(join(SlotType.ST_GUN_M, 3));
	public static final HashMap<SlotType, Integer> S_CR2_MISSILE_CORE = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_TORPEDO, 2));
	public static final HashMap<SlotType, Integer> S_CR2_PINPOINT_CORE = generateSection(join(SlotType.ST_PD, 2), join(SlotType.ST_TORPEDO, 2));
	
	//Cruiser: Top
	public static final HashMap<SlotType, Integer> S_CR3_DELTA_CRUISER_A = generateSection(join(SlotType.ST_GUN_M, 1));
	public static final HashMap<SlotType, Integer> S_CR3_DELTA_CRUISER_B = generateSection(join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_CR3_DELTA_CRUISER_C = generateSection(join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_CR3_DELTA_CRUISER_D = generateSection(join(SlotType.ST_GUN_M, 1));
	
	public static final HashMap<SlotType, Integer> S_CR3_GUNSHIP = generateSection(join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_CR3_PINPOINT = generateSection(join(SlotType.ST_PD, 2));

	//Stike Cruiser: Front
	public static final HashMap<SlotType, Integer> S_SCR1_VOLLEY = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_SCR1_PINPOINT = generateSection(join(SlotType.ST_PD, 2), join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_SCR1_FULLISADE = generateSection(join(SlotType.ST_TORPEDO,1), join(SlotType.ST_GUN_S, 4));
	public static final HashMap<SlotType, Integer> S_SCR1_MISSILE = generateSection(join(SlotType.ST_TORPEDO, 2));
	public static final HashMap<SlotType, Integer> S_SCR1_ARTILLERY = generateSection(join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_SCR1_BROADSIDE = generateSection(join(SlotType.ST_GUN_M, 3));
	
	//Strike Cruiser: Mid: Note: DOUBLE on this one, 4 sections total
	public static final HashMap<SlotType, Integer> S_SCR2_VOLLEY = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_SCR2_SPITFIRE = generateSection(join(SlotType.ST_GUN_S, 6));
	public static final HashMap<SlotType, Integer> S_SCR2_BROADSIDE = generateSection(join(SlotType.ST_GUN_M, 3));
	
	//Exploration Cruiser: Back
	public static final HashMap<SlotType, Integer> S_SCR3_BROADSIDE = generateSection(join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_SCR3_PINPOINT = generateSection(join(SlotType.ST_PD, 2), join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_SCR3_SPITFIRE = generateSection(join(SlotType.ST_GUN_S, 4));
	
	
	//Exploration Cruiser: Front
	public static final HashMap<SlotType, Integer> S_ECR1_ARTILLERY_L1 = generateSection(join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_ECR1_FUSILLADE_L1 = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_ECR1_BROADSIDE_L1 = generateSection(join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_ECR1_ARTILLERY_L2 = generateSection(join(SlotType.ST_GUN_L, 2));
	public static final HashMap<SlotType, Integer> S_ECR1_FULLISADE_L2 = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_TORPEDO, 2));
	public static final HashMap<SlotType, Integer> S_ECR1_BROADSIZE_L2 = generateSection(join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_ECR1_ARTILLERY_L3 = generateSection(join(SlotType.ST_GUN_L, 4));
	public static final HashMap<SlotType, Integer> S_ECR1_FULLISADE_L3 = generateSection(join(SlotType.ST_GUN_S, 4), join(SlotType.ST_TORPEDO, 4));
	public static final HashMap<SlotType, Integer> S_ECR1_BROADSIDE_L3 = generateSection(join(SlotType.ST_GUN_M, 6));
	//Exploration Cruiser: Mid 1
	public static final HashMap<SlotType, Integer> S_ECR2_BARRAGE_L1 = generateSection(join(SlotType.ST_GUN_L, 1), join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_ECR2_ARTILLERY_L1 = generateSection(join(SlotType.ST_GUN_M, 1), join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_ECR2_VOLLEY_L1 = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_ECR2_MISSILE_L1 = generateSection(join(SlotType.ST_TORPEDO, 3));
	public static final HashMap<SlotType, Integer> S_ECR2_BROADSIDE_L1 = generateSection(join(SlotType.ST_GUN_M, 3));
	
	public static final HashMap<SlotType, Integer> S_ECR2_BARRAGE_L2 = generateSection(join(SlotType.ST_GUN_L, 1), join(SlotType.ST_TORPEDO, 2));
	public static final HashMap<SlotType, Integer> S_ECR2_ARTILLERY_L2 = generateSection(join(SlotType.ST_GUN_M, 2), join(SlotType.ST_GUN_L, 2));
	public static final HashMap<SlotType, Integer> S_ECR2_VOLLEY_L2 = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_ECR2_MISSILE_L2 = generateSection(join(SlotType.ST_HANGAR, 1), join(SlotType.ST_TORPEDO, 4));
	public static final HashMap<SlotType, Integer> S_ECR2_BROADSIDE_L2 = generateSection(join(SlotType.ST_GUN_M, 4));
	
	public static final HashMap<SlotType, Integer> S_ECR2_BARRAGE_L3 = generateSection(join(SlotType.ST_GUN_L, 2), join(SlotType.ST_TORPEDO, 4));
	public static final HashMap<SlotType, Integer> S_ECR2_ARTILLERY_L3 = generateSection(join(SlotType.ST_GUN_M, 2), join(SlotType.ST_GUN_L, 4));
	public static final HashMap<SlotType, Integer> S_ECR2_VOLLEY_L3 = generateSection(join(SlotType.ST_GUN_S, 6), join(SlotType.ST_GUN_M, 6));
	public static final HashMap<SlotType, Integer> S_ECR2_MISSILE_L3 = generateSection(join(SlotType.ST_HANGAR, 2),join(SlotType.ST_TORPEDO, 8));
	public static final HashMap<SlotType, Integer> S_ECR2_BROADSIDE_L3 = generateSection(join(SlotType.ST_GUN_M, 8));
	
	//Exploration Cruiser: Back
	public static final HashMap<SlotType, Integer> S_ECR3_BROADSIDE_L1 = generateSection(join(SlotType.ST_GUN_M, 1));
	public static final HashMap<SlotType, Integer> S_ECR3_ARTILLERY_L1 = generateSection(join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_ECR3_SPITFIRE_L1 = generateSection(join(SlotType.ST_GUN_S, 3));
	public static final HashMap<SlotType, Integer> S_ECR3_PD_L1 = generateSection(join(SlotType.ST_PD, 3));
	
	public static final HashMap<SlotType, Integer> S_ECR3_BROADSIDE_L2 = generateSection(join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_ECR3_ARTILLERY_L2 = generateSection(join(SlotType.ST_GUN_L, 2));
	public static final HashMap<SlotType, Integer> S_ECR3_SPITFIRE_L2 = generateSection(join(SlotType.ST_GUN_S, 6));
	public static final HashMap<SlotType, Integer> S_ECR3_PD_L2 = generateSection(join(SlotType.ST_PD, 6));
	
	public static final HashMap<SlotType, Integer> S_ECR3_BROADSIDE_L3 = generateSection(join(SlotType.ST_GUN_M, 8));
	public static final HashMap<SlotType, Integer> S_ECR3_ARTILLERY_L3 = generateSection(join(SlotType.ST_GUN_L, 4));
	public static final HashMap<SlotType, Integer> S_ECR3_SPITFIRE_L3 = generateSection(join(SlotType.ST_GUN_S, 12));
	public static final HashMap<SlotType, Integer> S_ECR3_PD_L3 = generateSection(join(SlotType.ST_PD, 12));

	//Escort Carrier: Front
	public static final HashMap<SlotType, Integer> S_ECA1_BROADSIDE = DoubleSet.generate(
		new DoubleSet<SlotType>(SlotType.ST_GUN_S, 2),
		new DoubleSet<SlotType>(SlotType.ST_GUN_M, 1)
	);
	public static final HashMap<SlotType, Integer> S_ECA1_MISSILE = DoubleSet.generate(
		new DoubleSet<SlotType>(SlotType.ST_TORPEDO, 2)
	);
	//Escort Carrier: Mids
	public static final HashMap<SlotType, Integer> S_ECA2_CARRIER = DoubleSet.generate(
		new DoubleSet<SlotType>(SlotType.ST_PD, 2),
		new DoubleSet<SlotType>(SlotType.ST_HANGAR, 2)
	);
	public static final HashMap<SlotType, Integer> S_ECA2_INVASION = DoubleSet.generate(
			new DoubleSet<SlotType>(SlotType.ST_PD, 2),
			new DoubleSet<SlotType>(SlotType.ST_GUN_L, 1)
	);
	//Escort Carrier: End
	public static final HashMap<SlotType, Integer> S_ECA3_BROADSIDE = DoubleSet.generate(
		new DoubleSet<SlotType>(SlotType.ST_GUN_M, 1)
	);
	public static final HashMap<SlotType, Integer> S_ECA3_MISSILE = DoubleSet.generate(
			new DoubleSet<SlotType>(SlotType.ST_TORPEDO, 1)
	);
	public static final HashMap<SlotType, Integer> S_ECA3_SPITFIRE = DoubleSet.generate(
			new DoubleSet<SlotType>(SlotType.ST_GUN_S, 2)
	);
	public static final HashMap<SlotType, Integer> S_ECA3_POINT_DEFENSE = DoubleSet.generate(
			new DoubleSet<SlotType>(SlotType.ST_PD, 2)
	);
	//Battlecruiser
	public static final HashMap<SlotType, Integer> S_BCR1_ARTILLERY = DoubleSet.generate(
		make(SlotType.ST_GUN_L, 2)
	);
	public static final HashMap<SlotType, Integer> S_BCR1_FUSILLADE = DoubleSet.generate(
		make(SlotType.ST_GUN_S, 2),
		make(SlotType.ST_TORPEDO, 2)
	);
	public static final HashMap<SlotType, Integer> S_BCR1_BROADSIDE = DoubleSet.generate(
			make(SlotType.ST_GUN_M, 3)
	);

	public static final HashMap<SlotType, Integer> S_BCR2_BARRAGE = DoubleSet.generate(
		make(SlotType.ST_GUN_L, 1),
		make(SlotType.ST_TORPEDO, 2)
	);
	public static final HashMap<SlotType, Integer> S_BCR2_ARTILLERY = DoubleSet.generate(
		make(SlotType.ST_GUN_M, 1),
		make(SlotType.ST_GUN_L, 2)
	);
	public static final HashMap<SlotType, Integer> S_BCR2_VOLLEY = DoubleSet.generate(
		make(SlotType.ST_GUN_S, 2),
		make(SlotType.ST_GUN_M, 2)
	);
	public static final HashMap<SlotType, Integer> S_BCR2_MISSILE = DoubleSet.generate(
		make(SlotType.ST_TORPEDO, 4)
	);
	public static final HashMap<SlotType, Integer> S_BCR2_BROADSIDE = DoubleSet.generate(
		make(SlotType.ST_GUN_M, 4)
	);

	public static final HashMap<SlotType, Integer> S_BCR3_BROADSIDE = DoubleSet.generate(
		make(SlotType.ST_GUN_M, 2)
	);
	public static final HashMap<SlotType, Integer> S_BCR3_ARTILLERY = DoubleSet.generate(
		make(SlotType.ST_GUN_L, 1)
	);

	public static final HashMap<SlotType, Integer> S_BCR3_SPITFIRE = DoubleSet.generate(
		make(SlotType.ST_GUN_S, 3)
	);
	public static final HashMap<SlotType, Integer> S_BCR3_POINT_DEFENSE = DoubleSet.generate(
		make(SlotType.ST_PD, 3)
	);

	//BATTLESHIP
	public static final HashMap<SlotType, Integer> S_BSP1_DELTA_A = DoubleSet.generate(
		make(SlotType.ST_PD, 2),
		make(SlotType.ST_TORPEDO, 3)
	);
	public static final HashMap<SlotType, Integer> S_BSP1_DELTA_B = DoubleSet.generate(
		make(SlotType.ST_GUN_L, 2)
	);
	public static final HashMap<SlotType, Integer> S_BSP1_DELTA_C = DoubleSet.generate(
		make(SlotType.ST_GUN_XL, 1)
	);
	public static final HashMap<SlotType, Integer> S_BSP1_DELTA_D = DoubleSet.generate(
		make(SlotType.ST_PD, 2),
		make(SlotType.ST_HANGAR, 1),
		make(SlotType.ST_TORPEDO, 1)
	);
	public static final HashMap<SlotType, Integer> S_BSP1_BROADSIDE = DoubleSet.generate(
		make(SlotType.ST_GUN_S, 2),
		make(SlotType.ST_GUN_M, 1),
		make(SlotType.ST_GUN_L, 1)
	);
	public static final HashMap<SlotType, Integer> S_BSP1_ARTILLERY1 = DoubleSet.generate(
		make(SlotType.ST_GUN_L, 2)
	);
	public static final HashMap<SlotType, Integer> S_BSP1_HANGAR = DoubleSet.generate(
		make(SlotType.ST_PD, 2),
		make(SlotType.ST_GUN_M, 1),
		make(SlotType.ST_HANGAR, 1)
	);
	public static final HashMap<SlotType, Integer> S_BSP1_COVERAGE = DoubleSet.generate(
		make(SlotType.ST_GUN_S, 3),
		make(SlotType.ST_GUN_L, 3)
	);
	public static final HashMap<SlotType, Integer> S_BSP1_ARTILLERY2 = DoubleSet.generate(
		make(SlotType.ST_GUN_L, 4)
	);
	public static final HashMap<SlotType, Integer> S_BSP1_CARRONADE = DoubleSet.generate(
		make(SlotType.ST_GUN_S, 4),
		make(SlotType.ST_GUN_L, 3)
	);
	public static final HashMap<SlotType, Integer> S_BSP1_VOLLEY = DoubleSet.generate(
		make(SlotType.ST_GUN_S, 6),
		make(SlotType.ST_GUN_M, 6)
	);
	public static final HashMap<SlotType, Integer> S_BSP1_SPITFIRE = DoubleSet.generate(
		make(SlotType.ST_PD, 1),
		make(SlotType.ST_GUN_S, 8),
		make(SlotType.ST_GUN_L, 2)
	);

	public static final HashMap<SlotType, Integer> S_BSP2_DELTA_A = DoubleSet.generate(
		make(SlotType.ST_GUN_M, 2),
		make(SlotType.ST_GUN_L, 2)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_DELTA_B = DoubleSet.generate(
		make(L, 3)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_DELTA_C = DoubleSet.generate(
		make(H, 1),
		make(G, 4)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_DELTA_D = DoubleSet.generate(
		make(P, 4),
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_DELTA_E = DoubleSet.generate(
		make(M, 2),
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_ARTILLERY1 = DoubleSet.generate(
		make(L, 3)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_HANGAR = DoubleSet.generate(
		make(M, 4),
		make(H, 1)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_CARRIER = DoubleSet.generate(
		make(P, 2),
		make(S, 2),
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_BROADSIDE1 = DoubleSet.generate(
		make(M, 2),
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_BOMBARDMENT = DoubleSet.generate(
		make(M, 3),
		make(L, 3)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_ARTILLERY2 = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_BROADSIDE2 = DoubleSet.generate(
		make(M, 6),
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_CARRONADE = DoubleSet.generate(
		make(S, 5),
		make(L, 3)
	);
	public static final HashMap<SlotType, Integer> S_BSP2_SPITFIRE = DoubleSet.generate(
		make(P, 1),
		make(S, 8),
		make(L, 2)
	);

	public static final HashMap<SlotType, Integer> S_BSP3_DELTA_A = DoubleSet.generate(
		make(L, 1)
	);
	public static final HashMap<SlotType, Integer> S_BSP3_DELTA_B = DoubleSet.generate(
		make(G, 2)
	);
	public static final HashMap<SlotType, Integer> S_BSP3_DELTA_C = DoubleSet.generate(
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_BSP3_DELTA_D = DoubleSet.generate(
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_BSP3_ARTILLERY1 = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_BSP3_BROADSIDE1 = DoubleSet.generate(
		make(M, 8)
	);
	public static final HashMap<SlotType, Integer> S_BSP3_VOLLEY1 = DoubleSet.generate(
		make(S, 6),
		make(M, 6)
	);
	public static final HashMap<SlotType, Integer> S_BSP3_BROADSIDE = DoubleSet.generate(
		make(M, 6)
	);
	public static final HashMap<SlotType, Integer> S_BSP3_VOLLEY2 = DoubleSet.generate(
		make(P, 2),
		make(S, 4),
		make(M, 4)
	);
	public static final HashMap<SlotType, Integer> S_BSP3_MISSILE = DoubleSet.generate(
		make(G, 4)
	);
	public static final HashMap<SlotType, Integer> S_BSP4_PINPOINT = DoubleSet.generate(
		make(P, 4),
		make(M, 6)
	);
	public static final HashMap<SlotType, Integer> S_BSP4_SPITFIRE = DoubleSet.generate(
		make(P, 1),
		make(S, 8)
	);
	public static final HashMap<SlotType, Integer> S_BSP4_ARTILLERY = DoubleSet.generate(
		make(L, 1)
	);
	public static final HashMap<SlotType, Integer> S_BSP4_BROADSIDE = DoubleSet.generate(
		make(M, 2)
	);

	//Carrier
	public static final HashMap<SlotType, Integer> S_CAR1_SALVO = DoubleSet.generate(
		make(P, 2),
		make(S, 2)
	);
	public static final HashMap<SlotType, Integer> S_CAR1_POINTDEFENSE = DoubleSet.generate(
		make(P, 4),
		make(G, 3)
	);
	public static final HashMap<SlotType, Integer> S_CAR1_BARRAGE = DoubleSet.generate(
		make(P, 2),
		make(G, 3)
	);
	public static final HashMap<SlotType, Integer> S_CAR1_CARRONADE = DoubleSet.generate(
		make(P, 2),
		make(S, 4),
		make(G, 2)
	);

	//DO THIS ONE TWICE
	public static final HashMap<SlotType, Integer> S_CAR2_MISSILE = DoubleSet.generate(
		make(H, 4),
		make(G, 2)
	);
	public static final HashMap<SlotType, Integer> S_CAR2_PINPOINT = DoubleSet.generate(
		make(P, 2),
		make(S, 2),
		make(H, 4)
	);
	public static final HashMap<SlotType, Integer> S_CAR2_POINTDEFENSE = DoubleSet.generate(
		make(P, 4),
		make(H, 4)
	);
	public static final HashMap<SlotType, Integer> S_CAR2_INVASION = DoubleSet.generate(
		make(P, 2),
		make(S, 2),
		make(L, 1)
	);

	public static final HashMap<SlotType, Integer> S_CAR2_MISSILE_HC = DoubleSet.generate(
			make(H, 6),
			make(G, 2)
	);
	public static final HashMap<SlotType, Integer> S_CAR2_PINPOINT_HC = DoubleSet.generate(
			make(P, 2),
			make(S, 2),
			make(H, 6)
	);
	public static final HashMap<SlotType, Integer> S_CAR2_POINTDEFENSE_HC = DoubleSet.generate(
			make(P, 4),
			make(H, 6)
	);
	public static final HashMap<SlotType, Integer> S_CAR2_MISSILE_SC = DoubleSet.generate(
			make(H, 8),
			make(G, 2)
	);
	public static final HashMap<SlotType, Integer> S_CAR2_PINPOINT_SC = DoubleSet.generate(
			make(P, 2),
			make(S, 2),
			make(H, 8)
	);
	public static final HashMap<SlotType, Integer> S_CAR2_POINTDEFENSE_SC = DoubleSet.generate(
			make(P, 4),
			make(H, 8)
	);

	public static final HashMap<SlotType, Integer> S_CAR3_SALVO = DoubleSet.generate(
		make(P, 2),
		make(S, 2)
	);
	public static final HashMap<SlotType, Integer> S_CAR3_POINT_DEFENSE = DoubleSet.generate(
		make(P, 4),
		make(G, 3)
	);
	public static final HashMap<SlotType, Integer> S_CAR3_BARRAGE = DoubleSet.generate(
		make(P, 2),
		make(G, 3)
	);
	public static final HashMap<SlotType, Integer> S_CAR3_CARRONADE = DoubleSet.generate(
		make(P, 2),
		make(S, 4),
		make(G, 2)
	);

	//Dreadnought
	public static final HashMap<SlotType, Integer> S_DRD1_COVERAGE = DoubleSet.generate(
		make(S, 4),
		make(M, 4),
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_DRD1_ARTILLERY = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_DRD1_CARRONADE = DoubleSet.generate(
		make(P, 6),
		make(S, 2),
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_DRD1_DEVASTATOR = DoubleSet.generate(
		make(X, 2)
	);

	public static final HashMap<SlotType, Integer> S_DRD2_BARRAGE = DoubleSet.generate(
		make(L, 2),
		make(G, 5)
	);
	public static final HashMap<SlotType, Integer> S_DRD2_ARTILLERY = DoubleSet.generate(
		make(L, 6)
	);
	public static final HashMap<SlotType, Integer> S_DRD2_BOMBARDMENT = DoubleSet.generate(
		make(M, 7),
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_DRD2_PINPOINT = DoubleSet.generate(
		make(P, 9),
		make(L, 2)
	);

	public static final HashMap<SlotType, Integer> S_DRD3_ARTILLERY = DoubleSet.generate(
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_DRD3_BROADSIDE = DoubleSet.generate(
		make(M, 6)
	);
	public static final HashMap<SlotType, Integer> S_DRD3_VOLLEY = DoubleSet.generate(
		make(P, 2),
		make(S, 4),
		make(M, 4)
	);
	public static final HashMap<SlotType, Integer> S_DRD3_MISSILE = DoubleSet.generate(
		make(G, 4)
	);

	//Titan
	public static final HashMap<SlotType, Integer> S_TAN1_DELTA_A = DoubleSet.generate(
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_TAN1_DELTA_B = DoubleSet.generate(
		make(X, 2)
	);
	public static final HashMap<SlotType, Integer> S_TAN1_DELTA_C = DoubleSet.generate(
		make(H, 2),
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_TAN1_NOVA = DoubleSet.generate(
		make(T, 2)
	);
	public static final HashMap<SlotType, Integer> S_TAN1_ANNIHILATOR = DoubleSet.generate(
		make(X, 3)
	);

	public static final HashMap<SlotType, Integer> S_TAN2_DELTA_A = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_TAN2_DELTA_B = DoubleSet.generate(
		make(G, 8)
	);
	public static final HashMap<SlotType, Integer> S_TAN2_DELTA_C = DoubleSet.generate(
		make(P, 4),
		make(H, 4)
	);
	public static final HashMap<SlotType, Integer> S_TAN2_DELTA_D = DoubleSet.generate(
		make(P, 2),
		make(X, 2)
	);
	public static final HashMap<SlotType, Integer> S_TAN2_MISSILE = DoubleSet.generate(
		make(G, 16)
	);
	public static final HashMap<SlotType, Integer> S_TAN2_BARRAGE = DoubleSet.generate(
		make(P, 2),
		make(L, 4),
		make(G, 10)
	);
	public static final HashMap<SlotType, Integer> S_TAN2_ARTILLERY = DoubleSet.generate(
		make(P, 4),
		make(L, 12)
	);
	public static final HashMap<SlotType, Integer> S_TAN2_TITAN = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_TAN3_DELTA_A = DoubleSet.generate(
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_TAN3_DELTA_B = DoubleSet.generate(
		make(G, 4)
	);
	public static final HashMap<SlotType, Integer> S_TAN3_DELTA_C = DoubleSet.generate(
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_TAN3_MISSILE = DoubleSet.generate(
		make(G, 16)
	);
	public static final HashMap<SlotType, Integer> S_TAN3_BARRAGE = DoubleSet.generate(
		make(P, 2),
		make(L, 4),
		make(G, 10)
	);
	public static final HashMap<SlotType, Integer> S_TAN3_ARTILLERY = DoubleSet.generate(
		make(P, 4),
		make(L, 10)
	);
	public static final HashMap<SlotType, Integer> S_TAN3_TITAN = DoubleSet.generate(
		make(L, 2)
	);
	//Flagship
	public static final HashMap<SlotType, Integer> S_FLG1_SIEGEBREAKER = DoubleSet.generate(
		make(H, 6),
		make(T, 4)
	);
	public static final HashMap<SlotType, Integer> S_FLG1_BASILISK = DoubleSet.generate(
		make(H, 6),
		make(X, 8),
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_FLG1_STORMBRINGER = DoubleSet.generate(
		make(H, 6),
		make(X, 12)
	);
	public static final HashMap<SlotType, Integer> S_FLG1_HAILFIRE = DoubleSet.generate(
		make(S, 4),
		make(H, 6),
		make(G, 6)
	);
	public static final HashMap<SlotType, Integer> S_FLG1_BROADSIDE = DoubleSet.generate(
		make(S, 2),
		make(M, 7),
		make(H, 6)
	);


	//(x3)
	public static final HashMap<SlotType, Integer> S_FLG2_ARTILLERY = DoubleSet.generate(
		make(L, 16)
	);
	public static final HashMap<SlotType, Integer> S_FLG2_BOMBARDMENT = DoubleSet.generate(
		make(M, 8),
		make(L, 8)
	);
	public static final HashMap<SlotType, Integer> S_FLG2_CARRONADE = DoubleSet.generate(
		make(P, 4),
		make(S, 6),
		make(L, 6)
	);
	public static final HashMap<SlotType, Integer> S_FLG2_BARRAGE = DoubleSet.generate(
		make(L, 8),
		make(G, 8)
	);
	public static final HashMap<SlotType, Integer> S_FLG2_MISSILE = DoubleSet.generate(
		make(G, 16)
	);
	public static final HashMap<SlotType, Integer> S_FLG2_BROADSIDE = DoubleSet.generate(
		make(M, 16)
	);
	public static final HashMap<SlotType, Integer> S_FLG2_SALVO = DoubleSet.generate(
		make(M, 8),
		make(G, 8)
	);
	public static final HashMap<SlotType, Integer> S_FLG2_CARRIER = DoubleSet.generate(
		make(P, 4),
		make(H, 12)
	);


	public static final HashMap<SlotType, Integer> S_FLG3_ARTILLERY = DoubleSet.generate(
		make(L, 16)
	);
	public static final HashMap<SlotType, Integer> S_FLG3_BROADSIDE = DoubleSet.generate(
		make(M, 16)
	);
	public static final HashMap<SlotType, Integer> S_FLG3_MISSILE = DoubleSet.generate(
		make(G, 16)
	);
	public static final HashMap<SlotType, Integer> S_FLG3_TORRENT = DoubleSet.generate(
		make(P, 8),
		make(M, 8)
	);
	public static final HashMap<SlotType, Integer> S_FLG3_SALVO = DoubleSet.generate(
		make(P, 8),
		make(M, 8)
	);
	public static final HashMap<SlotType, Integer> S_FLG3_PD = DoubleSet.generate(
		make(P, 10),
		make(H, 6)
	);

	//Small Defense Platform (x2)
	public static final HashMap<SlotType, Integer> S_SDP_LIGHT = DoubleSet.generate(
		make(S, 4)
	);
	public static final HashMap<SlotType, Integer> S_SDP_PD = DoubleSet.generate(
		make(P, 4)
	);
	public static final HashMap<SlotType, Integer> S_SDP_LIGHT_PD = DoubleSet.generate(
		make(P, 2),
		make(S, 2)
	);
	public static final HashMap<SlotType, Integer> S_SDP_MEDIUM = DoubleSet.generate(
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_SDP_MISSILE = DoubleSet.generate(
		make(G, 2)
	);
	public static final HashMap<SlotType, Integer> S_SDP_HEAVY = DoubleSet.generate(
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_SDP_HANGAR = DoubleSet.generate(
		make(H, 1)
	);

	//Medium Defense (x4)

	//Large Defense Platform (x4)
	public static final HashMap<SlotType, Integer> S_LDP_LIGHT = DoubleSet.generate(
		make(S, 4),
		make(P, 4)
	);
	public static final HashMap<SlotType, Integer> S_LDP_MEDIUM = DoubleSet.generate(
		make(M, 4)
	);
	public static final HashMap<SlotType, Integer> S_LDP_HEAVY = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_LDP_MISSILE = DoubleSet.generate(
		make(G, 4)
	);
	public static final HashMap<SlotType, Integer> S_LDP_HANGAR = DoubleSet.generate(
		make(H, 4)
	);

	public static final HashMap<SlotType, Integer> S_ION_CANNON = DoubleSet.generate(
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_ANNIHALATOR_CANNON = DoubleSet.generate(
		make(X, 2)
	);
	public static final HashMap<SlotType, Integer> S_COLOSSUS = DoubleSet.generate(
		make(W, 1)
	);

	//Precursor Escort
	public static final HashMap<SlotType, Integer> S_PCRES1_ESCORT = DoubleSet.generate(
		make(L, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCRES1_MISSILE = DoubleSet.generate(
		make(G, 3)
	);
	public static final HashMap<SlotType, Integer> S_PCRES1_ALPHA_ESCORT = DoubleSet.generate(
		make(M, 2),
		make(L, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCRES1_ALPHA_MISSILE = DoubleSet.generate(
		make(G, 5)
	);
	public static final HashMap<SlotType, Integer> S_PCRES1_SIGMA_ESCORT = DoubleSet.generate(
		make(M, 2),
		make(L, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCRES1_SIGMA_MISSILE = DoubleSet.generate(
		make(G, 5)
	);
	public static final HashMap<SlotType, Integer> S_PCRES1_OMEGA_ESCORT = DoubleSet.generate(
		make(M, 2),
		make(L, 1),
		make(G, 2)
	);

	public static final HashMap<SlotType, Integer> S_PCRES2_INTERCEPTOR = DoubleSet.generate(
		make(S, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCRES2_GUNSHIP = DoubleSet.generate(
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCRES2_GUIDANCE = DoubleSet.generate(
		make(G, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCRES2_INTERCEPTOR_ALPHA = DoubleSet.generate(
			make(S, 2),
			make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCRES2_GUIDANCE_ALPHA = DoubleSet.generate(
			make(G, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCRES2_INTERCEPTOR_OMEGA = DoubleSet.generate(
			make(S, 2),
			make(M, 4)
	);
	//(All of the Above + )
	public static final HashMap<SlotType, Integer> S_PCRES3_CUSTODIAN_MATRIX = DoubleSet.generate(
		make(P, 2),
		make(S, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCRES3_ALPHA_CUSTODIAN_MATRIX = DoubleSet.generate(
		make(P, 4),
		make(S, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCRES3_OMEGA_CUSTODIAN_MATRIX = DoubleSet.generate(
		make(P, 2),
		make(S, 2),
		make(M, 2)
	);

	//Precursor Battlecruiser
	public static final HashMap<SlotType, Integer> S_PCRBC1_BASE = DoubleSet.generate(
		make(L, 2),
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC1_MISSILE = DoubleSet.generate(
		make(G, 4),
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC1_CARRIER = DoubleSet.generate(
		make(H, 2),
		make(X, 1)
	);

	public static final HashMap<SlotType, Integer> S_PCRBC1_ALPHA_BASE = DoubleSet.generate(
		make(L, 4),
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC1_ALPHA_MISSILE = DoubleSet.generate(
		make(G, 8),
		make(X, 1)
	);

	public static final HashMap<SlotType, Integer> S_PCRBC1_ALPHA_CARRIER = DoubleSet.generate(
		make(H, 4),
		make(X, 1)
	);

	public static final HashMap<SlotType, Integer> S_PCRBC1_OMEGA_BASE = DoubleSet.generate(
		make(X, 3)
	);

	public static final HashMap<SlotType, Integer> S_PCRBC2_CRUISER_MATRIX = DoubleSet.generate(
		make(M, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC2_GUIDANCE_MATRIX = DoubleSet.generate(
		make(G, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC2_ARTILLERY_MATRIX = DoubleSet.generate(
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC2_CARRIER = DoubleSet.generate(
		make(P, 4),
		make(H, 3)
	);

	public static final HashMap<SlotType, Integer> S_PCRBC2_ALPHA_GUIDANCE_MATRIX = DoubleSet.generate(
		make(G, 6)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC2_ALPHA_ARTILLERY_MATRIX = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC2_ALPHA_CARRIER_MATRIX = DoubleSet.generate(
		make(P, 4),
		make(H, 5)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC2_OMEGA_ARTILLERY_MATRIX = DoubleSet.generate(
		make(L, 6)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC2_OMEGA_GUIDANCE_MATRIX = DoubleSet.generate(
		make(L, 2),
		make(G, 8)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC2_OMEGA_CARRIER_MATRIX = DoubleSet.generate(
		make(H, 8)
	);


	public static final HashMap<SlotType, Integer> S_PCRBC3_HANGAR_MATRIX = DoubleSet.generate(
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC3_FIRE_SUPPORT_MATRIX = DoubleSet.generate(
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC3_MISSILE_MATRIX = DoubleSet.generate(
		make(G, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC3_ALPHA_HANGAR_MATRIX = DoubleSet.generate(
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC3_ALPHA_FIRE_SUPPORT_MATRIX = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC3_ALPHA_MISSILE_MATRIX = DoubleSet.generate(
		make(G, 7)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC3_OMEGA_FIRE_SUPPORT_MATRIX = DoubleSet.generate(
		make(L, 6)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC3_OMEGA_HANGAR_MATRIX = DoubleSet.generate(
		make(H, 7)
	);
	public static final HashMap<SlotType, Integer> S_PCRBC3_OMEGA_MISSILE_MATRIX = DoubleSet.generate(
		make(L, 2),
		make(G, 9)
	);

	public static final HashMap<SlotType, Integer> S_PCHYP1_CORE = DoubleSet.generate(
		make(L, 2),
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP1_MISSILE = DoubleSet.generate(
		make(G, 4),
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP1_CARRIER = DoubleSet.generate(
		make(H, 3),
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP1_ALPHA_CORE = DoubleSet.generate(
		make(X, 2),
		make(T, 1)
	);






}
