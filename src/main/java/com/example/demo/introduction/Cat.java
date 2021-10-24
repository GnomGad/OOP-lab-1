package com.example.demo.introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Cat implements  Pet{
    @Override
    public void say() {
        System.out.println("Мяу-Мяу");
    }

    public Cat(){
        System.out.println(String.format("Кот создан"));
    }

    @Override
    @PostConstruct
    public void init(){
        System.out.println(String.format("Проинициализирован кот"));
    }
    @Override
    @PreDestroy
    public void destroy(){
        System.out.println(String.format("Кот убит"));
    }

}
