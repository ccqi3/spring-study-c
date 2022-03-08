package com.testcc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qcc
 * @Package com.testcc
 * @Description: TODO
 * @date
 */
public class Testcc {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		UserDao userDao = context.getBean(UserDao.class);
		ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = (UserDao) context1.getBean("user");
		String str = userDao.getUser();
		System.out.println(str);
	}
}
