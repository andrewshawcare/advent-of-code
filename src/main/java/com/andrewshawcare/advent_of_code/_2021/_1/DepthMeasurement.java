package com.andrewshawcare.advent_of_code._2021._1;

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
}
