package com.abstract_interrogator;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class InterrogatorTest {
    @Test
    void shouldThrowIllegalArgumentException() {
        Interrogator interrogator = new Interrogator(new HashSet<>());

        assertThrows(IllegalAccessError.class, () -> interrogator.startInterrogation());
    }
}