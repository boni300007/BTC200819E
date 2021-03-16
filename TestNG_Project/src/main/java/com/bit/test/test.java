package com.bit.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Before;
import org.testng.annotations.Test;

public class test {
	
	Logger log = Logger.getLogger(test.class);
	@Before 
	public void start() {
		DOMConfigurator.configure("log4.xml");
	}
	@Test
	public void test1() {
		log.fatal("this is fatal");
		log.error("this is error");
		log.warn("this warn");
		log.info("this is info");
		log.debug("this is dehug");
		log.trace("this is trace");
	}

}
