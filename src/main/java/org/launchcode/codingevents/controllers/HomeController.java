package org.launchcode.codingevents.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping
    public String index() {
        return "index";
    }


}
