package guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String hello(){
        System.out.println("Hello");
        return "Hello";
    }
}
