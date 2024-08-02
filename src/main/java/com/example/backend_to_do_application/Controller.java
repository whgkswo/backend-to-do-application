package com.example.backend_to_do_application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String welcome (){
        return "Backend To-do Application!";
    }
}
