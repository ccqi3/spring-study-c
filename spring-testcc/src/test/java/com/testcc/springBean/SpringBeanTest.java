package com.testcc.springBean;

import com.testcc.HelloWorld;
import com.testcc.helloWorld03.HelloIndia;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qcc
 * @Package com.testcc
 * @Description: TODO
 * @date
 */
public class SpringBeanTest {

	@Test
	public void scopeTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorldScope");
		helloWorld.getMessage();
		helloWorld.setMessage("AAAAAAAAAAA");

		HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloWorldScope");
		helloWorld2.getMessage();
	}

	@Test
	public void beanTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorldBean");
		helloWorld.getMessage();
	}

	@Test
	public void beanProcessorTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorldBean");
		helloWorld.getMessage();
	}
	@Test
	public void helloWorld03Test(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans03.xml");
		HelloIndia helloIndia = (HelloIndia) applicationContext.getBean("helloIndia");
		helloIndia.getMessage1();
		helloIndia.getMessage2();
		helloIndia.getMessage3();
	}
}
