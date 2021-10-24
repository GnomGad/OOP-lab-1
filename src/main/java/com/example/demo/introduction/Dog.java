package com.example.demo.introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements Pet{

    @Override
    public void say() {
        System.out.println("Гав-гав");
    }

    public Dog(){
        System.out.println(String.format("Dog создан"));
    }

    @Override
    @PostConstruct
    public void init(){
        System.out.println(String.format("Проинициализирован Dog"));
    }

    @Override
    @PreDestroy
    public void destroy(){
        System.out.println(String.format("Dog убит"));
    }
}
