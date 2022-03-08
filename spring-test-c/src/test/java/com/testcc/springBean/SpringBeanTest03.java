package com.testcc.springBean;

import com.testcc.helloWorld03.HelloIndia;
import com.testcc.helloWorld03.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qcc
 * @Package com.testcc
 * @Description: TODO
 * @date
 */
public class SpringBeanTest03 {
	@Test
	public void helloWorld03Test(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans03.xml");

		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
		helloWorld.getMessage1();
		helloWorld.getMessage2();

		HelloIndia helloIndia = (HelloIndia) applicationContext.getBean("helloIndia");
		helloIndia.getMessage1();
		helloIndia.getMessage2();
		helloIndia.getMessage3();
	}
}
