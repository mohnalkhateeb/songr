package com.example.songr;

import com.example.songr.controllers.HelloWorldController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    @Test
    public void getHelloWorld() {
        // test hell world route
        HelloWorldController testController = new HelloWorldController();
        assertEquals("Hello World!",
                testController.getHelloWorld(),"You should get Hello World");
    }

    @Test
    public void getCapitalizedString() {
        HelloWorldController testController = new HelloWorldController();
        assertEquals("HELLO WORLD",
                testController.getCapitalizedString("hello world"),
                "You should get Hello World capitalized");
    }

}
