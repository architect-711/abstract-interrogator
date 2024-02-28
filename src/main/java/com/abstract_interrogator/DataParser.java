package com.abstract_interrogator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class DataParser {
    private final String PATH_TO_FILE;
    private BufferedReader bufferedReader;
    private HashSet<String> parsedData;

    public DataParser(final String PATH_TO_FILE) {
        this.PATH_TO_FILE = PATH_TO_FILE;
    }

    public void findFile() throws FileNotFoundException {
        bufferedReader = new BufferedReader(new FileReader(PATH_TO_FILE));
    }

    public void parseData() throws IOException {
        parsedData = new HashSet<>();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.startsWith("#")) {
                continue;
            }
            parsedData.add(line.trim());
        }
    }

    public HashSet<String> getParsedData() {
        return parsedData;
    }
}
