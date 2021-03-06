package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomjerryTest {
    Tomjerry obj;

    @Before
    public void setUp() throws Exception {
    obj = new Tomjerry();
    }

    @After
    public void tearDown() throws Exception {
    obj=null;
    }

    @Test
    public void isTomOrJerry() {
    String expectedValue = "jerry";
    assertEquals(expectedValue,obj.isTomOrJerry(24));
    }
}