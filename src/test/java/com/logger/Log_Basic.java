package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log_Basic {
public static Logger log=Logger.getLogger(Log_Basic.class);
	public static void main(String[] args) {
//Factory Design pattern
		BasicConfigurator.configure();
		log.debug("DEBUG");
		log.info("information");
		log.warn("warining");
		log.error("error");
		log.fatal("fatal");
	}
}
