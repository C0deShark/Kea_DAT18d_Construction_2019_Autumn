package edu.kea.andl.cream.controller;

import edu.kea.andl.cream.model.Cream;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CreamController {
    ArrayList<Cream> cream = new ArrayList<>();

    @RequestMapping(value = "/cream", method = RequestMethod.GET)
    public String getCream() {
        String response = "";
        String newLine = "\r\n";
        for (Cream c : cream) {
            response += c.name + newLine;
        }
        return response;
    }

    @RequestMapping(value = "/cream", method = RequestMethod.POST)
    public String postCream(@RequestBody String body) {
        return body;
    }

    @RequestMapping(value = "/cream/{id}", method = RequestMethod.DELETE)
    public String deleteCream(@PathVariable int id) {
        if (id >= 0 && id < cream.size()) {
            cream.remove(id);
            return "Cream deleted";
        } else {
            return "Cream was not deleted, out of bounds.";
        }
    }
}
