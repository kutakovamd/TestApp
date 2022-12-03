package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class testHW10Test {
    @Test
    public void test1(){
        int answer = testHW10.sum();
        assertEquals(58,answer);
    }

    @Test
    public void test2(){
        int answer = testHW10.sum();
        assertEquals(72,answer);
    }

}