package game.common.planets.buildings;

import game.common.planets.jobs.Job;
import game.common.resources.Resource;

import java.util.HashMap;

public abstract class AbstractBuilding {
    public static interface ICostBuilder<T> {
        HashMap<T, Integer> build();
    }
    public void onTick() { }
    //Amount of messages you must send before you can redeem a building's materials again.
    public int getTimeRequired() { return 5; }
    public abstract HashMap<Job, Integer> getJobs();
    public abstract HashMap<Resource, Integer> getCost();
    public abstract HashMap<Resource, Integer> getBaseResources();
}
