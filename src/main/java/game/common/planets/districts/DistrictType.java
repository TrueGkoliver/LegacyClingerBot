package game.common.planets.districts;

import java.util.HashMap;

import game.common.planets.jobs.Job;

public abstract class DistrictType {
	
	HashMap<Job, Integer> jobs;
	int housing;
	public DistrictType(String unlocalized, HashMap<Job, Integer> jobs, int housing) {
		this.jobs = jobs;
		this.housing = housing;
	}

}
