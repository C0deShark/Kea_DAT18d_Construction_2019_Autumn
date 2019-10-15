package edu.kea.andl.cream.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.kea.andl.cream.model.Cream;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
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
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Cream newCream = objectMapper.readValue(body, Cream.class);
            cream.add(newCream);
            return "Successfully created cream, status: 200";
        } catch (IOException e) {
            e.printStackTrace();
            return "I could not parse the body. Did you specify the correct values?";
        }
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
