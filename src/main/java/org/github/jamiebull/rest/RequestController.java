package org.github.jamiebull.rest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class RequestController {

    @RequestMapping("/home")
    public String getHomePage(){
        return "You're home!";
    }
}
