package game.common.ships.weapons;

import java.util.ArrayList;
import java.util.List;

public class SlotType {
	public static List<SlotType> slot_types = new ArrayList<SlotType>();
	public static final SlotType ST_GUN_S = new SlotType("Small Weapon");
	public static final SlotType ST_GUN_M = new SlotType("Medium Weapon");
	public static final SlotType ST_GUN_L = new SlotType("Large Weapon");
	public static final SlotType ST_TORPEDO = new SlotType("Torpedo");
	public static final SlotType ST_PD = new SlotType("Point Defense");
	public static final SlotType ST_HANGAR = new SlotType("Hangar Bay");
	public static final SlotType ST_GUN_XL = new SlotType("Extra Large Weapon");
	public static final SlotType ST_TITAN = new SlotType("Titan Weapon");
	public static final SlotType ST_COLOSSUS = new SlotType("Colossus Weapon");
	public String name;
	public SlotType(String name) {
		this.name = name;
		slot_types.add(this);
	}
	

}
