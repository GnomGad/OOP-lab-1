package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String home(){
        return String.format("<ul><li><a href=\"\\hello?name=Eveny\">go to hello</a></li>" +
                "<li><a href=\"\\about\">go to about</a></li>" +
                "<li><a href=\"\\options\">go to options without option</a></li>" +
                "<li><a href=\"\\options?option=s3\">go to options with option</a></li></ul>"
        );
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value= "name", defaultValue = "World") String name){
        return String.format("Hello %s", name);
    }

    @GetMapping("/about")
    public String about(){
        return String.format("About");
    }

    @GetMapping("/options")
    public String options(@RequestParam(value= "option", defaultValue = "") String option){

        if(option.equals(""))
            return  String.format("options");
        return String.format("not an option");
    }
}
