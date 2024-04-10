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
                    "Ivan",
                    "google123@gmai.com",
                    LocalDate.of(1000, Month.JULY, 5)


                    );

            Student Ihor = new Student(
                    "Ihor",
                    "google@gmai.com",
                    LocalDate.of(2000, Month.JULY, 7)


                    );
            repository.saveAll(
                    List.of(Ihor,Ivan)
            );

        };
    }
}
