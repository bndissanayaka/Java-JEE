package com.wisdom.log4jtest;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jTest {
	static final Logger logger = Logger.getLogger(Log4jTest.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.debug("Hello World! debug message");
		logger.info("Hello World! info message");
		logger.warn("Hello World! warn message");
		logger.error("Hello World! error message");
		logger.fatal("Hello World! fatal message");

	}

}
