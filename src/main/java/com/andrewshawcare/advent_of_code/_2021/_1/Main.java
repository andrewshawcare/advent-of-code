package com.andrewshawcare.advent_of_code._2021._1;

import io.opentelemetry.extension.annotations.WithSpan;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException, InterruptedException {
        int[] depthMeasurements = DepthMeasurementFileImporter.importFile(args[0]);

        //noinspection InfiniteLoopStatement
        while (true) {
            countIncreasingDepthMeasurements(depthMeasurements);

            //noinspection BusyWait
            Thread.sleep(10000L);
        }
    }

    @WithSpan
    private static void countIncreasingDepthMeasurements(int[] depthMeasurements) {
        int increasingDepthMeasurementsCount = DepthMeasurement.countIncreasingDepthMeasurements(depthMeasurements);
        logger.info("Increasing depth measurements count: {}", increasingDepthMeasurementsCount);

        int increasingDepthMeasurementSlidingWindowsCount = DepthMeasurement.countIncreasingDepthMeasurementSlidingWindows(depthMeasurements, 3);
        logger.info("Increasing depth measurement sliding windows count: {}", increasingDepthMeasurementSlidingWindowsCount);
    }
}
