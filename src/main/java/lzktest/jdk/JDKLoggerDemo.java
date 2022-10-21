package lzktest.jdk;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDKLoggerDemo {

	public static Logger logger = Logger.getLogger(JDKLoggerDemo.class.toString());
	
	static {
		Handler handler = new ConsoleHandler();
		handler.setLevel(Level.ALL);
		logger.addHandler(handler);
	}
	
	
	public static void main(String[] args) {
		JDKLoggerDemo logdemo = new JDKLoggerDemo();
		logdemo.log();
		
	}
	
	private void log() {
		logger.setLevel(Level.INFO) ; 
		logger.finest("finest"); 
		logger.finer("finer"); 
		logger.fine("fine"); 
		logger.config("config");  
		logger.info("info");
		logger.warning("warning"); 
		logger.severe("severe"); 
	}

}
