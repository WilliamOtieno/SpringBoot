package com.williamotieno.springboottutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student william = new Student("William Jimmy",  LocalDate.of(1999, Month.JULY, 11), "jimmywilliamotieno@gmail.com");
            Student caren = new Student("Caren Agala",  LocalDate.of(2000, Month.FEBRUARY, 13), "carenagala324@gmail.com");
            Student talian = new Student("Talian Shiumbe",  LocalDate.of(2003, Month.JULY, 10), "carenagala324@gmail.com");

            repository.saveAll(
                    List.of(william, caren, talian)
            );
        };
    }
}
