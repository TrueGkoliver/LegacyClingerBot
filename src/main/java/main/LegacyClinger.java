package main;

import java.util.ArrayList;

import javax.security.auth.login.LoginException;

import game.common.planets.classes.GamePlanets;
import game.common.planets.classes.PlanetClass;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import util.GameCommands;
import util.ICommand;
import util.LegacyClingCmd;
import util.SecretInfo;
import util.StringedCmd;

public class LegacyClinger extends ListenerAdapter{
	public static ArrayList<ICommand> commands = new ArrayList<ICommand>();
	private static LegacyClingCmd cmd;
	private static GameCommands.StartEmpireCommands startempire;
	private static GameCommands.GetGovernmentTypesCommand getgovttypes;
	private static GameCommands.ObtainPlanetTypeCommand obtainPlanet;
	private static GameCommands.UpdateCommands update;
	private static GameCommands.CheckOnEmpireCommand checkOnEmpire;
	private static GameCommands.CheckWorlds checkWorldsCommand;
	private static GameCommands.NameWorlds nameWorldsCommand;
	private static GameCommands.CreatePlanetCommand createPlanetCommand;
	private static GameCommands.GetPlanetIdsCommand getPlanetIdsCommand;
	

	public static JDA jda = null;
	public static void main(String[] args) {
		setupCommands();
		System.out.println(commands.get(0));
		System.out.println(commands.get(1));
		try {
			jda = new JDABuilder(SecretInfo.token).build();
		} catch (LoginException e) {
			System.out.println("FAILEDLOGIN");
		}
		jda.addEventListener(new LegacyClinger());
		jda.addEventListener(new Listeners());
		for (ICommand command : commands) {
			System.out.println(command);
		}
		for (PlanetClass planetClass : GamePlanets.PLANET_CLASSES) {
			System.out.println(String.valueOf(GamePlanets.PLANET_CLASSES.indexOf(planetClass)+" : "+planetClass.getName()));
		}
	}
	public static void setupCommands() {
		//cmd = new LegacyClingCmd();
		startempire = new GameCommands.StartEmpireCommands();
		getgovttypes = new GameCommands.GetGovernmentTypesCommand();
		obtainPlanet = new GameCommands.ObtainPlanetTypeCommand();
		update = new GameCommands.UpdateCommands();
		checkOnEmpire = new GameCommands.CheckOnEmpireCommand();
		checkWorldsCommand = new GameCommands.CheckWorlds();
		nameWorldsCommand = new GameCommands.NameWorlds();
		createPlanetCommand = new GameCommands.CreatePlanetCommand();
		getPlanetIdsCommand = new GameCommands.GetPlanetIdsCommand();
	}
	@Override
	public void onReady(ReadyEvent event) {
		System.out.println("Login...");
	}
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		if (event.getAuthor().isBot()) {
			return;
		}
		if (!event.getAuthor().isBot()) {
			for (ICommand command : commands) {
				command.onMessage(event);
			}
		}
	}

}
