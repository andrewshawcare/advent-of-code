package com.andrewshawcare.advent_of_code._2021._1;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DepthMeasurementFileImporterTest {
    @Test
    public void fileImportTest() throws IOException {
        int[] expectedDepthMeasurements = new int[] {
            199,
            200,
            208,
            210,
            200,
            207,
            240,
            269,
            260,
            263
        };
        int[] actualDepthMeasurements = DepthMeasurementFileImporter.importFile("depthMeasurements.txt");

        assertArrayEquals(actualDepthMeasurements, expectedDepthMeasurements);
    }
}
