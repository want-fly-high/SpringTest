package com.hntest.bean;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class Work1Test extends TestCase {
	ApplicationContext context = null;
	protected void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void test() {
		Person personZg = (Person) context.getBean("personZg");
		personZg.say();
		Person personRod = (Person) context.getBean("personRod");
		personRod.say();
	}
	
	

}
