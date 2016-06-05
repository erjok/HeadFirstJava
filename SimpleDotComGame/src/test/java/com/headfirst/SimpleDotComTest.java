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
        ShotResult result = dotCom.checkYourself("2");

        assertEquals(ShotResult.HIT, result);
    }

    @Test
    public void shouldMissWhenGuessIsNotCorrect() throws Exception {
        ShotResult result = dotCom.checkYourself("1");

        assertEquals(ShotResult.MISS, result);
    }

    @Test
    public void shouldBeBustedAfterThreeCorrectGuesses() throws Exception {
        dotCom.checkYourself("2");
        dotCom.checkYourself("3");
        ShotResult result = dotCom.checkYourself("4");

        assertEquals(ShotResult.BUSTED, result);
    }
}