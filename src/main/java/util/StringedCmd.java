package util;

import main.LegacyClinger;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public abstract class StringedCmd implements ICommand {
	public String id;
	public StringedCmd(String id) {
		LegacyClinger.commands.add(this);
		this.id=id;
	}
	
	@Override
	public void onMessage(MessageReceivedEvent event) {
		if (!event.getMessage().getContentDisplay().startsWith(this.id)) {
			return;
		}
	}
}
