package com.example.githubactionsspike;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SampleControllerTest {

    @Autowired
    SampleController sampleController;

    @Test
    public void helloWorldTest() {
        String returnValue = sampleController.printHelloWorld();
        assertEquals("Hello world!", returnValue);
    }
}