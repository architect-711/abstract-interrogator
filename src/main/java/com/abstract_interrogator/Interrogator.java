package com.abstract_interrogator;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Interrogator {
    private final List<String> targetData;

    public Interrogator(final HashSet<String> parsedData) {
        this.targetData = parsedData.stream().toList();
    }

    public void startInterrogation() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(targetData.get(getRandomNumber()));

            if (scanner.nextLine() == null) {
                break;
            }
        }
    }

    private int getRandomNumber() {
        return (int) (Math.random() * targetData.size() + 1);
    }
}
