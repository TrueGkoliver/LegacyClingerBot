package game.common.planets.jobs;

import java.util.HashMap;

import game.common.resources.Resource;

public class JobResourceBase extends Job {
	Resource resource;
	int amount;
	HashMap<Resource, Integer> map;
	public JobResourceBase(String name, EJobStrati i, Resource r, int a) {
		super(name);
		this.resource = r;
		this.amount = a;
		map = new HashMap<Resource,Integer>() {
			private static final long serialVersionUID = 1L;
			{
				put(resource, amount);
			}
		};
	}

	@Override
	public void doJob() {}

	@Override
	public HashMap<Resource, Integer> getResources() {
		return map;
	}
}
