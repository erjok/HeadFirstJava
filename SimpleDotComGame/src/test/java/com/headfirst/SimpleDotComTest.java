package com.headfirst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleDotComTest {
    private SimpleDotCom dotCom;

    @Before
    public void setUp() throws Exception {
        dotCom = new SimpleDotCom();
        int[] locations = {2,3,4};
        dotCom.setLocationCells(locations);
    }

    @Test
    public void shouldHitWhenGuessIsCorrect() throws Exception {
        String result = dotCom.checkYourself("2");

        assertEquals("Hit", result);
    }

    @Test
    public void shouldMissWhenGuessIsNotCorrect() throws Exception {
        String result = dotCom.checkYourself("1");

        assertEquals("Miss", result);
    }

    @Test
    public void shouldBeoneAfterThreeCorrectGuesses() throws Exception {
        dotCom.checkYourself("2");
        dotCom.checkYourself("3");
        String result = dotCom.checkYourself("4");

        assertEquals("Done", result);
    }
}