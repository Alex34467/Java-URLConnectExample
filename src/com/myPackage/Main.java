package com.myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Main class
public class Main
{
    // main method.
    public static void main(String[] args) throws IOException
    {
        // Input.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input URL: ");
        String input = reader.readLine();

        // Connection.
        if (Connection.connect(input)) System.out.println("Connection successful.");
        else System.out.println("Connection error.");
    }
}
