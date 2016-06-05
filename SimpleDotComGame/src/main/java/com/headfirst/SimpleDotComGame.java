package com.headfirst;

public class SimpleDotComGame {
    private Console console;
    private SimpleDotCom dotCom;
    private int boardSize = 10;
    private int turn = 0;

    public  SimpleDotComGame() {
        console = new Console();
        dotCom = new SimpleDotCom();
    }

    public void run() {
        int randomIndex = (int)(Math.random() * (boardSize - 3));
        int[] locations = { randomIndex, randomIndex + 1, randomIndex + 2 };
        dotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            String guess = console.getUserInput("Input number");
            ShotResult result = dotCom.checkYourself(guess);
            System.out.println(result);
            turn++;

            if (result == ShotResult.BUSTED)
                isAlive = false;
        }

        System.out.printf("You have used %d turns", turn);
    }
}
