package game.common.ships.sizes;

import game.common.ships.sizes.locator.Locator;

public class ShipSize {
	String name;
	EShipSizeArchetypes archetype;
	Locator[] locators;
	ShipVariant i;
	public ShipSize(ShipVariant i, String name, EShipSizeArchetypes archetype, Locator... locators) {this.i=i; this.name=name; this.archetype=archetype; this.archetype=archetype; this.locators=locators;}
	//Dead handler so I can create the ship sizes without much worry
	public ShipSize() {}
	public ShipSize(int id) {
		
	}
}
