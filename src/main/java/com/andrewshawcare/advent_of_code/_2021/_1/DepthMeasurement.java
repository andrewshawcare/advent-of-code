package com.andrewshawcare.advent_of_code._2021._1;

import io.opentelemetry.extension.annotations.WithSpan;

import java.util.ArrayList;
import java.util.List;

public class DepthMeasurement {

    @WithSpan
    public static int countIncreasingDepthMeasurements(List<Integer> depthMeasurements) {
        int count = 0;

        for (int index = 0; index < depthMeasurements.size(); index++) {
            if (index + 1 == depthMeasurements.size()) {
                break;
            }

            var currentDepthMeasurement = depthMeasurements.get(index);
            var nextDepthMeasurement = depthMeasurements.get(index + 1);
            if (currentDepthMeasurement < nextDepthMeasurement) {
                count++;
            }
        }

        return count;
    }

    @WithSpan
    public static int countIncreasingDepthMeasurementSlidingWindows(List<Integer> depthMeasurements, int windowSize) {
        int count = 0;

        List<Integer> windowSums = new ArrayList<>();
        for (int fromIndex = 0; fromIndex < depthMeasurements.size(); fromIndex++) {
            int toIndex = fromIndex + windowSize;

            if (toIndex > depthMeasurements.size()) {
                break;
            }

            var window = depthMeasurements.subList(fromIndex, toIndex);
            windowSums.add(window.stream().mapToInt(Integer::valueOf).sum());

            if (windowSums.size() < 2) {
                continue;
            }

            int lastWindowSum = windowSums.get(windowSums.size() - 2);
            int currentWindowSum = windowSums.get(windowSums.size() - 1);
            if (lastWindowSum < currentWindowSum) {
                count++;
            }
        }

        return count;
    }
}
