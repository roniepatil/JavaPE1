package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConorvoTest {
    Conorvo obj;
    @Before
    public void setUp() throws Exception {
        obj = new Conorvo();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void checkCharacter() {
        String expextedValue = "vowel";
        assertEquals(expextedValue,obj.checkCharacter('e'));
    }
}