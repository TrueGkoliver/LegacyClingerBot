package game.common.planets.districts;

import java.util.ArrayList;

public class DistrictSet {
	public ArrayList<District> districts = new ArrayList<District>();
	public DistrictSet(District... district) {
		for (District i : district) {
			districts.add(i);
		}
	}
	public DistrictSet(ArrayList<District> i) {
		districts = i;
	}
	public static DistrictSet add(DistrictSet a, DistrictSet b) {
		ArrayList<District> newSet = a.districts;
		newSet.addAll(b.districts);
		return new DistrictSet(newSet);
	}
}
