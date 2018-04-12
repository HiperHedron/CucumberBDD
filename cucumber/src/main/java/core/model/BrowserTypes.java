package core.model;

public enum BrowserTypes {

	CHROME("chrome"), FIREFOX("firefox"), EDGE("edge"), OPERA("opera");

	final String name;

	BrowserTypes(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

}
