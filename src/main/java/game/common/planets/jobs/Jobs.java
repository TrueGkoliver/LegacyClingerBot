package game.common.planets.jobs;

import game.common.resources.Resource;
import game.common.resources.Resources;
import util.DoubleSet;

import java.util.HashMap;

public class Jobs {

	public static final Job FARMER = new JobResourceBase("Farmer", EJobStrati.WORKER, Resources.FOOD, 5);
	public static final Job MINER = new JobResourceBase("Miner", EJobStrati.WORKER , Resources.MINERALS, 5);
	public static final Job TECHNICIAN = new JobResourceBase("Technician", EJobStrati.WORKER , Resources.ENERGY, 5);

}
