package com.abstract_interrogator;

import java.util.Arrays;

public class AbstractInterrogator {
    public static void start(String[] args) {
        try {
            DataParser dataParser = new DataParser(args[0]);

            dataParser.findFile();
            dataParser.parseData();

            Interrogator interrogator = new Interrogator(dataParser.getParsedData());

            interrogator.startInterrogation();
        } catch (Exception exception) {
            printException(exception);
        }
    }

    private static void printException(Exception exception) {
        System.out.println(
                "Exception: " + exception.getClass() + "\n" +
                "Message: " + exception.getMessage() + "\n" +
                "Because: " + exception.getCause() + "\n" +
                "StackTrace: "
        );
        printStackTrace(exception.getStackTrace());
    }

    private static void printStackTrace(StackTraceElement[] stackTraceElements) {
        Arrays.stream(stackTraceElements).forEach(element -> System.out.println("    " + element + "\n"));
    }
}
