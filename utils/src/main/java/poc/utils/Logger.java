package poc.utils;

import java.util.HashMap;
import java.util.Map;

public class Logger {
	
	private String logLevel;
	private Map<String, Integer> levels = new HashMap<>();
	private String classname;

	public Logger(String classname) {
		this.classname=classname;
		this.logLevel=PropertiesReader.INSTANCE.getLogLevel();
		levels.put("FATAL", 0);
		levels.put("ERROR", 1);
		levels.put("WARN",  2);
		levels.put("INFO",  3);
		levels.put("DEBUG", 4);
		levels.put("TRACE", 5);
		levels.put("ALL",   6);
	}
	
	private void send(String level, String msg){
		if (levels.get(logLevel)>=levels.get(level))
			System.out.println(level+" "+classname+" : "+msg);
	}
	
	public void fatal(String msg) {
		send("FATAL", msg);
	}
	
	public void error(String msg) {
		send("ERROR", msg);
	}
	
	public void warn(String msg) {
		send("WARN", msg);
	}
	
	public void info(String msg) {
		send("INFO", msg);
	}
	
	public void debug(String msg) {
		send("DEBUG", msg);
	}
	
	public void trace(String msg) {
		send("TRACE", msg);
	}
	
	public void all(String msg) {
		send("ALL", msg);
	}
	
}
