package com.andrewshawcare.advent_of_code._2021._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthMeasurement {
    public static int countIncreasingDepthMeasurements(int[] depthMeasurements) {
        if (depthMeasurements.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < depthMeasurements.length; i++) {
            if (i + 1 == depthMeasurements.length) {
                break;
            }

            if (depthMeasurements[i] < depthMeasurements[i + 1]) {
                count++;
            }
        }

        return count;
    }

    public static int countIncreasingDepthMeasurementSlidingWindows(int[] depthMeasurements, int windowSize) {
        int count = 0;

        List<Integer> depthMeasurementsList = Arrays.stream(depthMeasurements).boxed().toList();

        List<Integer> windowSums = new ArrayList<>();
        for (int fromIndex = 0; fromIndex < depthMeasurementsList.size(); fromIndex++) {
            int toIndex = fromIndex + windowSize;
            if (toIndex > depthMeasurementsList.size()) {
                break;
            }
            windowSums.add(depthMeasurementsList.subList(fromIndex, toIndex).stream().mapToInt(Integer::valueOf).sum());

            if (
                windowSums.size() > 1 &&
                windowSums.get(windowSums.size() - 2) < windowSums.get(windowSums.size() - 1)
            ) {
                count++;
            }
        }

        return count;
    }
}
