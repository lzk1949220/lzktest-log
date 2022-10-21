package lzktest.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logback {
	private static final Logger LOGGER = LoggerFactory.getLogger(Logback.class);
	
	public static void main(String[] args) {
		  LOGGER.error("error");
          LOGGER.warn("warning");
          LOGGER.info("info");    // 默认的日志级别信息
          LOGGER.debug("debug");
          LOGGER.trace("trace");  // 追踪信息

	}

}
