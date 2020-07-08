package util;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public interface ICommand {
	public void onMessage(MessageReceivedEvent event);
	public String getId();
}
