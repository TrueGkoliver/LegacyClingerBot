package game.common.ships.sizes.sections;

import java.util.HashMap;

import game.common.ships.weapons.SlotType;
import util.DoubleSet;
import static util.DoubleSet.make;
@SuppressWarnings("unused")
public class Sections {
	private static final SlotType L = SlotType.ST_GUN_L;
	private static final SlotType M = SlotType.ST_GUN_M;
	private static final SlotType S = SlotType.ST_GUN_S;
	private static final SlotType G = SlotType.ST_TORPEDO;
	private static final SlotType H = SlotType.ST_HANGAR;
	private static final SlotType P = SlotType.ST_PD;
	private static final SlotType X = SlotType.ST_GUN_XL;
	private static final SlotType T = SlotType.ST_TITAN;
	private static final SlotType W = SlotType.ST_COLOSSUS;
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
	public static final ShipSection[] CORVETTES = new ShipSection[]{
			CORVETTE_DELTA_A,
			CORVETTE_DELTA_B,
			CORVETTE_DELTA_C,
			CORVETTE_MISSILE,
			CORVETTE_MISSILE_2,
			CORVETTE_PICKET_SHIP,
			CORVETTE_SHIFTER_CORE,
			CORVETTE_HANGAR_BOAT,
			CORVETTE_ASSAULT
	};

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

	public static final ShipSection D1_DELTA_DESTROYER_A = new ShipSection("Delta Destroyer Bow A", S_D1_DELTA_DESTROYER_A);
	public static final ShipSection D1_DELTA_DESTROYER_B = new ShipSection("Delta Destroyer Bow B", S_D1_DELTA_DESTROYER_B);
	public static final ShipSection D1_DELTA_DESTROYER_C = new ShipSection("Delta Destroyer Bow C", S_D1_DELTA_DESTROYER_C);
	public static final ShipSection D1_DELTA_DESTROYER_D = new ShipSection("Delta Destroyer Bow D", S_D1_DELTA_DESTROYER_D);
	public static final ShipSection D1_ARTILLERY = new ShipSection("Artillery Bow", S_D1_ARTILLERY);
	public static final ShipSection D1_GUNSHIP = new ShipSection("Gunship Bow", S_D1_GUNSHIP);
	public static final ShipSection D1_PICKET = new ShipSection("Picket Bow", S_D1_PICKET);
	public static final ShipSection D1_PD_DESTROYER = new ShipSection("PD Destroyer Bow", S_D1_PD_DESTROYER);
	public static final ShipSection D1_MISSILE = new ShipSection("Missile Bow", S_D1_MISSILE);
	public static final ShipSection[] DESTROYER_BOTTOM_SECTIONS = new ShipSection[]{
			D1_DELTA_DESTROYER_A,
			D1_DELTA_DESTROYER_B,
			D1_DELTA_DESTROYER_C,
			D1_DELTA_DESTROYER_D,
			D1_ARTILLERY,
			D1_GUNSHIP,
			D1_PICKET,
			D1_PICKET,
			D1_MISSILE
	};




	//Destroyer: Top Section
	public static final HashMap<SlotType, Integer> S_D2_DELTA_DESTROYER_A = generateSection(join(SlotType.ST_PD, 2));
	public static final HashMap<SlotType, Integer> S_D2_DELTA_DESTROYER_B = generateSection(join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_D2_DELTA_DESTROYER_C = generateSection(join(SlotType.ST_GUN_M, 1));
	public static final HashMap<SlotType, Integer> S_D2_DELTA_DESTROYER_D = generateSection(join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_D2_INTERCEPTOR = generateSection(join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_D2_GUNSHIP = generateSection(join(SlotType.ST_GUN_M, 1));
	public static final HashMap<SlotType, Integer> S_D2_PICKET = generateSection(join(SlotType.ST_PD, 2));
	public static final HashMap<SlotType, Integer> S_D2_PD_DESTROYER = generateSection(join(SlotType.ST_PD, 4));

	public static final ShipSection D2_DELTA_DESTROYER_A = new ShipSection("Delta Destroyer A Stern", S_D2_DELTA_DESTROYER_A);
	public static final ShipSection D2_DELTA_DESTROYER_B = new ShipSection("Delta Destroyer B Stern", S_D2_DELTA_DESTROYER_B);
	public static final ShipSection D2_DELTA_DESTROYER_C = new ShipSection("Delta Destroyer C Stern", S_D2_DELTA_DESTROYER_C);
	public static final ShipSection D2_DELTA_DESTROYER_D = new ShipSection("Delta Destroyer D Stern", S_D2_DELTA_DESTROYER_D);
	public static final ShipSection D2_INTERCEPTOR = new ShipSection("Interceptor Stern", S_D2_INTERCEPTOR);
	public static final ShipSection D2_GUNSHIP = new ShipSection("Gunship Stern", S_D2_GUNSHIP);
	public static final ShipSection D2_PICKET = new ShipSection("Picket Stern", S_D2_PICKET);
	public static final ShipSection D2_PD_DESTROYER = new ShipSection("PD Stern", S_D2_PD_DESTROYER);
	public static final ShipSection[] DESTROYER_TOP_SECTIONS = new ShipSection[] {
			D2_DELTA_DESTROYER_A,
			D2_DELTA_DESTROYER_B,
			D2_DELTA_DESTROYER_C,
			D2_DELTA_DESTROYER_D,
			D2_INTERCEPTOR,
			D2_GUNSHIP,
			D2_PICKET,
			D2_PD_DESTROYER
	};



	//Cruiser: Bottom
	public static final HashMap<SlotType, Integer> S_CR1_DELTA_CRUISER_A = generateSection(join(SlotType.ST_TORPEDO, 2));
	public static final HashMap<SlotType, Integer> S_CR1_DELTA_CRUISER_B = generateSection(join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_CR1_DELTA_CRUISER_C = generateSection(join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_CR1_DELTA_CRUISER_D = generateSection(join(SlotType.ST_PD, 2), join(SlotType.ST_GUN_M, 1));
	
	public static final HashMap<SlotType, Integer> S_CR1_ARTILLERY = generateSection(join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_CR1_MISSILE = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_CR1_PINPOINT = generateSection(join(SlotType.ST_PD, 2), join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_CR1_BROADSIDE = generateSection(join(SlotType.ST_GUN_M, 2));

	public static final ShipSection CR1_DELTA_CRUISER_A = new ShipSection("Delta Cruiser A Bow", S_CR1_DELTA_CRUISER_A);
	public static final ShipSection CR1_DELTA_CRUISER_B = new ShipSection("Delta Cruiser B Bow", S_CR1_DELTA_CRUISER_B);
	public static final ShipSection CR1_DELTA_CRUISER_C = new ShipSection("Delta Cruiser C Bow", S_CR1_DELTA_CRUISER_C);
	public static final ShipSection CR1_DELTA_CRUISER_D = new ShipSection("Delta Cruiser D Bow", S_CR1_DELTA_CRUISER_D);
	public static final ShipSection CR1_ARTILLERY = new ShipSection("Artillery Bow", S_CR1_ARTILLERY);
	public static final ShipSection CR1_MISSILE = new ShipSection("Missile Bow", S_CR1_MISSILE);
	public static final ShipSection CR1_PINPOINT = new ShipSection("Pinpoint Bow", S_CR1_PINPOINT);
	public static final ShipSection CR1_BROADSIDE = new ShipSection("Broadside Bow", S_CR1_BROADSIDE);
	
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

	public static final ShipSection CR2_DELTA_CRUISER_A_CORE = new ShipSection("Delta Cruiser A Core", S_CR2_DELTA_CRUISER_A);
	public static final ShipSection CR2_DELTA_CRUISER_B_CORE = new ShipSection("Delta Cruiser B Core", S_CR2_DELTA_CRUISER_B);
	public static final ShipSection CR2_DELTA_CRUISER_C_CORE = new ShipSection("Delta Cruiser C Core", S_CR2_DELTA_CRUISER_C);
	public static final ShipSection CR2_DELTA_CRUISER_D_CORE = new ShipSection("Delta Cruiser D Core", S_CR2_DELTA_CRUISER_D);
	public static final ShipSection CR2_HANGAR_CORE = new ShipSection("Hangar Core", S_CR2_HANGAR_CORE);
	public static final ShipSection CR2_ARTILLERY_CORE = new ShipSection("Artillery Core", S_CR2_ARTILLERY_CORE);
	public static final ShipSection CR2_BROADSIDE_CORE = new ShipSection("Broadside Core", S_CR2_BROADSIDE_CORE);
	public static final ShipSection CR2_MISSILE_CORE = new ShipSection("Missile Core", S_CR2_MISSILE_CORE);
	public static final ShipSection CR2_PINPOINT_CORE = new ShipSection("Pinpoint Core", S_CR2_PINPOINT_CORE);


	//Cruiser: Top
	public static final HashMap<SlotType, Integer> S_CR3_DELTA_CRUISER_A = generateSection(join(SlotType.ST_GUN_M, 1));
	public static final HashMap<SlotType, Integer> S_CR3_DELTA_CRUISER_B = generateSection(join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_CR3_DELTA_CRUISER_C = generateSection(join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_CR3_DELTA_CRUISER_D = generateSection(join(SlotType.ST_GUN_M, 1));
	
	public static final HashMap<SlotType, Integer> S_CR3_GUNSHIP = generateSection(join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_CR3_PINPOINT = generateSection(join(SlotType.ST_PD, 2));

	public static final ShipSection CR3_DELTA_CRUISER_A = new ShipSection("Delta Cruiser Stern", S_CR3_DELTA_CRUISER_A);
	public static final ShipSection CR3_DELTA_CRUISER_B = new ShipSection("Delta Cruiser Stern", S_CR3_DELTA_CRUISER_B);
	public static final ShipSection CR3_DELTA_CRUISER_C = new ShipSection("Delta Cruiser Stern", S_CR3_DELTA_CRUISER_C);
	public static final ShipSection CR3_DELTA_CRUISER_D = new ShipSection("Delta Cruiser Stern", S_CR3_DELTA_CRUISER_D);
	public static final ShipSection CR3_GUNSHIP = new ShipSection("Gunship Stern", S_CR3_GUNSHIP);
	public static final ShipSection CR3_PINPOINT = new ShipSection("Pinpoint Stern", S_CR3_PINPOINT);

	//Stike Cruiser: Front
	public static final HashMap<SlotType, Integer> S_SCR1_VOLLEY = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_SCR1_PINPOINT = generateSection(join(SlotType.ST_PD, 2), join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_SCR1_FULLISADE = generateSection(join(SlotType.ST_TORPEDO,1), join(SlotType.ST_GUN_S, 4));
	public static final HashMap<SlotType, Integer> S_SCR1_MISSILE = generateSection(join(SlotType.ST_TORPEDO, 2));
	public static final HashMap<SlotType, Integer> S_SCR1_ARTILLERY = generateSection(join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_SCR1_BROADSIDE = generateSection(join(SlotType.ST_GUN_M, 3));

	public static final ShipSection SCR1_VOLLEY = new ShipSection("Volley Bow", S_SCR1_VOLLEY);
	public static final ShipSection SCR1_PINPOINT = new ShipSection("Pinpoint Bow", S_SCR1_PINPOINT);
	public static final ShipSection SCR1_FULLISADE = new ShipSection("Fullisade Bow", S_SCR1_FULLISADE);
	public static final ShipSection SCR1_MISSILE = new ShipSection("Missile Bow", S_SCR1_MISSILE);
	public static final ShipSection SCR1_ARTILLERY = new ShipSection("Artillery Bow", S_SCR1_ARTILLERY);
	public static final ShipSection SCR1_BROADSIDE = new ShipSection("Broadside Bow", S_SCR1_BROADSIDE);

	//Strike Cruiser: Mid: Note: DOUBLE on this one, 4 sections total
	public static final HashMap<SlotType, Integer> S_SCR2_VOLLEY = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_SCR2_SPITFIRE = generateSection(join(SlotType.ST_GUN_S, 6));
	public static final HashMap<SlotType, Integer> S_SCR2_BROADSIDE = generateSection(join(SlotType.ST_GUN_M, 3));

	public static final ShipSection SCR2_VOLLEY = new ShipSection("Volley Core", S_SCR2_VOLLEY);
	public static final ShipSection SCR2_SPITFIRE = new ShipSection("Spitfire Core", S_SCR2_SPITFIRE);
	public static final ShipSection SCR2_BROADSIDE = new ShipSection("Broadside Core", S_SCR2_BROADSIDE);

	//Strike Cruiser: Back
	public static final HashMap<SlotType, Integer> S_SCR3_BROADSIDE = generateSection(join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_SCR3_PINPOINT = generateSection(join(SlotType.ST_PD, 2), join(SlotType.ST_GUN_S, 2));
	public static final HashMap<SlotType, Integer> S_SCR3_SPITFIRE = generateSection(join(SlotType.ST_GUN_S, 4));
	
	public static final ShipSection SCR3_BROADSIDE = new ShipSection("Broadside Stern", S_SCR3_BROADSIDE);
	public static final ShipSection SCR3_PINPOINT = new ShipSection("Pinpoint Stern", S_SCR3_PINPOINT);
	public static final ShipSection SCR3_SPITFIRE = new ShipSection("Spitfire Stern", S_SCR3_SPITFIRE);

	//Exploration Cruiser: Front
	public static final HashMap<SlotType, Integer> S_ECR1_ARTILLERY_L1 = generateSection(join(SlotType.ST_GUN_L, 1));
	public static final HashMap<SlotType, Integer> S_ECR1_FUSILLADE_L1 = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_TORPEDO, 1));
	public static final HashMap<SlotType, Integer> S_ECR1_BROADSIDE_L1 = generateSection(join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_ECR1_ARTILLERY_L2 = generateSection(join(SlotType.ST_GUN_L, 2));
	public static final HashMap<SlotType, Integer> S_ECR1_FULLISADE_L2 = generateSection(join(SlotType.ST_GUN_S, 2), join(SlotType.ST_TORPEDO, 2));
	public static final HashMap<SlotType, Integer> S_ECR1_BROADSIDE_L2 = generateSection(join(SlotType.ST_GUN_M, 2));
	public static final HashMap<SlotType, Integer> S_ECR1_ARTILLERY_L3 = generateSection(join(SlotType.ST_GUN_L, 4));
	public static final HashMap<SlotType, Integer> S_ECR1_FULLISADE_L3 = generateSection(join(SlotType.ST_GUN_S, 4), join(SlotType.ST_TORPEDO, 4));
	public static final HashMap<SlotType, Integer> S_ECR1_BROADSIDE_L3 = generateSection(join(SlotType.ST_GUN_M, 6));

	public static final ShipSection ECR1_ARTILLERY_L1 = new ShipSection("Artillery Bow Level 1", S_ECR1_ARTILLERY_L1);
	public static final ShipSection ECR1_FUSILLIADE_L1 = new ShipSection("Fusillade Bow Level 1", S_ECR1_FUSILLADE_L1);
	public static final ShipSection ECR1_BROADSIDE_L1 = new ShipSection("Bow Level 1", S_ECR1_BROADSIDE_L1);
	public static final ShipSection ECR1_ARTILLERY_L2 = new ShipSection("Artillery Bow Level 2", S_ECR1_ARTILLERY_L2);
	public static final ShipSection ECR1_FUSILLIADE_L2 = new ShipSection("Fusillade Bow Level 2", S_ECR1_FULLISADE_L2);
	public static final ShipSection ECR1_BROADSIDE_L2 = new ShipSection("Bow Level 2", S_ECR1_BROADSIDE_L2);
	public static final ShipSection ECR1_ARTILLERY_L3 = new ShipSection("Artillery Bow Level 3", S_ECR1_ARTILLERY_L3);
	public static final ShipSection ECR1_FUSILLIADE_L3 = new ShipSection("Fusillade Bow Level 3", S_ECR1_FULLISADE_L3);
	public static final ShipSection ECR1_BROADSIDE_L3 = new ShipSection("Bow Level 3", S_ECR1_BROADSIDE_L3);


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

	public static final ShipSection ECR2_BARRAGE_L1 = new ShipSection("Barrage Core Level 1", S_ECR2_BARRAGE_L1);
	public static final ShipSection ECR2_ARTILLERY_L1 = new ShipSection("Artillery Core Level 1", S_ECR2_ARTILLERY_L1);
	public static final ShipSection ECR2_VOLLEY_L1 = new ShipSection("Volley Core Level 1", S_ECR2_VOLLEY_L1);
	public static final ShipSection ECR2_MISSILE_L1 = new ShipSection("Missile Core Level 1", S_ECR2_MISSILE_L1);
	public static final ShipSection ECR2_BROADSIDE_L1 = new ShipSection("Broadside Core Level 1", S_ECR2_BROADSIDE_L1);

	public static final ShipSection ECR2_BARRAGE_L2 = new ShipSection("Barrage Core Level 2", S_ECR2_BARRAGE_L2);
	public static final ShipSection ECR2_ARTILLERY_L2 = new ShipSection("Artillery Core Level 2", S_ECR2_ARTILLERY_L2);
	public static final ShipSection ECR2_VOLLEY_L2 = new ShipSection("Volley Core Level 2", S_ECR2_VOLLEY_L2);
	public static final ShipSection ECR2_MISSILE_L2 = new ShipSection("Missile Core Level 2", S_ECR2_MISSILE_L2);
	public static final ShipSection ECR2_BROADSIDE_L2 = new ShipSection("Broadside Core Level 2", S_ECR2_BROADSIDE_L2);

	public static final ShipSection ECR2_BARRAGE_L3 = new ShipSection("Barrage Core Level 3", S_ECR2_BARRAGE_L3);
	public static final ShipSection ECR2_ARTILLERY_L3 = new ShipSection("Artillery Core Level 3", S_ECR2_ARTILLERY_L3);
	public static final ShipSection ECR2_VOLLEY_L3 = new ShipSection("Volley Core Level 3", S_ECR2_VOLLEY_L3);
	public static final ShipSection ECR2_MISSILE_L3 = new ShipSection("Missile Core Level 3", S_ECR2_MISSILE_L3);
	public static final ShipSection ECR2_BROADSIDE_L3 = new ShipSection("Broadside Core Level 3", S_ECR2_BROADSIDE_L3);

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

	public static final ShipSection ECR3_BROADSIDE_L1 = new ShipSection("Broadside Stern Level 1", S_ECR3_BROADSIDE_L1);
	public static final ShipSection ECR3_ARTILLERY_L1 = new ShipSection("Artillery Stern Level 1", S_ECR3_ARTILLERY_L1);
	public static final ShipSection ECR3_SPITFIRE_L1 = new ShipSection("Spitfire Stern Level 1", S_ECR3_SPITFIRE_L1);
	public static final ShipSection ECR3_PD_L1 = new ShipSection("Point Defense Stern Level 1", S_ECR3_PD_L1);

	public static final ShipSection ECR3_BROADSIDE_L2 = new ShipSection("Broadside Stern Level 2", S_ECR3_BROADSIDE_L2);
	public static final ShipSection ECR3_ARTILLERY_L2 = new ShipSection("Artillery Stern Level 2", S_ECR3_ARTILLERY_L2);
	public static final ShipSection ECR3_SPITFIRE_L2 = new ShipSection("Spitfire Stern Level 2", S_ECR3_SPITFIRE_L2);
	public static final ShipSection ECR3_PD_L2 = new ShipSection("Point Defense Stern Level 2", S_ECR3_PD_L2);

	public static final ShipSection ECR3_BROADSIDE_L3 = new ShipSection("Broadside Stern Level 3", S_ECR3_BROADSIDE_L3);
	public static final ShipSection ECR3_ARTILLERY_L3 = new ShipSection("Artillery Stern Level 3", S_ECR3_ARTILLERY_L3);
	public static final ShipSection ECR3_SPITIFRE_L3 = new ShipSection("Spitfire Stern Level 3", S_ECR3_SPITFIRE_L3);
	public static final ShipSection ECR3_PD_L3 = new ShipSection("Point Defense Stern Level 3", S_ECR3_PD_L3);

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
	//Here begins Precursor Stuff, from Ancient Cache of Technologies.
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
	public static final HashMap<SlotType, Integer> S_PCHYP1_ALPHA_MISSILE = DoubleSet.generate(
		make(L, 2),
		make(G, 4),
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP1_ALPHA_CARRIER = DoubleSet.generate(
		make(H, 7),
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP1_OMEGA_CORE = DoubleSet.generate(
		make(X, 4),
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP1_OMEGA_MISSILE = DoubleSet.generate(
		make(L, 2),
		make(G, 4),
		make(X, 2),
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP1_OMEGA_CARRIER = DoubleSet.generate(
		make(H, 7),
		make(X, 2),
		make(T, 1)
	);

	//(x2)
	public static final HashMap<SlotType, Integer> S_PCHYP2_WING_ARTILLERY = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP2_WING_MISSILE = DoubleSet.generate(
		make(G, 8)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP2_WING_HANGAR = DoubleSet.generate(
		make(P, 2),
		make(H, 6)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP2_ALPHA_WING_HANGAR = DoubleSet.generate(
		make(P, 2),
		make(H, 8)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP2_ALPHA_WING_ARTILLERY = DoubleSet.generate(
		make(L, 6)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP2_ALPHA_WING_MISSILE = DoubleSet.generate(
		make(L, 6)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP2_OMEGA_WING_ARTILLERY = DoubleSet.generate(
		make(L, 8)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP2_OMEGA_WING_MISSILE = DoubleSet.generate(
		make(L, 4),
		make(G, 8)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP2_OMEGA_WING_HANGAR = DoubleSet.generate(
		make(P, 2),
		make(H, 10)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP3_HANGAR_MATRIX = DoubleSet.generate(
		make(H, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP3_FIRE_SUPPORT_MATRIX = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP3_GUIDANCE = DoubleSet.generate(
		make(G, 8)
	);

	public static final HashMap<SlotType, Integer> S_PCHYP3_ALPHA_HANGAR_MATRIX = DoubleSet.generate(
		make(H, 6)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP3_ALPHA_FIRE_SUPPORT_MATRIX = DoubleSet.generate(
		make(L, 6)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP3_ALPHA_GUIDANCE_MATRIX = DoubleSet.generate(
		make(H, 2),
		make(G, 8)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP3_OMEGA_HANGAR_MATRIX = DoubleSet.generate(
		make(H, 8)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP3_OMEGA_FIRE_SUPPORT_MATRIX = DoubleSet.generate(
		make(L, 8)
	);
	public static final HashMap<SlotType, Integer> S_PCHYP3_OMEGA_GUIDANCE_MATRIX = DoubleSet.generate(
		make(H, 4),
		make(G, 8)
	);

	//Precursor Assault Carrier
	public static final HashMap<SlotType, Integer> S_PAC1_SPINAL = DoubleSet.generate(
		make(P, 2),
		make(L, 4),
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_PAC1_FORWARD_ARTILLERY = DoubleSet.generate(
		make(P, 2),
		make(L, 6)
	);
	public static final HashMap<SlotType, Integer> S_PAC1_ALPHA_SPINAL = DoubleSet.generate(
		make(P, 2),
		make(H, 6),
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_PAC1_ALPHA_FORWARD_ARTILLERY = DoubleSet.generate(
		make(P, 2),
		make(H, 8)
	);
	public static final HashMap<SlotType, Integer> S_PAC1_OMEGA_SPINAL = DoubleSet.generate(
		make(P, 2),
		make(L, 4),
		make(X, 2),
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_PAC1_OMEGA_FORWARD_ARTILLERY = DoubleSet.generate(
		make(H, 10)
	);

	//(x3)
	public static final HashMap<SlotType, Integer> S_PAC2_HANGAR = DoubleSet.generate(
		make(P, 2),
		make(H, 6)
	);
	public static final HashMap<SlotType, Integer> S_PAC2_ALPHA_HANGAR = DoubleSet.generate(
		make(P, 2),
		make(H, 8)
	);
	public static final HashMap<SlotType, Integer> S_PAC2_OMEGA_HANGAR = DoubleSet.generate(
		make(P, 2),
		make(H, 10)
	);

	//Precursor Gatekeeper Warden
	public static final HashMap<SlotType, Integer> S_PCRGKW1_SPINAL = DoubleSet.generate(
		make(X, 2),
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCRGKW1_ALPHA_SPINAL = DoubleSet.generate(
		make(X, 4),
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCRGKW1_SIGMA_SPINAL = DoubleSet.generate(
		make(X, 2),
		make(T, 3)
	);
	public static final HashMap<SlotType, Integer> S_PCRGKW1_OMEGA_SPINAL = DoubleSet.generate(
		make(X, 4),
		make(T, 3)
	);

	public static final HashMap<SlotType, Integer> S_PCRGKW2_FOCAL_POINT = DoubleSet.generate(
		make(L, 8)
	);
	public static final HashMap<SlotType, Integer> S_PCRGKW2_ALPHA_FOCAL_POINT = DoubleSet.generate(
		make(L, 12)
	);
	public static final HashMap<SlotType, Integer> S_PCRGKW2_OMEGA_FOCAL_POINT = DoubleSet.generate(
		make(L, 8),
		make(X, 4)
	);

	public static final HashMap<SlotType, Integer> S_PCRGKW3_OUTER_CORE = DoubleSet.generate(
		make(G, 8)
	);
	public static final HashMap<SlotType, Integer> S_PCRGKW3_ALPHA_OUTER_CORE = DoubleSet.generate(
		make(L, 4),
		make(G, 8)
	);
	public static final HashMap<SlotType, Integer> S_PCRGKW3_OMEGA_OUTER_CORE = DoubleSet.generate(
		make(L, 4),
		make(G, 8),
		make(X, 2)
	);

	public static final HashMap<SlotType, Integer> S_PCRGKW4_INNER_CORE = DoubleSet.generate(
		make(P, 4),
		make(H, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCRGKW4_ALPHA_INNER_CORE = DoubleSet.generate(
		make(P, 4),
		make(H, 6)
	);
	public static final HashMap<SlotType, Integer> S_PCRGKW4_OMEGA_INNER_CORE = DoubleSet.generate(
		make(P, 4),
		make(H, 10)
	);

	//Precursor Guardian
	public static final HashMap<SlotType, Integer> S_PCGA1_ARTILLERY = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCGA1_MISSILE = DoubleSet.generate(
		make(L, 2),
		make(G, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCGA1_ALPHA_ARTILLERY = DoubleSet.generate(
		make(L, 4),
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCGA1_ALPHA_MISSILE = DoubleSet.generate(
		make(L, 2),
		make(G, 4),
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCGA1_OMEGA_MISSILE = DoubleSet.generate(
		make(L, 6),
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCGA1_OMEGA_ARTILLERY = DoubleSet.generate(
		make(L, 2),
		make(G, 8),
		make(X, 1)
	);


	public static final HashMap<SlotType, Integer> S_PCGA2_GUNCANNON = DoubleSet.generate(
		make(M, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCGA2_MISSILE = DoubleSet.generate(
		make(G, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCGA2_ALPHA_GUNCANNON = DoubleSet.generate(
		make(M, 4),
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCGA2_ALPHA_MISSILE = DoubleSet.generate(
		make(L, 2),
		make(G, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCGA2_OMEGA_GUNCANNON = DoubleSet.generate(
		make(M, 4),
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCGA2_OMEGA_MISSILE = DoubleSet.generate(
		make(L, 2),
		make(G, 8)
	);

	public static final HashMap<SlotType, Integer> S_PCGA3_DEFENSE = DoubleSet.generate(
		make(P, 4),
		make(S, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCGA3_HANGAR = DoubleSet.generate(
		make(P, 2),
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCGA3_ALPHA_DEFENSE = DoubleSet.generate(
		make(P, 4),
		make(M, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCGA3_ALPHA_HANGAR = DoubleSet.generate(
		make(P, 4),
		make(M, 2),
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCGA3_OMEGA_HANGAR = DoubleSet.generate(
		make(P, 4),
		make(M, 8)
	);
	public static final HashMap<SlotType, Integer> S_PCGA3_OMEGA_DEFENSE = DoubleSet.generate(
		make(P, 4),
		make(M, 2),
		make(H, 4)
	);
	//Precursor Sentinel
	public static final HashMap<SlotType, Integer> S_PCSE1_EYE = DoubleSet.generate(
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCSE1_ALPHA_EYE = DoubleSet.generate(
		make(T, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCSE1_OMEGA_EYE = DoubleSet.generate(
		make(T, 3)
	);
	//(x2)
	public static final HashMap<SlotType, Integer> S_PCSE2_SENTINEL = DoubleSet.generate(
		make(X, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCSE2_ALPHA_SENTINEL = DoubleSet.generate(
		make(X, 3)
	);
	public static final HashMap<SlotType, Integer> S_PCSE2_OMEGA_SENTINEL = DoubleSet.generate(
		make(H, 2),
		make(X, 4)
	);

	//Precursor Instant Pylon
	public static final HashMap<SlotType, Integer> S_PCIP_DELTA = DoubleSet.generate(
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCIP_ALPHA = DoubleSet.generate(
		make(X, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCIP_OMEGA = DoubleSet.generate(
		make(X, 2),
		make(T, 1)
	);
	//Precursor Instant Repeller
	//(x2)
	public static final HashMap<SlotType, Integer> S_PCIR_DELTA = DoubleSet.generate(
		make(L, 3)
	);
	public static final HashMap<SlotType, Integer> S_PCIR_ALPHA = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCIR_OMEGA = DoubleSet.generate(
		make(L, 5)
	);

	//Precursor Herculean
	public static final HashMap<SlotType, Integer> S_PCHRC1_COLOSSUS = DoubleSet.generate(
		make(T, 4),
		make(W, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC1_ALPHA_COLOSSUS = DoubleSet.generate(
		make(T, 10),
		make(W, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC1_SIGMA_COLOSSUS = DoubleSet.generate(
		make(T, 14),
		make(W, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC1_OMEGA_COLOSSUS = DoubleSet.generate(
		make(T, 24),
		make(W, 1)
	);

	public static final HashMap<SlotType, Integer> S_PCHRC2_TITAN = DoubleSet.generate(
		make(T, 5)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC2_ALPHA_TITAN = DoubleSet.generate(
		make(T, 10)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC2_SIGMA_TITAN = DoubleSet.generate(
		make(T, 15)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC2_OMEGA_TITAN = DoubleSet.generate(
		make(T, 25)
	);

	public static final HashMap<SlotType, Integer> S_PCHRC3_GERAS = DoubleSet.generate(
		make(X, 10)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC3_ALPHA_GERAS = DoubleSet.generate(
		make(X, 15)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC3_OMEGA_GERAS = DoubleSet.generate(
		make(X, 25)
	);

	public static final HashMap<SlotType, Integer> S_PCHRC3_LETO = DoubleSet.generate(
		make(L, 15)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC3_ALPHA_LETO = DoubleSet.generate(
		make(L, 20)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC3_SIGMA_LETO = DoubleSet.generate(
		make(L, 25)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC3_OMEGA_LETO = DoubleSet.generate(
		make(L, 30)
	);

	public static final HashMap<SlotType, Integer> S_PCHRC4_HORATIO = DoubleSet.generate(
		make(P, 5),
		make(H, 10)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC4_ALPHA_HORATIO = DoubleSet.generate(
		make(P, 5),
		make(H, 10),
		make(G, 5)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC4_SIGMA_HORATIO = DoubleSet.generate(
		make(P, 5),
		make(H, 15),
		make(G, 5)
	);
	public static final HashMap<SlotType, Integer> S_PCHRC4_OMEGA_HORATIO = DoubleSet.generate(
		make(P, 5),
		make(H, 15),
		make(G, 10)
	);

	//Precursor Oracle
	public static final HashMap<SlotType, Integer> S_PCOR1_WING = DoubleSet.generate(
		make(S, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCOR1_ALPHA_WING = DoubleSet.generate(
		make(S, 4),
		make(L, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCOR1_SIGMA_WING = DoubleSet.generate(
		make(S, 4),
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCOR1_OMEGA_WING = DoubleSet.generate(
		make(S, 4),
		make(L, 3)
	);

	public static final HashMap<SlotType, Integer> S_PCOR2_ANTENNA = DoubleSet.generate(
		make(P, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCOR2_ALPHA_ORACLE = DoubleSet.generate(
		make(P, 5)
	);
	public static final HashMap<SlotType, Integer> S_PCOR2_SIGMA_ORACLE = DoubleSet.generate(
		make(P, 6)
	);
	public static final HashMap<SlotType, Integer> S_PCOR2_OMEGA_ORACLE = DoubleSet.generate(
		make(P, 7)
	);

	//Precursor Initializer
	public static final HashMap<SlotType, Integer> S_PCIN1_RETINA = DoubleSet.generate(
		make(M, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCIN2_CORE = DoubleSet.generate(
		make(P, 4)
	);
	public static final HashMap<SlotType, Integer> S_PCIN3_MAIN = DoubleSet.generate(
		make(H, 2)
	);

	//Precursor Emissary
	public static final HashMap<SlotType, Integer> S_PCEM1_RETINA = DoubleSet.generate(
		make(L, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCEM2_CORE = DoubleSet.generate(
		make(S, 2)
	);
	public static final HashMap<SlotType, Integer> S_PCEM2_SIGMA_CORE = DoubleSet.generate(
		make(S, 2),
		make(H, 1)
	);
	public static final HashMap<SlotType, Integer> S_PCEM2_OMEGA_CORE = DoubleSet.generate(
		make(S, 2),
		make(H, 2)
	);

	public static final HashMap<SlotType, Integer> S_PCEM3_MAIN = DoubleSet.generate(
		make(P, 4)
	);

	//AI Seeker
	public static final HashMap<SlotType, Integer> S_AISK = DoubleSet.generate(
		make(M, 3),
		make(G, 1)
	);
	//AI Warform
	public static final HashMap<SlotType, Integer> S_AIWF = DoubleSet.generate(
		make(P, 1),
		make(M, 3),
		make(L, 2),
		make(X, 1)
	);

	//AI Defensive
	public static final HashMap<SlotType, Integer> S_AIDF = DoubleSet.generate(
		make(P, 1),
		make(S, 2),
		make(M, 2)
	);

	//AI Nexus
	public static final HashMap<SlotType, Integer> S_AINX = DoubleSet.generate(
		make(S, 4),
		make(L, 2)
	);

	//AI Core
	public static final HashMap<SlotType, Integer> S_AICR = DoubleSet.generate(
		make(P, 2),
		make(M, 8),
		make(H, 14),
		make(X, 2)
	);
	//Extradimensional Escort
	public static final HashMap<SlotType, Integer> S_EXET = DoubleSet.generate(
		make(M, 3)
	);
	//Extradimensional Cruiser
	public static final HashMap<SlotType, Integer> S_EXCR = DoubleSet.generate(
		make(S, 2),
		make(M, 3),
		make(L, 1)
	);
	//Extradimensional Battleship
	public static final HashMap<SlotType, Integer> S_EXBT = DoubleSet.generate(
		make(S, 2),
		make(M, 4),
		make(L, 3)
	);

	//Extradimensional Conduit
	public static final HashMap<SlotType, Integer> S_EXCD = DoubleSet.generate(
		make(M, 4)
	);
	//Extradimensional Junction
	public static final HashMap<SlotType, Integer> S_EXJC = DoubleSet.generate(
		make(M, 4),
		make(L, 4)
	);
	//Extradimensional Anchor
	public static final HashMap<SlotType, Integer> S_EXAN = DoubleSet.generate(
		make(S, 6),
		make(M, 6),
		make(L, 6)
	);

	//Fallen Empire Escort
	public static final HashMap<SlotType, Integer> S_FEES = DoubleSet.generate(
		make(P, 4),
		make(S, 4),
		make(L, 1)
	);
	public static final HashMap<SlotType, Integer> S_FEBC = DoubleSet.generate(
		make(M, 4),
		make(H, 4),
		make(X, 1)
	);
	//Fallen Empire Titan
	public static final HashMap<SlotType, Integer> S_FETI = DoubleSet.generate(
		make(M, 4),
		make(H, 12),
		make(T, 1)
	);
	//Fallen Empire Outpost
	public static final HashMap<SlotType, Integer> S_FEOP = DoubleSet.generate(
		make(P, 2),
		make(M, 5),
		make(L, 2)
	);
	//Fallen Empire Fortress
	public static final HashMap<SlotType, Integer> S_FEFT = DoubleSet.generate(
		make(P, 4),
		make(M, 10),
		make(L, 10)
	);
	//Behemonth Planetcraft
	//Eraser Planetary Cannon
	public static final HashMap<SlotType, Integer> S_BHMTH1_ERASER = DoubleSet.generate(
		make(G, 6),
		make(T, 6)
	);
	//Auxilliary Weapon Battery
	public static final HashMap<SlotType, Integer> S_BHMTH2_AUXILLIARY = DoubleSet.generate(
		make(X, 12)
	);
	//Weaponized Crust
	public static final HashMap<SlotType, Integer> S_BHMTH3_CRUST = DoubleSet.generate(
		make(X, 12)
	);
	//Planetary Hangars
	public static final HashMap<SlotType, Integer> S_BHMTH4_HANGARS = DoubleSet.generate(
		make(H, 12)
	);
	//Secondary Armnament
	public static final HashMap<SlotType, Integer> S_BHMTH5_SECONDARY = DoubleSet.generate(
		make(L, 12)
	);

	//Stellar Systemcraft
	//Primary Annihalator Lances
	public static final HashMap<SlotType, Integer> S_STSYS_LANCES = DoubleSet.generate(
		make(T, 24),
		make(W, 1)
	);
	//Existence Removal Beams
	public static final HashMap<SlotType, Integer> S_STSYS_EXISTENCE = DoubleSet.generate(
		make(T, 25)
	);
	//Nicoll-Dyson Capacitor Array
	public static final HashMap<SlotType, Integer> S_STSYS_NICOLL_DYSON = DoubleSet.generate(
		make(P, 5),
		make(X, 20)
	);
	//Secondary Armnament
	public static final HashMap<SlotType, Integer> S_STSYS_SECONDARY = DoubleSet.generate(
		make(P, 5),
		make(X, 20)
	);
	//Grand Stellar Hangars
	public static final HashMap<SlotType, Integer> S_STSYS_STELLAR = DoubleSet.generate(
		make(H, 25)
	);
	//Omega Kugelblitz Protectors
	public static final HashMap<SlotType, Integer> S_OMEGA_KUGELBLITZ = DoubleSet.generate(
		make(L, 25)
	);

	//Infinity Machine
	public static final HashMap<SlotType, Integer> S_INFINITY_MACHINE = DoubleSet.generate(
		make(P, 6),
		make(S, 5),
		make(M, 7),
		make(H, 7),
		make(X, 1)
	);

	//Automated Dreadnought
	public static final HashMap<SlotType, Integer> S_AUTOMATED_DREADNOUGHT = DoubleSet.generate(
		make(S, 8),
		make(L, 7)
	);
	//Enigmatic Sentinel
	public static final HashMap<SlotType, Integer> S_ENIGMATIC_SENTINEL = DoubleSet.generate(
		make(S, 1)
	);
	public static final HashMap<SlotType, Integer> S_ENIGMATIC_DEFENDER = DoubleSet.generate(
		make(S, 2)
	);
	public static final HashMap<SlotType, Integer> S_ENIGMATIC_WARDEN = DoubleSet.generate(
		make(S, 1),
		make(L, 1)
	);
	public static final HashMap<SlotType, Integer> S_ENIGMATIC_VAULT = DoubleSet.generate(
		make(L, 7)
	);

	//Reclaimer Bot
	public static final HashMap<SlotType, Integer> S_RECLAIMER_BOT1 = DoubleSet.generate(
		make(G, 7),
		make(X, 1)
	);
	//Reclaimer Droid (x3s)
	public static final HashMap<SlotType, Integer> S_RECLAIMER_BOT2 = DoubleSet.generate(
		make(G, 1)
	);
	//Ether Drake
	public static final HashMap<SlotType, Integer> S_ETHER_DRAKE = DoubleSet.generate(
		make(P, 4),
		make(M, 8),
		make(X, 1)
	);
	//Stellarite Devourer
	public static final HashMap<SlotType, Integer> S_STELLARITE_DEVOURER = DoubleSet.generate(
		make(P, 8),
		make(L, 8),
		make(X, 1)
	);
	//Spectral Wraith
	public static final HashMap<SlotType, Integer> S_SPECTRAL_WRAITH = DoubleSet.generate(
		make(L, 6)
	);
	//Dimensional Horror
	public static final HashMap<SlotType, Integer> S_DIMENSIONAL_HORROR = DoubleSet.generate(
		make(P, 4),
		make(S, 2),
		make(M, 2),
		make(L, 2),
		make(X, 1)
	);
	//Tiyanki Matriarch
	public static final HashMap<SlotType, Integer> S_TIYANKI_MATRIARCH = DoubleSet.generate(
		make(M, 6),
		make(L, 2),
		make(X, 1)
	);
	//Voidspawn
	public static final HashMap<SlotType, Integer> S_VOIDSPAWN = DoubleSet.generate(
		make(G, 6)
	);
	//Nanite Interdictor
	public static final HashMap<SlotType, Integer> S_NANITE_INTERDICTOR = DoubleSet.generate(
		make(H, 3),
		make(G, 4)
	);
	//Nanite Mothership
	public static final HashMap<SlotType, Integer> S_NANITE_MOTERHSHIP = DoubleSet.generate(
		make(H, 10),
		make(G, 4),
		make(X, 1)
	);
	//Nanite Factory
	public static final HashMap<SlotType, Integer> S_NANITE_FACTORY = DoubleSet.generate(
		make(H, 15),
		make(G, 12),
		make(X, 1)
	);
	//Void Clouds
	public static final HashMap<SlotType, Integer> S_VOID_CLOUDS = DoubleSet.generate(
		make(L, 4)
	);
	//Space Ambeoba
	public static final HashMap<SlotType, Integer> S_SPACE_AMBEOBA = DoubleSet.generate(
		make(S, 3)
	);
	//Space Ambeoba Mother
	public static final HashMap<SlotType, Integer> S_SPACE_AMBEOBA_MOTHER = DoubleSet.generate(
		make(S, 2),
		make(H, 2)
	);
	//Space Whale (Tiyanki)
	public static final HashMap<SlotType, Integer> S_SPACE_WHALE = DoubleSet.generate(
		make(S, 5)
	);
	//Ancient Mining Drone
	public static final HashMap<SlotType, Integer> S_ANCIENT_MINING_DRONE = DoubleSet.generate(
		make(S, 2)
	);
	//Ancient Combat Drone
	public static final HashMap<SlotType, Integer> S_ANCIENT_COMBAT_DRONE = DoubleSet.generate(
		make(S, 2),
		make(M, 1)
	);
	//Ancient Destroyer
	public static final HashMap<SlotType, Integer> S_ANCIENT_DESTROYER = DoubleSet.generate(
		make(S, 2),
		make(M, 2)
	);
	//Ancient Mining Station
	public static final HashMap<SlotType, Integer> S_ANCIENT_MINING_STATION = DoubleSet.generate(
		make(S, 3)
	);
	//Ancient Home Base
	public static final HashMap<SlotType, Integer> S_ANCIENT_HOME_BASE = DoubleSet.generate(
		make(L, 2),
		make(H, 3)
	);
	//Crystal Shardling
	public static final HashMap<SlotType, Integer> S_CRYSTAL_SHARDLING = DoubleSet.generate(
		make(S, 3)
	);
	//Crystal Shard
	public static final HashMap<SlotType, Integer> S_CRYSTAL_SHARD = DoubleSet.generate(
		make(S, 4),
		make(M, 1)
	);
	//Crystal Quintessence
	public static final HashMap<SlotType, Integer> S_CRYSTAL_QUINTESSENCE = DoubleSet.generate(
		make(M, 4),
		make(L, 1)
	);
	//Crystal Station
	public static final HashMap<SlotType, Integer> S_CRYSTAL_STATION = DoubleSet.generate(
		make(S, 3)
	);
	//Crystal Nidius
	public static final HashMap<SlotType, Integer> S_CRYSTAL_NIDIUS = DoubleSet.generate(
		make(S, 4),
		make(M, 4),
		make(L, 4)
	);
	//Psionic Avatar
	public static final HashMap<SlotType, Integer> S_AVATAR = DoubleSet.generate(
		make(M, 4)
	);
	public static final HashMap<SlotType, Integer> S_AVATAR_CORRUPTED = DoubleSet.generate(
		make(M, 4)
	);
	//Pirate Raider
	public static final HashMap<SlotType, Integer> S_PRRA_HEAVY_BOAT = DoubleSet.generate(
		make(S, 1),
		make(M, 1)
	);
	public static final HashMap<SlotType, Integer> S_PRRA_INTERCEPTOR = DoubleSet.generate(
		make(S, 3)
	);
	//Pirate Frigate
	public static final HashMap<SlotType, Integer> S_PRFR_ARTILLERY = DoubleSet.generate(
		make(S, 2),
		make(L, 1)
	);
	public static final HashMap<SlotType, Integer> S_PRFR_GUNSHIP = DoubleSet.generate(
		make(P, 1),
		make(S, 1),
		make(M, 1),
		make(G, 1)
	);
	//Pirate Cruiser
	public static final HashMap<SlotType, Integer> S_PRCR_BROADSIDE = DoubleSet.generate(
		make(S, 2),
		make(M, 2),
		make(L, 1)
	);
	//Pirate Galleon
	public static final HashMap<SlotType, Integer> S_PRGL_BROADSIDE = DoubleSet.generate(
		make(P, 3),
		make(S, 1),
		make(L, 8),
		make(G, 1)
	);
	//Pirate Outpost
	public static final HashMap<SlotType, Integer> S_PROUT = DoubleSet.generate(
		make(S, 3)
	);
	//Nomad Destroyer
	public static final HashMap<SlotType, Integer> S_NOMAD_DESTROYER = DoubleSet.generate(
		make(P, 2),
		make(L, 1)
	);
	//Nomad Cruiser
	public static final HashMap<SlotType, Integer> S_NOMAD_CRUISER = DoubleSet.generate(
		make(S, 3),
		make(M, 2),
		make(L, 1)
	);
	//Nomad Battleship
	public static final HashMap<SlotType, Integer> S_NOMAD_BATTLESHIP = DoubleSet.generate(
		make(S, 4),
		make(M, 4),
		make(L, 1)
	);
	//Enclave Station
	public static final HashMap<SlotType, Integer> S_ECST_TRADER = DoubleSet.generate(
		make(P, 4),
		make(S, 6),
		make(M, 6),
		make(L, 6),
		make(G, 4),
		make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_ECST_ARTIST = DoubleSet.generate(
			make(P, 4),
			make(S, 6),
			make(M, 6),
			make(L, 6),
			make(G, 4),
			make(X, 1)
	);
	public static final HashMap<SlotType, Integer> S_ECST_CURATOR = DoubleSet.generate(
			make(P, 4),
			make(S, 6),
			make(M, 6),
			make(L, 6),
			make(G, 4),
			make(X, 1)
	);

	//Weaponized Passenger Liner
	public static final HashMap<SlotType, Integer> S_WPL = DoubleSet.generate(
		make(M, 3),
		make(L, 2)
	);
	//Weaponized Tanker
	public static final HashMap<SlotType, Integer> S_TANKER = DoubleSet.generate(
		make(G, 9)
	);
	//Weaponized Freighter
	public static final HashMap<SlotType, Integer> S_FREIGHTER = DoubleSet.generate(
		make(P, 2),
		make(H, 4)
	);
	//Weaponized Ark Ship
	public static final HashMap<SlotType, Integer> S_ARK_SHIP = DoubleSet.generate(
		make(P, 4),
		make(M, 4),
		make(L, 4)
	);
	//Caravaneer Destroyer
	public static final HashMap<SlotType, Integer> S_CRVDE = DoubleSet.generate(
		make(P, 2),
		make(M, 1)
	);
	//Caravaneer Cruiser
	public static final HashMap<SlotType, Integer> S_CRVCR = DoubleSet.generate(
		make(S, 2),
		make(M, 2),
		make(L, 2)
	);
	//Caravaneer Cargo Ship
	public static final HashMap<SlotType, Integer> S_CRVCARGO = DoubleSet.generate(
		make(P, 5),
		make(H, 10)
	);
	//Caraveneer Station
	public static final HashMap<SlotType, Integer> S_CRVSTAT = DoubleSet.generate(
		make(P, 4),
		make(S, 6),
		make(M, 6),
		make(L, 6),
		make(G, 4),
		make(X, 1)
	);

	//Imperial TIE Fighter
	public static final HashMap<SlotType, Integer> TIE_SCOUT = DoubleSet.generate(
		make(S, 1)
	);
	public static final HashMap<SlotType, Integer> TIE_FIGHTER = DoubleSet.generate(
		make(S, 2)
	);
	public static final HashMap<SlotType, Integer> TIE_INTERCEPTOR = DoubleSet.generate(
		make(S, 4)
	);
	public static final HashMap<SlotType, Integer> TIE_HUNTER = DoubleSet.generate(
		make(S, 4)
	);
	//TIE Bomber
	public static final HashMap<SlotType, Integer> TIE_BOMBER = DoubleSet.generate(
		make(S, 2)
	);
	public static final HashMap<SlotType, Integer> TIE_DEFENDER = DoubleSet.generate(
		make(S, 3)
	);
	public static final HashMap<SlotType, Integer> TIE_TORPEDO_BOMBER = DoubleSet.generate(
		make(S, 3)
	);
	//Patrol Craft
	public static final HashMap<SlotType, Integer> S_PATROL_CRAFT = DoubleSet.generate(
		make(S, 2)
	);
	//Frigate
	public static final HashMap<SlotType, Integer> S_VIGIL_CORVETTE = DoubleSet.generate(
		make(P, 1),
		make(S, 2),
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_KUAT_WEAPON = DoubleSet.generate(
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_NEBULON_B_MAIN_HULL = DoubleSet.generate(
		make(P, 2),
		make(S, 4)
	);

	//Frigate Mid
	public static final HashMap<SlotType, Integer> S_VIGIL_BACK_I = DoubleSet.generate(
		make(P, 2),
		make(S, 2)
	);
	public static final HashMap<SlotType, Integer> S_VIGIL_BACK_II = DoubleSet.generate(
		make(S, 2),
		make(G, 1)
	);
	public static final HashMap<SlotType, Integer> S_KUAT_WEAPON_BACK_I = DoubleSet.generate(
		make(P, 1),
		make(S, 3)
	);
	public static final HashMap<SlotType, Integer> S_KUAT_WEAPON_BACK_II = DoubleSet.generate(
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_NEBULON_B_BACK_I = DoubleSet.generate(
		make(S, 2),
		make(H, 1)
	);
	public static final HashMap<SlotType, Integer> S_NEBULON_B_BACK_II = DoubleSet.generate(
		make(M, 2)
	);
	//Escort Carrier
	public static final HashMap<SlotType, Integer> I_ESCORT_CARRIER_FRONT_I = DoubleSet.generate(
		make(S, 2),
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> I_ESCORT_CARRIER_FRONT_II = DoubleSet.generate(
		make(M, 3)
	);
	public static final HashMap<SlotType, Integer> I_ADDITIONAL_HANGARBAY = DoubleSet.generate(
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> I_TONNFALK_FRONT_I = DoubleSet.generate(
		make(S, 2),
		make(M, 2)
	);
	//Escort Carrier Mid
	public static final HashMap<SlotType, Integer> I_IMPERIAL_ESCORT_CARRIER = DoubleSet.generate(
		make(P, 2),
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> I_TONNFALK_ESCORT_CARRIER = DoubleSet.generate(
		make(P, 2),
		make(H, 3)
	);
	//Escort Carrier Back
	public static final HashMap<SlotType, Integer> I_ESCORT_CARRIER_BACK_I = DoubleSet.generate(
		make(S, 2),
		make(M, 1)
	);
	public static final HashMap<SlotType, Integer> I_ESCORT_CARRIER_BACK_II = DoubleSet.generate(
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> I_TONNFALK_BACK_I = DoubleSet.generate(
		make(S, 2),
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> I_ADDITIONAL_HANGARBAY_II = DoubleSet.generate(
		make(H, 1)
	);

	//Light Cruiser
	public static final HashMap<SlotType, Integer> I_LC_VINDICATORPD = DoubleSet.generate(
		make(P, 2),
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> I_VINDICATOR_FRONT = DoubleSet.generate(
		make(S, 2),
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> I_VICTORY_TORPEDO = DoubleSet.generate(
		make(S, 2),
		make(G, 2)
	);
	public static final HashMap<SlotType, Integer> I_VICTORY_FRONT = DoubleSet.generate(
		make(S, 2),
		make(M, 2)
	);

	//Light Cruiser Mid
	public static final HashMap<SlotType, Integer> I_VINDICATOR_CRUISER = DoubleSet.generate(
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> I_VICTORY_FRIGATE_MKII = DoubleSet.generate(
		make(L, 2)
	);

	//Light Cruiser end
	public static final HashMap<SlotType, Integer> I_VINDICATOR_BACK_I = DoubleSet.generate(
		make(S, 2),
		make(M, 1)
	);
	public static final HashMap<SlotType, Integer> I_VINDICATOR_BACK_II = DoubleSet.generate(
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> I_VICTORY_BACK = DoubleSet.generate(
		make(S, 2),
		make(M, 1)
	);
	public static final HashMap<SlotType, Integer> I_VICTORY_BACK_TORPEDO = DoubleSet.generate(
		make(G, 2)
	);

	//Medium Cruiser
	public static final HashMap<SlotType, Integer> S_MC1_ACCLAMATOR_FRONT_I = DoubleSet.generate(
		make(P, 2),
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_MC1_ACCLAMATOR_FRONT_II = DoubleSet.generate(
		make(M, 3)
	);
	public static final HashMap<SlotType, Integer> S_MC1_GLADIATOR_FRONT_I = DoubleSet.generate(
		make(S, 2),
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_MC1_GLADIATOR_FRONT_II = DoubleSet.generate(
		make(M, 1),
		make(L, 1)
	);

	public static final HashMap<SlotType, Integer> S_MC2_ACCLAMATOR_ASSAULT_SHIP = DoubleSet.generate(
		make(M, 3),
		make(L, 1)
	);
	public static final HashMap<SlotType, Integer> S_MC2_GLADIATOR_SD = DoubleSet.generate(
		make(M, 1),
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_MC3_ACCLAMATOR_BACK_I = DoubleSet.generate(
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_MC3_ACCLAMATOR_BACK_II = DoubleSet.generate(
		make(S, 4)
	);
	public static final HashMap<SlotType, Integer> S_MC3_GLADIATOR_BACK_I = DoubleSet.generate(
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_MC3_GLADIATOR_BACK_II = DoubleSet.generate(
		make(S, 2),
		make(M, 1)
	);
	//Heavy Cruiser
	public static final HashMap<SlotType, Integer> S_HC1_VICTORY_I = DoubleSet.generate(
		make(S, 2),
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_HC1_VICTORY_II = DoubleSet.generate(
		make(M, 3)
	);
	public static final HashMap<SlotType, Integer> S_HC1_VICTORY_HANGARBAY = DoubleSet.generate(
		make(M, 1),
		make(H, 1)
	);

	public static final HashMap<SlotType, Integer> S_HC2_VICTORY_I = DoubleSet.generate(
		make(S, 2),
		make(L, 1),
		make(G, 2)
	);
	public static final HashMap<SlotType, Integer> S_HC2_VICTORY_II = DoubleSet.generate(
		make(S, 2),
		make(M, 2),
		make(L, 1)
	);

	public static final HashMap<SlotType, Integer> S_HC3_VICTORY_I_I = DoubleSet.generate(
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_HC3_VICTORY_I_II = DoubleSet.generate(
		make(S, 2),
		make(M, 1)
	);
	public static final HashMap<SlotType, Integer> S_HC3_VICTORY_II_I = DoubleSet.generate(
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_HC3_VICTORY_II_II = DoubleSet.generate(
		make(S, 2),
		make(M, 1)
	);



	//Star Cruiser
	public static final HashMap<SlotType, Integer> S_SC1_PROCURSATOR_I = DoubleSet.generate(
		make(S, 2),
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_SC1_PROCURSATOR_II = DoubleSet.generate(
		make(M, 3)
	);

	public static final HashMap<SlotType, Integer> S_SC2_PROCURSATOR_SD = DoubleSet.generate(
		make(S, 2),
		make(M, 2),
		make(L, 3)
	);

	public static final HashMap<SlotType, Integer> S_SC3_PROCURSATOR_I = DoubleSet.generate(
		make(M, 3)
	);
	public static final HashMap<SlotType, Integer> S_SC3_PROCURSATOR_II = DoubleSet.generate(
		make(S, 2),
		make(M, 2)
	);

	//Star Destroyer

	public static final HashMap<SlotType, Integer> S_ISD1_CONQUEROR_I = DoubleSet.generate(
		make(S, 2),
		make(M, 3)
	);
	public static final HashMap<SlotType, Integer> S_ISD1_CONQUEROR_II = DoubleSet.generate(
		make(P, 2),
		make(S, 2)
	);
	public static final HashMap<SlotType, Integer> S_ISD1_IMPERIAL1 = DoubleSet.generate(
		make(S, 2),
		make(M, 4)
	);
	public static final HashMap<SlotType, Integer> S_ISD1_IMPERIAL2 = DoubleSet.generate(
		make(S, 2),
		make(M, 6)
	);
	public static final HashMap<SlotType, Integer> S_ISD1_VENATOR_I = DoubleSet.generate(
		make(P, 2),
		make(S, 4),
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_ISD1_VENATOR_II = DoubleSet.generate(
		make(P, 2),
		make(M, 4)
	);


	public static final HashMap<SlotType, Integer> S_ISD2_CONQUEROR_I = DoubleSet.generate(
		make(M, 4),
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_ISD2_CONQUEROR_II = DoubleSet.generate(
		make(M, 4),
		make(X, 2)
	);
	public static final HashMap<SlotType, Integer> S_ISD2_IMPERIAL_I = DoubleSet.generate(
		make(P, 2),
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_ISD2_IMPERIAL_II = DoubleSet.generate(
		make(M, 2),
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_ISD2_VENATOR = DoubleSet.generate(
		make(H, 4),
		make(X, 1)
	);

	public static final HashMap<SlotType, Integer> S_ISD3_CONQUEROR_WEAPON_BANK = DoubleSet.generate(
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_ISD3_OCTUPLE_BANK = DoubleSet.generate(
		make(L, 8)
	);
	public static final HashMap<SlotType, Integer> S_ISD3_VENATOR_WEAPON_BANK = DoubleSet.generate(
		make(L, 2),
		make(P, 2),
		make(H, 4)
	);

	public static final HashMap<SlotType, Integer> S_ISD4_CONQUEROR_I = DoubleSet.generate(
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_ISD4_IMPERIAL_I = DoubleSet.generate(
		make(S, 2),
		make(M, 1)
	);
	public static final HashMap<SlotType, Integer> S_ISD4_VENATOR_I = DoubleSet.generate(
		make(P, 2)
	);
	public static final HashMap<SlotType, Integer> S_ISD4_VENATOR_II = DoubleSet.generate(
		make(S, 2)
	);

	//Battlecruiser
	public static final HashMap<SlotType, Integer> S_BCR1_SECUTOR_I = DoubleSet.generate(
		make(S, 4),
		make(M, 4)
	);
	public static final HashMap<SlotType, Integer> S_BCR1_SECUTOR_II = DoubleSet.generate(
		make(S, 2),
		make(M, 5)
	);
	public static final HashMap<SlotType, Integer> S_BCR1_SECUTOR_III = DoubleSet.generate(
		make(M, 6)
	);
	public static final HashMap<SlotType, Integer> S_BCR1_ALLEGIANCE_I = DoubleSet.generate(
		make(S, 4),
		make(M, 4)
	);
	public static final HashMap<SlotType, Integer> S_BCR1_ALLEGIANCE_II = DoubleSet.generate(
		make(S, 2),
		make(M, 5)
	);
	public static final HashMap<SlotType, Integer> S_BCR1_ALLEGIANCE_III = DoubleSet.generate(
		make(M, 6)
	);

	public static final HashMap<SlotType, Integer> S_BCR2_SECUTOR_I = DoubleSet.generate(
		make(M, 4),
		make(L, 3)
	);
	public static final HashMap<SlotType, Integer> S_BCR2_SECUTOR_II = DoubleSet.generate(
		make(S, 2),
		make(M, 3),
		make(L, 3)
	);
	public static final HashMap<SlotType, Integer> S_BCR2_ALLEGIANCE_I = DoubleSet.generate(
		make(M, 4),
		make(L, 3)
	);
	public static final HashMap<SlotType, Integer> S_BCR2_ALLEGIANCE_II = DoubleSet.generate(
		make(S, 2),
		make(M, 3),
		make(L, 3)
	);

	public static final HashMap<SlotType, Integer> S_BCR3_SECUTOR_SMALL_HANGARBAY = DoubleSet.generate(
		make(H, 6)
	);
	public static final HashMap<SlotType, Integer> S_BCR3_SECUTOR_LARGE_HANGARBAY = DoubleSet.generate(
		make(H, 12)
	);
	public static final HashMap<SlotType, Integer> S_BCR3_SMALL_WEAPON_BANK = DoubleSet.generate(
		make(L, 6)
	);
	public static final HashMap<SlotType, Integer> S_BCR3_LARGE_WEAPON_BANK = DoubleSet.generate(
		make(L, 12)
	);

	public static final HashMap<SlotType, Integer> S_BCR4_SECUTOR  = DoubleSet.generate(
		make(S, 2),
		make(M, 6)
	);
	public static final HashMap<SlotType, Integer> S_BCR4_ALLEGIANCE = DoubleSet.generate(
		make(S, 3),
		make(M, 5)
	);

	//Super Star Destroyer
	public static final HashMap<SlotType, Integer> S_SSD1_BELLATOR_I = DoubleSet.generate(
		make(M, 4),
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_SSD1_BELLATOR_II = DoubleSet.generate(
		make(M, 8),
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_SSD1_BELLATOR_III = DoubleSet.generate(
		make(L, 6)
	);
	public static final HashMap<SlotType, Integer> S_SSD1_ANNIHILATOR = DoubleSet.generate(
		make(X, 3)
	);

	public static final HashMap<SlotType, Integer> S_SSD2_BELLATOR_I = DoubleSet.generate(
		make(M, 4),
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_SSD2_BELLATOR_II = DoubleSet.generate(
		make(M, 8),
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_SSD2_ANNIHILATOR = DoubleSet.generate(
		make(M, 28)
	);
	public static final HashMap<SlotType, Integer> S_SSD3_BELLATOR_I = DoubleSet.generate(
		make(S, 4),
		make(M, 4),
		make(L, 4)
	);
	public static final HashMap<SlotType, Integer> S_SSD3_BELLATOR_II = DoubleSet.generate(
		make(M, 10),
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_SSD3_ANNIHILATOR = DoubleSet.generate(
		make(H, 29)
	);
	public static final HashMap<SlotType, Integer> S_SSD4_BELLATOR = DoubleSet.generate(
		make(M, 4),
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_SSD4_ANNIHILATOR = DoubleSet.generate(
		make(P, 6)
	);
	//Heavy Interdictor
	public static final HashMap<SlotType, Integer> S_HVIDC1_INTERDICTOR_I = DoubleSet.generate(
		make(S, 2),
		make(M, 3),
		make(L, 2)
	);
	public static final HashMap<SlotType, Integer> S_HVIDC1_INTERDICTOR_II = DoubleSet.generate(
		make(S, 4),
		make(M, 2),
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_HVIDC1_INTERDICTOR_III = DoubleSet.generate(
		make(S, 4),
		make(M, 4),
		make(L, 1)
	);

	public static final HashMap<SlotType, Integer> S_HVIDC2_INTERDICTOR_I = DoubleSet.generate(
		make(P, 2),
		make(S, 2),
		make(H, 2)
	);
	public static final HashMap<SlotType, Integer> S_HVIDC2_INTERDICTOR_II = DoubleSet.generate(
		make(M, 2),
		make(L, 1)
	);
	public static final HashMap<SlotType, Integer> S_HVIDC2_INTERDICTOR_III = DoubleSet.generate(
		make(S, 4),
		make(L, 1)
	);
	//Light Interdictor
	public static final HashMap<SlotType, Integer> S_LIDC1_ANTI_STRIKE_CRAFT = DoubleSet.generate(
		make(P, 2),
		make(M, 2)
	);
	public static final HashMap<SlotType, Integer> S_LIDC1_IMMOBILIZER = DoubleSet.generate(
		make(S, 2),
		make(M, 2)
	);

	public static final HashMap<SlotType, Integer> S_LIDC2_IMMOBILIZER = DoubleSet.generate(
		make(S, 2),
		make(M, 1),
		make(H, 1)
	);
	public static final HashMap<SlotType, Integer> S_LIDC3_IMMOBILIZIER = DoubleSet.generate(
		make(S, 2),
		make(M, 1)
	);

	//Star Dreadnought
	public static final HashMap<SlotType, Integer> S_SDR1_ECLIPSE = DoubleSet.generate(
		make(T, 1)
	);
	public static final HashMap<SlotType, Integer> S_SDR1_EXECUTOR = DoubleSet.generate(
		make(X, 3)
	);

	public static final HashMap<SlotType, Integer> S_SDR2_MID_I = DoubleSet.generate(
		make(L, 8)
	);
	public static final HashMap<SlotType, Integer> S_SDR3_ECLIPSE = DoubleSet.generate(
		make(L, 8)
	);
	public static final HashMap<SlotType, Integer> S_SDR3_EXECUTOR = DoubleSet.generate(
		make(L, 12)
	);

	public static final HashMap<SlotType, Integer> S_SDR4_ECLIPSE = DoubleSet.generate(
		make(L, 8)
	);
	public static final HashMap<SlotType, Integer> S_SDR4_EXECUTOR = DoubleSet.generate(
		make(G, 7)
	);

	public static final HashMap<SlotType, Integer> S_SDR5_ECLIPSE = DoubleSet.generate(
		make(H, 6)
	);
	public static final HashMap<SlotType, Integer> S_SDR5_EXECUTOR = DoubleSet.generate(
		make(M, 6),
		make(H, 4)
	);

	//Swarm Swarmling
	public static final HashMap<SlotType, Integer> S_SWARM_SWARMLING = DoubleSet.generate(
		make(S, 2),
		make(G, 1)
	);
	//Swarm Warrior
	public static final HashMap<SlotType, Integer> S_SWARM_WARRIOR = DoubleSet.generate(
		make(M, 2),
		make(G, 3)
	);
	//Swarm Carrier
	public static final HashMap<SlotType, Integer> S_SWARM_CARRIER = DoubleSet.generate(
		make(S, 2),
		make(H, 4)
	);
	//Swarm Queen
	public static final HashMap<SlotType, Integer> S_SWARM_QUEEN = DoubleSet.generate(
		make(M, 3),
		make(H, 3),
		make(G, 4)
	);
	//Swarm Star Nest
	public static final HashMap<SlotType, Integer> S_SWARM_STAR_NEST = DoubleSet.generate(
		make(S, 3),
		make(H, 4)
	);
	//Swarm Star Hive
	public static final HashMap<SlotType, Integer> S_SWARM_STAR_HIVE = DoubleSet.generate(
		make(M, 5),
		make(H, 8)
	);









}
