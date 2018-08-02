package com.deloitte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.pojo.JavaCollection;

public class MainClass {
	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("CollectionBean.xml");
	JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

    jc.getAddressList();
    jc.getAddressSet();
    jc.getAddressMap();
    jc.getAddressProp();
}
	
}