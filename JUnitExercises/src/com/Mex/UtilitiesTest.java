package com.Mex;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class UtilitiesTest {

    private Utilities util;

    @org.junit.Before
    public void setUp(){
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar1() throws Exception {
       // Utilities util = new Utilities();
        char[] output = util.everyNthChar(new char[]{'h', 'e','l','l','o'}, 2);
        assertArrayEquals(new char[]{'e','l'}, output);
    }
    @org.junit.Test
    public void everyNthChar2() throws Exception {
        //Utilities util = new Utilities();
        char[] output2 = util.everyNthChar(new char[]{'h', 'e','l','l','o'}, 8);
        assertArrayEquals(new char[]{'h', 'e','l','l','o'}, output2);

    }

    @org.junit.Test
    public void removePairs1() throws Exception {
       // Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
    }
    @org.junit.Test
    public void removePairs2() throws Exception {
       // Utilities util = new Utilities();
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @org.junit.Test
    public void converter1() throws Exception {
       // Utilities util = new Utilities();
        assertEquals(300, util.converter(10, 5));
        System.out.println("expected 300");
        System.out.println("actual " + util.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter2() throws Exception {
       // Utilities util = new Utilities();
        util.converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLenght() throws Exception {
       // Utilities util = new Utilities();
        assertNull(util.nullIfOddLenght("odd"));
        assertNotNull(util.nullIfOddLenght("even"));

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

}