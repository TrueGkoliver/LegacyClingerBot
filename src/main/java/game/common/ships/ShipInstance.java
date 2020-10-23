package game.common.ships;

import game.common.fleets.FleetInstance;
import game.common.ships.classes.ShipClass;

public class ShipInstance {


    public int health;
    public ShipClass classIn;
    public ShipInstance(ShipClass classIn, String nameIn, int id, FleetInstance fleetIn) {}
    public float getTotalHealth() {
        return health/classIn.maxHealth;
    }
}
