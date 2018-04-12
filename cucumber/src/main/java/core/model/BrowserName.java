package core.model;

public enum BrowserName {
	
	CHROME("chrome"), FIREFOX("firefox"), EDGE("edge"), OPERA("opera");
	
	final String name;
	
	BrowserName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

}

