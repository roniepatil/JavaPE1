package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddNumWhiteSpaceTest {
    AddNumWhiteSpace addnumwhitespace;
    @Before
    public void setUp() throws Exception {
        addnumwhitespace= new AddNumWhiteSpace();
    }

    @After
    public void tearDown() throws Exception {
        addnumwhitespace=null;
    }

    @Test
    public void sumOfNumber() {
        String realValue = "12 18";
        int expectedValue = 30;
        assertEquals(expectedValue,addnumwhitespace.sumOfNumber(realValue));
    }
}