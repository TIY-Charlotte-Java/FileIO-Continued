package com.theironyard.clt;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {
	// write your code here
        HashMap<String, ArrayList<Country>> map;
        System.out.println("Please enter a letter for the search.");

        Scanner consoleScanner = new Scanner(System.in);

        Scanner fileScanner = new Scanner("countries.txt");

        while (fileScanner.hasNext()) {

            String line = fileScanner.nextLine();
            String[] columns = line.split("\\|");

        }

    }
}
