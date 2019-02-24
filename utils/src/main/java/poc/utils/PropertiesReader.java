package poc.utils;

import java.util.ResourceBundle;

public class PropertiesReader {
	
	public static final PropertiesReader INSTANCE = new PropertiesReader("app");
	private ResourceBundle rb;
	
	private PropertiesReader(String filename) {
	    rb = ResourceBundle.getBundle(filename);
	}

    public String getLogLevel() {
    	return rb.getString("logLevel");
    }
}
