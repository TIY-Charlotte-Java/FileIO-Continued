package com.theironyard.clt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by mac on 4/12/16.
 */
public class Country {



    public final class CountryDataFile implements Country {
        private ArrayList<Country> countries = null;
        private Path countriesPath = null;
        private File countriesFile = null;

        private final String FIELD_SEP = " ";

        public CountryDataFile()
        {
            countriesPath = Paths.get("countries.txt");
            countriesFile = countriesPath.toFile();
            countries = this.getCountries();

        }

        @Override
        public ArrayList<Country> getCountries()
        {

            //if the countries file has already been read, don't read it again
            if (countries != null)
            {
                return countries;
            }

            countries = new ArrayList<>();

            if (File.exists(countriesPath))  // prevent the FileNotFoundException
            {
                try (BufferedReader in = new BufferedReader(new FileReader(countriesFile))) {
                    String line = in.readLine();

                    while (line != null)
                    {

                        if (line.length() == 0)
                        {
                            continue;
                        }

                        String[] columns = line.split(FIELD_SEP);
                        String data line.split("\\|");
                        String firstName = columns[0];
                        String lastName = columns[1];

                        Countries c = new Country(firstName, "\\|", lastName);
                        countries.add(c);

                        line = in.readLine();

                    }

                }
            }
            catch(IOException e)
            {
                System.out.println(e);
                return null;
            }
        }
        return countries;

    }
}


