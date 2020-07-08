package game.common.government;

import net.dv8tion.jda.api.entities.User;

public class Empire {
	public String name;
	public GovernmentType govttype;
	public String description;
	public User author;
	public Empire(String name, GovernmentType type) {
		this.name = name;
		this.govttype = type;
	}
	public String getName() {
		return name;
	}
	public String getGovtTypeName() {
		return govttype.getName();
	}

}
