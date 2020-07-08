package game.common.government;

import java.util.ArrayList;

public class GovernmentType {
	String name;
	public GovernmentType(String name) {
		this.name = name;
		GovernmentTypes.TYPES.add(this);
	}
	public String getName() {
		return name;
	}
	public static class GovernmentTypes {
		public static final ArrayList<GovernmentType> TYPES = new ArrayList<GovernmentType>();
		
		public static final GovernmentType REPRESENTATIVE_DEMOCRACY = new GovernmentType("Representative Democracy");
		public static final GovernmentType PLUTOCRATIC_AUTOCRACY = new GovernmentType("Plutocratic Autocracy");
		public static final GovernmentType CONSTITUTIONAL_DICTATORSHIP = new GovernmentType("Constitutional Dictatorship");
		public static final GovernmentType DESPOTIC_EMPIRE = new GovernmentType("Despotic Empire");
		public static final GovernmentType ELECTIVE_MONARCHY = new GovernmentType("Elective Monarchy");
		public static final GovernmentType ENLIGHTENED_MONARCHY = new GovernmentType("Enlightened Monarchy");
		public static final GovernmentType FEUDAL_EMPIRE = new GovernmentType("Feudal Empire");
		public static final GovernmentType COMMUNAL_PARITY = new GovernmentType("Communal Parity");
		public static final GovernmentType THEOCRATIC_REPUBLIC = new GovernmentType("Theocratic Republic");
		public static final GovernmentType THEOCRATIC_OLIGARCHY = new GovernmentType("Theocratic Oligarchy");
		public static final GovernmentType THEOCRATIC_MONARCHY = new GovernmentType("Theocratic Monarchy");
		
		public static final GovernmentType DIVINE_EMPIRE = new GovernmentType("Divine Empire");
		public static final GovernmentType CELESTIAL_EMPIRE = new GovernmentType("Celestial Empire");
		public static final GovernmentType HOLY_TRIBUNAL = new GovernmentType("Holy Tribunal");
		public static final GovernmentType MILITARY_COMMISSARIAT = new GovernmentType("Miliary Commissariat");
		public static final GovernmentType MILITARY_JUNTA = new GovernmentType("Military Junta");
		public static final GovernmentType MILITARY_DICTATORSHIP = new GovernmentType("Military Dictatorship");
		public static final GovernmentType STAR_EMPIRE = new GovernmentType("Star Empire");
	
		public static final GovernmentType ASSEMBLY_OF_CLANS = new GovernmentType("Assembly of Clans");
		public static final GovernmentType WAR_COUNCIL = new GovernmentType("War Council");
		public static final GovernmentType MARTIAL_DICTATORSHIP = new GovernmentType("Martial Dictatorship");
		public static final GovernmentType MARTIAL_EMPIRE = new GovernmentType("Martial Empire");
		public static final GovernmentType CITIZEN_REPUBLIC = new GovernmentType("Citizen Republic");
		public static final GovernmentType CITIZEN_STRATOCRACY = new GovernmentType("Citizen Stratocracy");
		public static final GovernmentType MORAL_DEMOCRACY = new GovernmentType("Moral Democracy");
		public static final GovernmentType IRENIC_BUREAUCRACY = new GovernmentType("Irenic Bureaucracy");
		public static final GovernmentType IRENIC_DICTATORSHIP = new GovernmentType("Irenic Dictatorship");
		public static final GovernmentType IRENIC_MONARCHY = new GovernmentType("Irenic Monarchy");
		public static final GovernmentType DIRECT_DEMOCRACY = new GovernmentType("Direct Democracy");
		public static final GovernmentType EXECUTIVE_COMMITEE = new GovernmentType("Executive Commitee");
		public static final GovernmentType TOTALITARIAN_REGIME = new GovernmentType("Totalitarian Regime");
		
		public static final GovernmentType DESPOTIC_HEMEGONY = new GovernmentType("Despotic Hemegony");
		public static final GovernmentType SCIENCE_DIRECTORATE = new GovernmentType("Science Directorate");
		public static final GovernmentType ILLUMINATED_AUTOCRACY = new GovernmentType("Illuminated Autocracy");
		public static final GovernmentType PURITY_ASSEMBLY = new GovernmentType("Purity Assembly");
		public static final GovernmentType PURIFICATION_COMMITEE = new GovernmentType("Purification Commitee");
		public static final GovernmentType PURITY_ORDER = new GovernmentType("Purity Order");
		public static final GovernmentType BLOOD_COURT = new GovernmentType("Blood Court");
		public static final GovernmentType BANDIT_COMMUNE = new GovernmentType("Bandit Commune");
		public static final GovernmentType BANDIT_KINGDOM = new GovernmentType("Bandit Kingdom");
		public static final GovernmentType MEGACORPORATION = new GovernmentType("Megacorporation");
		public static final GovernmentType TRADE_LEAGUE = new GovernmentType("Trade League");
		public static final GovernmentType MEGACHURCH = new GovernmentType("Megachurch");
		public static final GovernmentType CRIMINAL_SYNDICATE = new GovernmentType("Criminal Syndicate");
		public static final GovernmentType SUBVERSIVE_CULT = new GovernmentType("Subversive Cult");
		public static final GovernmentType COLLECTIVE_CONSIOUSNESS = new GovernmentType("Collective Consiousness");
		public static final GovernmentType RAVENOUS_HIVE = new GovernmentType("Ravenous Hive");
		
		public static final GovernmentType ARTIFICIAL_INTELLIGENCE_NETWORK = new GovernmentType("Artifical Intellegence Network");
		public static final GovernmentType ROGUE_DEFENSE_SYSTEM = new GovernmentType("Rogue Defense System");
		public static final GovernmentType AUTONOMOUS_SERVICE_GRID = new GovernmentType("Autonomous Service Grid");
		public static final GovernmentType CATALOG_INDEX = new GovernmentType("Catalog Index");
		public static final GovernmentType INTELLEGENT_RESEARCH_LINK = new GovernmentType("Intellegent Research Link");
		public static final GovernmentType INDUSTRIAL_PRODUCTION_CORE = new GovernmentType("Industrial Production Core");
		
	}

}
