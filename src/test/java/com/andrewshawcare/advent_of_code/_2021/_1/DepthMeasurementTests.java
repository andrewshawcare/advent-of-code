package com.andrewshawcare.advent_of_code._2021._1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepthMeasurementTests {
    @Test
    public void countIncreasingDepthMeasurementsTest() {
        int[] depthMeasurements = new int[] {
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

        assertEquals(7, DepthMeasurement.countIncreasingDepthMeasurements(depthMeasurements));
    }
}