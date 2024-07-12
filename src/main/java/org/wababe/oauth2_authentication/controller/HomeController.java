package org.wababe.oauth2_authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "OAUTH2_AUTHENTICATION";
    }

    @GetMapping("/test")
    public String test(){
        return "You are currently logged in";
    }
}
