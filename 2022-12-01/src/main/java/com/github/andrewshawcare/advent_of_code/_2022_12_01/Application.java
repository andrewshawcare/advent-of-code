package com.github.andrewshawcare.advent_of_code._2022_12_01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
        return args -> {
            System.out.println("Bean definitions: \n");
            for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
                System.out.println(beanDefinitionName);
            }
        };
    }
}
