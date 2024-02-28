package com.abstract_interrogator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DataParserTest {

    @Test
    void shouldFindFile() {
        // change path to yours to test
        DataParser dataParser = new DataParser("/home/dmitrii/Desktop/target.txt");

        assertDoesNotThrow(dataParser::findFile);
    }

}