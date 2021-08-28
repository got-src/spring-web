package com.sheldonnofer.springweb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GreetingController {

    @GetMapping("/api/greeting/{id}")
    public Greeting getGreeting(@PathVariable int id) {
        var greeting = new Greeting();
        greeting.setId(id);
        greeting.setValue("Hello from controller");
        return greeting;
    }

    @GetMapping("/api/greetings")
    public ArrayList<Greeting> getGreetings() {
        var greeting1 = new Greeting();
        greeting1.setId(1);
        greeting1.setValue("Hello from controller");
        var greeting2 = new Greeting();
        greeting2.setId(2);
        greeting2.setValue("Hello from java");
        var list = new ArrayList<Greeting>();
        list.add(greeting1);
        list.add(greeting2);
        return list;
    }
}
