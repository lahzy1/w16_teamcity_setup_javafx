package com.example.w16_teamcity_setup_javafx;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void test() {
        //HelloApplication test = new HelloApplication();
        int actual = 5;
        assertEquals(5, actual);
    }
}