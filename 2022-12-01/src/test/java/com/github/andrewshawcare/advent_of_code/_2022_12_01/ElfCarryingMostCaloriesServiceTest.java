package com.github.andrewshawcare.advent_of_code._2022_12_01;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElfCarryingMostCaloriesServiceTest {
    private final ElfCarryingMostCaloriesService elfCarryingMostCaloriesService = new ElfCarryingMostCaloriesService();

    @Test
    public void shouldProvideCaloriesCarriedByElfCarryingMostCalories() throws IOException {
        final List<String> elfCalorieEntryList = Files.readAllLines(
            Paths.get("src/test/resources/actual_elf_calorie_list.txt")
        );

        int caloriesCarriedByElfCarryingMostCalories = elfCarryingMostCaloriesService.getCaloriesCarriedByElfCarryingMostCalories(elfCalorieEntryList);

        assertEquals(67027, caloriesCarriedByElfCarryingMostCalories);
    }

}
