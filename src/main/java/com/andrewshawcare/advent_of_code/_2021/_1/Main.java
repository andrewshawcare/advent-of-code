package com.andrewshawcare.advent_of_code._2021._1;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        var depthMeasurements = DepthMeasurementFileImporter.importFile(args[0]);

        //noinspection InfiniteLoopStatement
        while (true) {
            countIncreasingDepthMeasurements(depthMeasurements);

            //noinspection BusyWait
            Thread.sleep(10000L);
        }
    }

    private static void countIncreasingDepthMeasurements(List<Integer> depthMeasurements) {
        DepthMeasurement.countIncreasingDepthMeasurements(depthMeasurements);
        DepthMeasurement.countIncreasingDepthMeasurementSlidingWindows(depthMeasurements, 3);
    }
}
