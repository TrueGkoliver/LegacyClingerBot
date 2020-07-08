package game.common.ships.sizes.sections;

import java.util.HashMap;

import game.common.ships.weapons.SlotType;

public class Sections {
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
	
	//Escort Carrier: Mids
	
	//Escort Carrier: End
	
	
	
	
}
