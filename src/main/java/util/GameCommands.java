package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import game.common.government.Empire;
import game.common.government.GovernmentType;
import game.common.planets.PlanetInstance;
import game.common.planets.classes.GamePlanets;
import game.common.planets.classes.PlanetClass;
import main.LegacyClinger;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed.Field;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
public class GameCommands {
	public static class StartEmpireCommands extends StringedCmd implements ICommand {
		
		
 		public StartEmpireCommands() {
			super("=startempire");
			this.id = "=startempire";
		}
        
		@Override
		public void onMessage(MessageReceivedEvent event) {
			String[] args = event.getMessage().getContentDisplay().split("\\s");
			if (args[0].contentEquals(this.id)) {
				GovernmentType type = GovernmentType.GovernmentTypes.TYPES.get(Integer.valueOf(args[1]));
				String empirename = "";
				int id = 0;
				for (int i=0; i<args.length; i++) {
					if (i>=2) {
						empirename += args[i];
						empirename+=" ";
					}
				}
				try {
					id = ParserUtils.checkForAndDeleteEmpires(event.getAuthor());
				} catch (IOException | ParseException e1) {
					e1.printStackTrace();
				}
				JSONObject obj = new JSONObject();
				obj.put("name", empirename);
				obj.put("govid", Integer.valueOf(args[1]));
				obj.put("description", "");
				 
				try {
					if (id==0) {
						id = ParserUtils.getMostUnusedID();
					}
				} catch (JSONException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				obj.put("id", id);
				try {
					ParserUtils.writeEmpire(obj, event.getAuthor());
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				String trueMessage = "**Created New Empire**\n";
				trueMessage+="Name: "+empirename+"\n";
				trueMessage+="Government Type: "+type.getName()+"\n";
				trueMessage+="Ruler: "+event.getAuthor().getName()+"\n";
				trueMessage+="Numerical ID: "+String.valueOf(id);
				event.getChannel().sendMessage(trueMessage).queue();
			}
			
		}
		@Override
		public String getId() {
			return this.id;
		}
	}
	public static class CheckOnEmpireCommand extends StringedCmd {

		public CheckOnEmpireCommand() {
			super("=checkEmpire");
		}

		@Override
		public String getId() {
			return "=checkEmpire";
		}
		
		@Override
		public void onMessage(MessageReceivedEvent event) {
			String[] args = event.getMessage().getContentDisplay().split("\\s");
			EmbedBuilder builder = new EmbedBuilder();
			if (args[0].contentEquals(this.id)) {
				Empire tbd = null;
				builder.setTitle("Empire Stats");
				try {
					tbd = ParserUtils.serializeEmpireFromId(Integer.valueOf(args[1]));
				} catch (Exception e) {
					e.printStackTrace();
					event.getChannel().sendMessage("Sorry, something went wrong.");
					return;
				}
				builder.addField(new Field("Name", tbd.getName(), true));
				builder.addField(new Field("Government Type", tbd.getGovtTypeName(), true));
				builder.addField("Capital System", "undefined", true);
				
				event.getChannel().sendMessage(builder.build()).queue();
				
				
			}
		}
	}
	
	
	public static class ObtainPlanetTypeCommand extends StringedCmd {
		public static HashMap<User, Integer> cooldowns = new HashMap<User, Integer>();
		public ObtainPlanetTypeCommand() {
			super("=obtainplanet");
		}

		@Override
		public String getId() {
			return "=obtainplanet";
		}

		@Override
		public void onMessage(MessageReceivedEvent event) {
			String[] args = event.getMessage().getContentDisplay().split("\\s");
			String b = "Successfully obtained 1 new ";
			if (args[0].contentEquals(this.id)&&cooldowns.containsKey(event.getAuthor())) {
				event.getChannel().sendMessage("Wait for the cooldown to end. You have "+String.valueOf(cooldowns.get(event.getAuthor())+" messages left.")).queue();
			}
			else if (args[0].contentEquals(this.id)) {
				PlanetClass classIn = GamePlanets.getRandomClassWithWeight();
				int id = GamePlanets.PLANET_CLASSES.indexOf(classIn);
				String name = classIn.getName();
				b+=name;
				b+="!";
				int numeral = classIn.rarityNumber;
				String rarity = "";
				rarity = classIn.getRarity();
				b+=" (";
				b+=rarity;
				b+=")";
				int empireId = ParserUtils.getEmpireId(event.getAuthor());
				ParserUtils.writePlanet(id, empireId);
				cooldowns.put(event.getAuthor(), 25);
				event.getChannel().sendMessage(b).queue();
			}
		}
		
	}
	public static class NameWorlds extends StringedCmd {

		public NameWorlds() {
			super("=nameWorld");
		}
		
		@Override
		public void onMessage(MessageReceivedEvent event) {
			String[] args = event.getMessage().getContentDisplay().split("\\s");
			if (!args[0].equals(this.id)) {
				return;
			}
			String planetName = "";
			for (int i=0; i<args.length; i++) {
				if (i>=2) {
					planetName += args[i];
					planetName+=" ";
				}
			}
			ParserUtils.namePlanet(ParserUtils.getEmpireId(event.getAuthor()), Integer.valueOf(args[1]), planetName);
			event.getChannel().sendMessage("Planet Renamed.").queue();
		}
		
		@Override
		public String getId() {
			return "=nameWorld";
		}
		
	}
	public static class CheckWorlds extends StringedCmd {

		public CheckWorlds() {
			super("=checkWorlds");
		}
		@Override
		public void onMessage(MessageReceivedEvent event) {
			String[] args = event.getMessage().getContentDisplay().split("\\s");
			if (!args[0].equals(this.id)) {
				return;
			}
			ArrayList<PlanetInstance> instance = ParserUtils.getPlanets(Integer.valueOf(args[1]));
			Empire empireIn = null;
			try {
				empireIn = ParserUtils.serializeEmpireFromId(ParserUtils.getEmpireId(event.getAuthor()));
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			String toReturn = "**Planets of the "+empireIn.getName()+"**\n";
			for (PlanetInstance instanceIn : instance) {
				toReturn+="`"+String.valueOf(instanceIn.id)+"`: "+instanceIn.name+" ("+instanceIn.classIn.getName()+")";
				if (instanceIn.capital) {
					toReturn+=" **Capital Planet**";
				}
				toReturn+="\n";
			}
			event.getChannel().sendMessage(toReturn).queue();
		}
		@Override
		public String getId() {
			return "=checkWorlds";
		}
	}
	
	
	public static class UpdateCommands implements ICommand {
		public UpdateCommands() {
			LegacyClinger.commands.add(this);
		}
		@Override
		public void onMessage(MessageReceivedEvent event) {
			if (ObtainPlanetTypeCommand.cooldowns.containsKey(event.getAuthor())) {
				int get = ObtainPlanetTypeCommand.cooldowns.get(event.getAuthor());
				get--;
				if (get<=0) {
					ObtainPlanetTypeCommand.cooldowns.remove(event.getAuthor());
				} else {
					ObtainPlanetTypeCommand.cooldowns.put(event.getAuthor(), get);
				}
			}
		}

		@Override
		public String getId() {
			return null;
		}
		
	}
	
	public static class GetGovernmentTypesCommand extends StringedCmd {

		public GetGovernmentTypesCommand() {
			super("=governmenttypes");
		}

		@Override
		public String getId() {
			return "=governmenttypes";
		}
		@Override
		public void onMessage(MessageReceivedEvent event) {
			String[] args = event.getMessage().getContentDisplay().split("\\s");
			String b = "";
			if (args[0].contentEquals(this.id)) {
				for (int i=0; i<GovernmentType.GovernmentTypes.TYPES.size(); i++) {
					b += String.valueOf(i) + ": ";
					b += GovernmentType.GovernmentTypes.TYPES.get(i).getName()+"\n";
				}
				event.getChannel().sendMessage("**Government Types**:\n"+b).queue();
			}
		}
		
	}
	
	public static class CreatePlanetCommand extends StringedCmd {

		public CreatePlanetCommand() {
			super("=createplanet");
		}
		
		@Override
		public void onMessage(MessageReceivedEvent event) {
			String[] args = event.getMessage().getContentDisplay().split("\\s");
			if (!args[0].equals(this.id)) {
				return;
			}
			if (!ParserUtils.getCheats(event.getAuthor())) {
				event.getChannel().sendMessage("You do not have cheat mode!").queue();
				return;
			}
			int classId = Integer.valueOf(args[1]);
			ParserUtils.writePlanet(classId, ParserUtils.getEmpireId(event.getAuthor()));
			event.getChannel().sendMessage("One new "+GamePlanets.PLANET_CLASSES.get(classId).getName()+" has been cheated in!").queue();
		}
		
		@Override
		public String getId() {
			return "=createplanet";
		}
	}

	public static class GetPlanetIdsCommand extends StringedCmd {

		public GetPlanetIdsCommand() {
			super("=planetClasses");
		}

		@Override
		public void onMessage(MessageReceivedEvent event) {
			String[] args = event.getMessage().getContentDisplay().split("\\s");
			if (!args[0].equals(this.id)) {
				return;
			}
			String letsGetRegex = "**ID of Planet Classes**\n";
			for (int i=0; i<GamePlanets.PLANET_CLASSES.size(); i++) {
				PlanetClass classIn = GamePlanets.PLANET_CLASSES.get(i);
				letsGetRegex+=String.valueOf(i)+": "+classIn.getName()+"\n";
				if (letsGetRegex.length()>=1800) {
					event.getChannel().sendMessage(letsGetRegex).queue();
					letsGetRegex = "";
				}
			}
			event.getChannel().sendMessage(letsGetRegex).queue();
		}

		@Override
		public String getId() {
			return "=planetClasses";
		}
	}
	
 }
