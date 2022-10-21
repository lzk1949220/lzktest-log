package lzktest.self4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Self4j {

	    private static final Logger LOGGER= LoggerFactory.getLogger(Self4j.class);

	    
		public static void main(String[] args) {
			// 日志消息输出
			for (int i = 0; i < 10000; i++) {
	            LOGGER.error("error");
	            LOGGER.warn("warning");
	            LOGGER.info("info");    // 默认的日志级别信息
	            LOGGER.debug("debug");
	            LOGGER.trace("trace");  // 追踪信息
	        }


		}

}
