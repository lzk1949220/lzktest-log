package lzktest.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {
	 // 定义日志记录器对象
    public static final Logger LOGGER = LogManager.getLogger(Log4j2.class);
    //OFF、FATAL、ERROR、WARN、INFO、DEBUG、TRACE、ALL
    
	public static void main(String[] args) {
		// 日志消息输出
		for (int i = 0; i < 1000000; i++) {
            LOGGER.error("error");
            LOGGER.warn("warning");
            LOGGER.info("info");    // 默认的日志级别信息
            LOGGER.debug("debug");
            LOGGER.trace("trace");  // 追踪信息
        }


	}

}
