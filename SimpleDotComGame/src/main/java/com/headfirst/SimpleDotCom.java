package com.headfirst;

public class SimpleDotCom {

    private int[] locationCells;
    private int hitCount;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public ShotResult checkYourself(String userGuess) {
        int target = Integer.parseInt(userGuess);

        for(int cell : locationCells) {
            if (cell == target) {
                hitCount++;
                return hitCount == locationCells.length ? ShotResult.BUSTED : ShotResult.HIT;
            }
        }

        return ShotResult.MISS;
    }
}