package com.example.githubactionsspike;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/")
    String printHelloWorld() {
        return "Hello world!";
    }
}
