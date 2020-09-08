package com.virgo.springbucks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbucksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbucksApplication.class, args);
    }

}
