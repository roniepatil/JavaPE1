package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RevstringTest {
    Revstring obj;

    @Before
    public void setUp() throws Exception {
    obj = new Revstring();
    }

    @After
    public void tearDown() throws Exception {
    obj = null;
    }

    @Test
    public void reverseString() {
    String exepectedValue = "tihor";
    assertEquals(exepectedValue,obj.reverseString("rohit"));
    }
}