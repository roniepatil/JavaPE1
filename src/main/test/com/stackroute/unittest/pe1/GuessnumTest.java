package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessnumTest {
    Guessnum obj;
    @Before
    public void setUp() throws Exception {
        obj = new Guessnum();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void numberRight() {
        String expectedValue = "less";
        assertEquals(expectedValue,obj.numberRight(25));
    }
}