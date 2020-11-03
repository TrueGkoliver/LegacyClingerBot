package util;

import java.util.Random;

import main.LegacyClinger;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class LegacyClingCmd implements ICommand {

	public LegacyClingCmd() {
		LegacyClinger.commands.add(this);
	}
	public static String toStrong(int string) {
		String tbr = "";
		if (string<10) {
			tbr = "0"+Integer.toString(string);
		}
		else {
			tbr = Integer.toString(string);
		}
		return tbr;
	}
	private static Random rand = new Random();
	public static String getSnapshotName() {
		int year = rand.nextInt(30);
		int week = rand.nextInt(52);
		char letter = (char)(rand.nextInt(26) + 'a');
		String tbr = toStrong(year)+"w"+toStrong(week)+letter;
		return tbr;
	}
	public static String getFutureVersion() {
		return null;
	}
	public static String[] possibleMsg = new String[] {
			"Hello! I like your mod, but I wish you would port it to VERSION.",
			"hello can you please port to VERSION it's the most popular modding version after all",
			"pls port to VERSION pls thnx",
			"can you pls bring this mod to VERSION thanks"
	};
	public static String[] possibleVersions = new String[] {
		"Beta 1.8",
		"Cave Game",
		"1.12.2",
	    "1.11",
	    "1.11.2",
	    "1.10.2",
	    "1.10",
	    "1.9",
	    "1.8.9",
	    "1.8",
	    "1.7.10",
	    "1.7",
	    "1.6.4",
	    "1.6.2",
	    "1.5.2",
	    "1.4",
	    "1.3",
	    "1.2",
	    "1.1",
	    "1.0",
	    "Indev 0.3",
	    "Beta 1.0",
	    "Beta 1.9",
	    "1.16",
		"1.16.1",
		"1.16.2",
		"1.16.3",
		"1.16.4",
		"1.17 (when it releases)"
	};
 	public static String getStringPortMessage() {
 		int fabric = rand.nextInt(9);
 		
 		boolean isFabric = fabric==9;
 		String tbr = "";
 		tbr+=possibleMsg[rand.nextInt(possibleMsg.length)];
 		if (isFabric) {
 			String snpVersion = "Fabric "+getSnapshotName();
 			tbr = tbr.replace("VERSION", snpVersion);
 		} else {
 			tbr = tbr.replace("VERSION", possibleVersions[rand.nextInt(possibleVersions.length)]);
 		}
 		return tbr;
		
	}
	@Override
	public void onMessage(MessageReceivedEvent event) {
		Member user = event.getMember();
		user.getRoles().forEach((role)->{
			if (role.getName().contains("Legacy Clinger")&&!role.getName().contains("The")) {
				System.out.println(role.getName());
				event.getChannel().sendMessage(getStringPortMessage()).queue();
			}
		});
		
	}
	@Override
	public String getId() {
		return null;
	}

}
