package com.theironyard.clt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {
        // write your code here
        HashMap<String, ArrayList<Country>> map = new HashMap<>();
        System.out.println("Please enter a letter for the search.");

        Scanner fileScanner = new Scanner("countries.txt");

        String key = null;
        while (fileScanner.hasNext()) {

            String line = fileScanner.nextLine();
            String[] columns = line.split("\\|");
            Country section = new Country(columns[0], columns[1]);
            key = String.valueOf(section.name.toUpperCase().charAt(0));
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(section);
        }
        //write new file with key name
        //fill with array list
        //close file

        Scanner consoleScanner = new Scanner(System.in);
        String letter = consoleScanner.nextLine().toUpperCase();


        File f = new File("%s_.txt", letter);

        FileWriter fw = new FileWriter(f);

        fw.write(map.get(letter));
    }
}
