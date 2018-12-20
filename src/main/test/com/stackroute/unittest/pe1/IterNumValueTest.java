package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterNumValueTest {
    IterNumValue obj;

    @Before
    public void setUp() throws Exception {
    obj = new IterNumValue();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void repeatNumberNTimes() {
    String expectedValue = "122333";
    assertEquals(expectedValue,obj.repeatNumberNTimes(3));
    }
}