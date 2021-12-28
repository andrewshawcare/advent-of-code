package com.andrewshawcare.advent_of_code._2021._1;

import io.opentelemetry.extension.annotations.WithSpan;

import java.io.*;
import java.util.Objects;

public class DepthMeasurementFileImporter {
    @WithSpan
    public static int[] importFile(String pathname) throws IOException {
        InputStream fileStream = DepthMeasurementFileImporter.class.getClassLoader().getResourceAsStream(pathname);
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(fileStream)))) {
            return bufferedReader.lines().mapToInt(Integer::parseInt).toArray();
        }
    }
}
