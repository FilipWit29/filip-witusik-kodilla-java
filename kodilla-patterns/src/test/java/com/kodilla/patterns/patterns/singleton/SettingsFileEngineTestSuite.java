package com.kodilla.patterns.patterns.singleton;

import com.kodilla.patterns.singleton.SettingsFileEngine;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SettingsFileEngineTestSuite {

    private static SettingsFileEngine settingsFileEngine;

    @BeforeAll
    public static void openSettingsFile() {
        settingsFileEngine = SettingsFileEngine.INSTANCE;
        settingsFileEngine.open("myapp.Settings");
    }

    @AfterAll
    public static void closingSettingsFile() {
        settingsFileEngine.close();
    }

    @Test
    void testGetFileName() {
        //Given
        //When
        String filename = settingsFileEngine.getFileName();
        System.out.println("Opened: " + filename);
        //Then
        assertEquals("myapp.Settings", filename);
    }

    @Test
    void testLoadSettings() {
        //Given
        //When
        boolean result = settingsFileEngine.loadSettings();
        //Then
        assertTrue(result);
    }

    @Test
    void testSaveSettings() {
        //Given
        //When
        boolean result = settingsFileEngine.saveSettings();
        //Then
        assertTrue(result);
    }
}
