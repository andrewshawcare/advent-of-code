package com.github.andrewshawcare.advent_of_code._2022_12_01;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElfCarryingMostCaloriesService {
    public int getCaloriesCarriedByElfCarryingMostCalories(List<String> elfCalorieEntryList) {
        int caloriesCarriedByElfCarryingMostCalories = 0;
        int caloriesCarriedByCurrentElf = 0;

        for (String elfCalorieEntry : elfCalorieEntryList) {
            if (elfCalorieEntry.isBlank()) {
                caloriesCarriedByCurrentElf = 0;
                continue;
            }

            caloriesCarriedByCurrentElf += Integer.parseInt(elfCalorieEntry);

            if (caloriesCarriedByCurrentElf > caloriesCarriedByElfCarryingMostCalories) {
                caloriesCarriedByElfCarryingMostCalories = caloriesCarriedByCurrentElf;
            }
        }

        return caloriesCarriedByElfCarryingMostCalories;
    }
}
