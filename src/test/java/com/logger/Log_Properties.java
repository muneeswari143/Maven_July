package com.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log_Properties {
	public static Logger log=Logger.getLogger(Log_Properties.class);
public static void main(String[] args) {
	PropertyConfigurator.configure("log4j.properties");
	log.debug("DEBUG");
	log.info("information");
	log.warn("warning");
	log.error("error");
	log.fatal("fatal");
}
}
