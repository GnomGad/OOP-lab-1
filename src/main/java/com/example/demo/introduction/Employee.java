package com.example.demo.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("employeeBean")
public class Employee {
    private String name;
    private int age;
    private Pet pet;
    private Car car;

    @Value("${employee.name}")
    public void setName(String name){
        this.name = name;
    }

    @Value("${employee.age}")
    public void setAge(int age){
        this.age = age;
    }

    @Qualifier("dog")
    public void setPet(Pet pet){
        this.pet = pet;
    }

    @Qualifier("car")
    public void setCar(Car car){
        this.car = car;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public Employee(Pet pet, Car car){
        System.out.println(String.format("Работник создан"));
        this.pet = pet;
        this.car = car;
    }

    public void printAboutMe(){
        System.out.println(String.format("Я %s, мне %d", name, age));
        printCarInfo();
        callPet();
    }

    public void printCarInfo(){
        System.out.println(String.format("Машина %s с пробегом %dкм",car.getFullName(),car.getMileage()));
    }

    public void callPet(){
        System.out.println("Мой питомец говорит");
        pet.say();
    }

    @PostConstruct
    public void init(){
        System.out.println(String.format("Работник %s проициниализирован", name));
    }

    @PreDestroy
    public void destroy(){
        System.out.println(String.format("Работник %s убит", name));
    }
}
