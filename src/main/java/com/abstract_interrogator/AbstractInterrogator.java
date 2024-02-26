package com.abstract_interrogator;

public class AbstractInterrogator {
    public static void start() {
        try {
            DataParser dataParser = new DataParser();

            dataParser.findFile();
            dataParser.parseData();

            Interrogator interrogator = new Interrogator(dataParser.getParsedData());

            interrogator.startInterrogation();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
