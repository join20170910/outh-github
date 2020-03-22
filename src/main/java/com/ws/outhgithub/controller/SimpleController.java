package com.ws.outhgithub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SimpleController {

    @GetMapping("/hello")
    public String hello(Principal principal){
        return "hello , " + principal.getName();
    }
}
