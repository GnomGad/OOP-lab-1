package com.example.demo.introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Car {
    private String fullName;
    private int mileage;

    @Value("${car.fullName}")
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    @Value("${car.milleage}")
    public void setMileage(int mileage){
        this.mileage = mileage;
    }


    public String getFullName(){
        return fullName;
    }

    public int getMileage(){
        return mileage;
    }


    public Car(){
        System.out.println(String.format("Машина создан"));
    }
    @PostConstruct
    public void init(){
        System.out.println(String.format("Проинициализирована машина с именем %s",fullName));
    }
    @PreDestroy
    public void destroy(){
        System.out.println(String.format("Попала на свалку %s", fullName));
    }
}
