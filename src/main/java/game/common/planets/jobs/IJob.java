package game.common.planets.jobs;

import java.util.HashMap;
import game.common.resources.Resource;

public interface IJob {
	/**
	 * Called with every tick.
	 */
	public void doJob();
	/**
	 * Getting resources from the job.
	 * @return
	 */
	public HashMap<Resource, Integer> getResources();
}
