package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import game.common.government.Empire;
import game.common.government.GovernmentType;
import game.common.planets.PlanetInstance;
import game.common.planets.classes.GamePlanets;
import game.common.planets.classes.PlanetClass;
import net.dv8tion.jda.api.entities.User;

public class ParserUtils {
	public static final String FILEPATH_EMPIRES = new File("src/main/resources/data/empires.json").getAbsolutePath();
	public static final String FILEPATH_PLANETS = new File("src/main/resources/data/planets.json").getAbsolutePath();
	public static final String FILEPATH_CHEATS = new File("src/main/resources/data/cheats.json").getAbsolutePath();
	
	public static boolean getCheats(User user) {
		try {
			FileReader reader = new FileReader(FILEPATH_CHEATS);
			JSONParser jsonParser = new JSONParser();
			JSONArray array = (JSONArray) jsonParser.parse(reader);
			System.out.println(array);
			if (array.contains(user.getId())) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static int getMostUnusedID() throws IOException, ParseException {
		int tbr = 0;
		FileReader reader = new FileReader(FILEPATH_EMPIRES);
		JSONParser jsonParser = new JSONParser();
		JSONObject b = (JSONObject) jsonParser.parse(reader);
		JSONObject empires = (JSONObject) b.get("empires");
		Iterator<String> keys = empires.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			tbr++;
			System.out.println(tbr);
		}
		return tbr-1;
	}
	public static int checkForAndDeleteEmpires(User user) throws IOException, ParseException {
		try {
			FileReader reader = new FileReader(FILEPATH_EMPIRES);
			JSONParser jsonParser = new JSONParser();
			JSONObject b = (JSONObject) jsonParser.parse(reader);
			JSONObject empires = (JSONObject) b.get("empires");
			Set<String> keys = empires.keySet();
			for (String key : keys) {
				System.out.println(key);
				System.out.println(user.getId());
				if (key.equals(user.getId())) {
					JSONObject empire = (JSONObject) empires.get(user.getId());
					int id = new Integer(new Long((long) empire.get("id")).intValue());
					System.out.println(id);
					empires.remove(user.getId());
					return id;
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public static Empire serializeEmpireFromId(int id) throws IOException, ParseException {
		try {
			FileReader reader = new FileReader(FILEPATH_EMPIRES);
			JSONParser jsonParser = new JSONParser();
			JSONObject b = (JSONObject) jsonParser.parse(reader);
			JSONObject empires = (JSONObject) b.get("empires");
			Set<String> keys = empires.keySet();
			for (String key : keys) {
				JSONObject empire = (JSONObject) empires.get(key);
				if ((long)empire.get("id")==(long)id) {
					int govId = new Integer(new Long((long) empire.get("govid")).intValue());
					System.out.println(govId);
					Empire tbr = new Empire((String) empire.get("name"), GovernmentType.GovernmentTypes.TYPES.get(govId));
					return tbr;
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	public static void writePlanet(int classId, int empireId) {
		FileReader reader;
		try {
			System.out.println("try again");
			reader = new FileReader(FILEPATH_PLANETS);
			JSONParser jsonParser = new JSONParser();
			JSONObject b = (JSONObject) jsonParser.parse(reader);
			JSONObject planets = (JSONObject) b.get(String.valueOf(empireId));
			System.out.println(planets);
			int id = getMostRecentPlanetId(empireId);
			boolean isFirst = false;
			if (id == 0) {
				isFirst = true;
			}
			JSONObject toPut = new JSONObject();
			toPut.put("class_id", classId);
			toPut.put("name", "");
			toPut.put("isCapital", isFirst);
			toPut.put("population", 0);
			if (planets==null) {
				JSONObject toAdd = new JSONObject();
				toAdd.put(id, toPut);
				b.put(String.valueOf(empireId), toAdd);
			}
			else {
				planets.put(String.valueOf(id), toPut);
			}
			Files.write(Paths.get(FILEPATH_PLANETS), b.toString().getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static int getMostRecentPlanetId(int empireId) {
		FileReader reader;
		try {
			reader = new FileReader(FILEPATH_PLANETS);
			JSONParser jsonParser = new JSONParser();
			JSONObject b = (JSONObject) jsonParser.parse(reader);
			JSONObject planetObject = (JSONObject) b.get(String.valueOf(empireId));
			if (planetObject == null) {
				return 0;
			} else {
				return planetObject.size();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		throw new NullPointerException();
	}
	
	public static int getEmpireId(User userIn) {
		FileReader reader;
		try {
			reader = new FileReader(FILEPATH_EMPIRES);
			JSONParser jsonParser = new JSONParser();
			JSONObject b = (JSONObject) jsonParser.parse(reader);
			b = (JSONObject) b.get("empires");
			Set<String> i = b.keySet();
			for (String userId : i) {
				if (userId.equals(userIn.getId())) {
					JSONObject empire = (JSONObject) b.get(userIn.getId());
					return (int)(long)empire.get("id");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public static ArrayList<PlanetInstance> getPlanets(int empireId) {
		ArrayList<PlanetInstance> toReturn = new ArrayList<PlanetInstance>();
		FileReader reader;
		try {
			reader = new FileReader(FILEPATH_PLANETS);
			JSONParser jsonParser = new JSONParser();
			JSONObject b = (JSONObject) jsonParser.parse(reader);
			b = (JSONObject) b.get(String.valueOf(empireId));
			if (b==null) {
				return toReturn;
			}
			Set<String> sets = b.keySet();
			for (String i : sets) {
				JSONObject planetObject = (JSONObject) b.get(i);
				int id = Integer.valueOf(i);
				Integer classId = new Integer(new Long((long) planetObject.get("class_id")).intValue());
				
				
				
				PlanetClass classIn = GamePlanets.PLANET_CLASSES.get(classId);
				String nameIn = (String) planetObject.get("name");
				int populationIn = (int)(long)planetObject.get("population");
				boolean isCapital = (boolean)planetObject.get("isCapital");
				PlanetInstance instance = new PlanetInstance(classIn, id, nameIn, isCapital, populationIn);
				toReturn.add(instance);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return toReturn;
	}
	
	public static void namePlanet(int empireId, int planetId, String name) {
		FileReader reader;
		try {
			reader = new FileReader(FILEPATH_PLANETS);
			JSONParser jsonParser = new JSONParser();
			JSONObject b = (JSONObject) jsonParser.parse(reader);
			JSONObject ber = (JSONObject) b.get(String.valueOf(empireId));
			JSONObject planet = (JSONObject) ber.get(String.valueOf(planetId));
			planet.put("name", name);
			Files.write(Paths.get(FILEPATH_PLANETS), b.toString().getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writeEmpire(JSONObject toWrite, User user) throws IOException, ParseException {
		FileReader reader = new FileReader(FILEPATH_EMPIRES);
		JSONParser jsonParser = new JSONParser();
		JSONObject b = (JSONObject) jsonParser.parse(reader);
		JSONObject empires = (JSONObject) b.get("empires");
		empires.put(user.getId(), toWrite);
		Files.write(Paths.get(FILEPATH_EMPIRES), b.toString().getBytes());
	}

}
