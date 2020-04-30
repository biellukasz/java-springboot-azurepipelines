package com.example.javaspringbootazurepipelines;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value="/api", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getMessage(){
        return "Hello from Spring Booot";
    }
}
