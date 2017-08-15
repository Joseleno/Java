package santos.joseleno.enumeration;

public enum Tournee {
	MATIN("matin"),
	SOIR("soir"),
	NUIT("nuit");
	
	private String description;
	
	private Tournee(String description) {
		// TODO Auto-generated constructor stub
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

}
