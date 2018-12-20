package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaplownumspecialTest {
    Caplownumspecial obj;
    @Before
    public void setUp() throws Exception {
        obj = new Caplownumspecial();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void isCapLowNumSpe() {
        assertEquals("uppercase",obj.isCapLowNumSpe('A'));
    }
}