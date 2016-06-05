package com.headfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");

        try
        {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            String input = reader.readLine();
            return  input;
        }
        catch (IOException e)
        {
            System.out.println("An error occurred: " + e);
            return null;
        }
    }

    public void writeLine(String text) {
        System.out.println(text);
    }
}
