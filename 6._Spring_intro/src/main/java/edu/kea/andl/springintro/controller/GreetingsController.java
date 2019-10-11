package edu.kea.andl.springintro.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingsController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        // String newline = System.getProperty("line.separator");
        return "Welcome to the greetings API version 1.0.0";
    }

    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public String greetings(@RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return "Who are you?";
        } else {
            return "Hello " + name;
        }
    }

    @RequestMapping(value = "/greetings/{personId}", method = RequestMethod.GET)
    public String mingleWithPerson(@PathVariable Integer personId) {
        switch (personId) {
            case 0: return "Niki";
            case 1: return "Rasmus";
            case 2: return "Mathias";
            case 3: return "Jeppe";
            case 4: return "Khoi";
            default: return "Anders";
        }
    }

}
