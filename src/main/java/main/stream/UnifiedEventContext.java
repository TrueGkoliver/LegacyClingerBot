package main.stream;

import game.common.government.Empire;
import game.common.planets.PlanetInstance;
import game.common.ships.ShipInstance;

public class UnifiedEventContext {
    //This is still in construction, but it'll hopefully work to provide  a universal standard for all game functions going forward.
    PlanetInstance planetIn;
    ShipInstance shipIn;
    Empire empireIn;
}
