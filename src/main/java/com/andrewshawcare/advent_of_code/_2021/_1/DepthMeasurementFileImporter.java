package com.andrewshawcare.advent_of_code._2021._1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class DepthMeasurementFileImporter {
    public static int[] importFile(String pathname) throws IOException {
        URL resourceUrl = DepthMeasurementFileImporter.class.getClassLoader().getResource(pathname);
        String fileName = Objects.requireNonNull(resourceUrl).getFile();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            return bufferedReader.lines().mapToInt(Integer::parseInt).toArray();
        }
    }
}
