package com.andrewshawcare.advent_of_code._2021._1;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.extension.annotations.WithSpan;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        while (true) {
            calculateIncreasingDepthMeasurements(args[0]);
            Thread.sleep(10000L);
        }
    }

    @WithSpan
    public static void calculateIncreasingDepthMeasurements(String pathname) throws IOException {
        Span span = Span.current();
        System.out.println(span.getSpanContext().getTraceId());

        int[] depthMeasurements = DepthMeasurementFileImporter.importFile(pathname);

        int increasingDepthMeasurementsCount = DepthMeasurement.countIncreasingDepthMeasurements(depthMeasurements);
        System.out.println("Increasing depth measurements count: " + increasingDepthMeasurementsCount);

        int increasingDepthMeasurementSlidingWindowsCount = DepthMeasurement.countIncreasingDepthMeasurementSlidingWindows(depthMeasurements, 3);
        System.out.println("Increasing depth measurement sliding windows count: " + increasingDepthMeasurementSlidingWindowsCount);
    }
}
