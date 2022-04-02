package com.andrewshawcare.advent_of_code._2021._1;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepthMeasurementFileImporterTest {
    @Test
    public void fileImportTest() throws IOException {
        var expectedDepthMeasurements = List.of(
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
        );
        var actualDepthMeasurements = DepthMeasurementFileImporter.importFile("depthMeasurements.txt");

        assertEquals(actualDepthMeasurements, expectedDepthMeasurements);
    }
}
