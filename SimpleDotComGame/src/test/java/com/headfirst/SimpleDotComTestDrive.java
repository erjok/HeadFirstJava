package com.headfirst;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dotCom = new SimpleDotCom();
        int[] locations = {2,3,4};
        dotCom.setLocationCells(locations);
        String userGuess = "2";
        String actual = dotCom.checkYourself(userGuess);

        String testResult = actual.equals("Hit") ? "Passed" : "Failed";
        System.out.println(testResult);
    }
}
