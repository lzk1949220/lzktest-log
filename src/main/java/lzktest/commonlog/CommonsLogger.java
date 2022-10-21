package lzktest.commonlog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLogger {

	private final static Log logger = LogFactory.getLog(CommonsLogger.class);
	//trace < debug < info < warn < error
	public static void main(String[] args) {
		logger.debug("DEBUG ...");
		logger.info("INFO ...");
		logger.error("ERROR ...");

	}

	
}
