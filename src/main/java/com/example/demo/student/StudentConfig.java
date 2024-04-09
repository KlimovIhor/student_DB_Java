package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration

public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Ivan = new Student(
                    1L,
                    "Ivan",
                    "google123@gmai.com",
                    LocalDate.of(3000, Month.JULY, 5),
                    21

                    );

            Student Ihor = new Student(
                    2L,
                    "Ihor",
                    "google@gmai.com",
                    LocalDate.of(2000, Month.JULY, 7),
                    22

                    );
            repository.saveAll(
                    List.of(Ihor)
            );

        };
    }
}
