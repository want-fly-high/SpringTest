package com.hntest.bean;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class Work2Test extends TestCase {
	ApplicationContext context = null;
	protected void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void test() {
		Printer printer = (Printer) context.getBean("printer");
		printer.print();
	}
	
}