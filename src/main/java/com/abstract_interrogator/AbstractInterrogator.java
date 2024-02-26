package com.abstract_interrogator;

public class AbstractInterrogator {
    public static void start() {
        try {
            DataParser dataParser = new DataParser();

            dataParser.findFile();
            dataParser.parseData();
            System.out.println(dataParser.getParsedData());
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
