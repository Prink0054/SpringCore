package com.java.SpringCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
ApplicationContext applicationContext  =	new ClassPathXmlApplicationContext("com/java/SpringCore/collections/collectionConfig.xml");

	Emp emp = (Emp) applicationContext.getBean("emp");
	System.out.println(emp);

}
}
