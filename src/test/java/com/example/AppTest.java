package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testGreeting() {
        assertEquals("Hello, Maven CI/CD Pipeline!", App.getGreeting());
    }
}

