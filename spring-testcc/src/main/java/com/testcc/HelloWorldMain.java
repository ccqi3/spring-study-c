package com.testcc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author qcc
 * @Package com.testcc
 * @Description: TODO
 * @date
 */
public class HelloWorldMain {
	public static void main(String[] args) {

//		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//		HelloWorld xmlHelloWorld = (HelloWorld) xmlBeanFactory.getBean("helloWorld");
//		xmlHelloWorld.getMessage();

//		FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("//Users/vermouth/IdeaProjects/gitee/sourceCodes/spring-framework/spring-testcc/src/main/resources/beans.xml");
//		HelloWorld helloWorld1 = (HelloWorld) fileSystemXmlApplicationContext.getBean("helloWorld");
//		helloWorld1.getMessage();

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
		helloWorld.getMessage();
		helloWorld.setMessage("AAAAAAAAAAA");

		HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloWorld");
		helloWorld2.getMessage();
	}
}
