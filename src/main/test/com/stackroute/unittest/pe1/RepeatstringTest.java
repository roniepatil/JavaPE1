package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatstringTest {
    Repeatstring obj;
    @Before
    public void setUp() throws Exception {
    obj = new Repeatstring();
    }

    @After
    public void tearDown() throws Exception {
    obj=null;
    }

    @Test
    public void printRepeated() {
    String exepectedValue = "rohititit";
    assertEquals(exepectedValue,obj.printRepeated("rohit",2));
    }
}