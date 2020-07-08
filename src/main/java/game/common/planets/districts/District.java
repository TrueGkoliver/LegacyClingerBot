package game.common.planets.districts;

import java.util.HashMap;

import game.common.planets.jobs.Job;

public class District extends DistrictType {

	public District(String unlocalized, HashMap<Job, Integer> jobs, int housing) {
		super(unlocalized, jobs, housing);
	}

}
