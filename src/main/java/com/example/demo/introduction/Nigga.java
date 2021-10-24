package com.example.demo.introduction;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Nigga implements Pet{
    @Override
    public void say() {
        System.out.println("Нигга-Нигга-Нигга");
    }

    public Nigga(){
        System.out.println(String.format("Nigga создан"));
    }
    @Override
    @PostConstruct
    public void init(){
        System.out.println(String.format("Проинициализирован Nigga"));
    }

    @Override
    @PreDestroy
    public void destroy(){
        System.out.println(String.format("Nigga убит"));
    }
}
