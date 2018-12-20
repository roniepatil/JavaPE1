package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome obj;
    @Before
    public void setUp() throws Exception {
    obj = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    obj=null;
    }

    @Test
    public void isPalindrome() {
    boolean exepectedValue = true;
    assertEquals(exepectedValue,obj.isPalindrome(12321));
    }
}