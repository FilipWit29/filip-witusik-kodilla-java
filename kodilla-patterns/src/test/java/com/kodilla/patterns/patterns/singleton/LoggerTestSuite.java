package com.kodilla.patterns.patterns.singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        // Given
        Logger logger = Logger.INSTANCE;
        String expectedLog = "Test Log Entry";
        // When
        logger.log(expectedLog);
        String lastLog = logger.getLastLog();
        // Then
        assertEquals(expectedLog, lastLog);
    }
}
