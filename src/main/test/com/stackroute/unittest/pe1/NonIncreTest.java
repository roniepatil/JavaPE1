package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonIncreTest {
    NonIncre obj;
    @Before
    public void setUp() throws Exception {
        obj = new NonIncre();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void nonIncreasing() {
        String exepectedValue = "4422111";
        assertEquals(exepectedValue,obj.nonIncreasing("4114221"));
    }
}