package com.andrewshawcare.advent_of_code._2021._1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathname = args[0];
        int[] depthMeasurements = DepthMeasurementFileImporter.importFile(pathname);

        int increasingDepthMeasurementsCount = DepthMeasurement.countIncreasingDepthMeasurements(depthMeasurements);
        System.out.println("Increasing depth measurements count: " + increasingDepthMeasurementsCount);

        int increasingDepthMeasurementSlidingWindowsCount = DepthMeasurement.countIncreasingDepthMeasurementSlidingWindows(depthMeasurements, 3);
        System.out.println("Increasing depth measurement sliding windows count: " + increasingDepthMeasurementSlidingWindowsCount);
    }
}
