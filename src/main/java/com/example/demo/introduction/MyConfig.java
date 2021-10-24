package com.example.demo.introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
//@ComponentScan("com.example.demo.introduction")
public class MyConfig {
    @Bean
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Car carBean(){
        return new Car();
    }

    @Bean
    public Employee employeeBean(){
        return new Employee(catBean(),carBean());
    }
}
