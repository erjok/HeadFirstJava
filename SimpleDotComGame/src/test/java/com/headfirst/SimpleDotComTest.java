package com.headfirst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleDotComTest {
    private SimpleDotCom dotCom;

    @Before
    public void setUp() throws Exception {
        dotCom = new SimpleDotCom();
    }

    @Test
    public void shouldHitWhenGuessIsCorrect() throws Exception {
        int[] locations = {2,3,4};
        dotCom.setLocationCells(locations);

        String result = dotCom.checkYourself("2");

        assertEquals("Hit", result);
    }
}