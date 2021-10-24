package com.example.demo.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Employee employee = context.getBean("employeeBean", Employee.class);
        employee.callPet();
        employee.printAboutMe();
        context.close();
    }
}
