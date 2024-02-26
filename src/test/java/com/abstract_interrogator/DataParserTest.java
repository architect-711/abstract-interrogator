package com.abstract_interrogator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DataParserTest {

    @Test
    void shouldFindFile() {
        DataParser dataParser = new DataParser();

        assertDoesNotThrow(dataParser::findFile);
    }

}