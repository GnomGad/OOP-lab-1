package com.example.demo.introduction;

public class Employee {
    private String name;
    private int age;
    private Pet pet;
    private Car car;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setPet(Pet pet){
        this.pet = pet;
    }

    public void setCar(Car car){
        this.car = car;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
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
}
