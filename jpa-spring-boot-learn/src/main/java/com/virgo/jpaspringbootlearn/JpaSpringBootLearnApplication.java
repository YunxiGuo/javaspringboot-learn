package com.virgo.jpaspringbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JpaSpringBootLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaSpringBootLearnApplication.class, args);
    }

}
