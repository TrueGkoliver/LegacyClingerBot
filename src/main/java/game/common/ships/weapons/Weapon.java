package game.common.ships.weapons;

import game.common.planets.PlanetInstance;

public class Weapon implements IWeaponUtils {
	SlotType type;
	public Weapon(SlotType t, String name, int dam) {
		type=t;
	}
	@Override
	public void doDamageAgainstShip() {
		
	}

}
