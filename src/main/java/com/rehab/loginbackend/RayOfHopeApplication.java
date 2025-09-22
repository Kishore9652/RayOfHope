package com.rehab.loginbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rehab.loginbackend.repository")
@EntityScan(basePackages = "com.rehab.loginbackend.model")
public class RayOfHopeApplication {
    public static void main(String[] args) {
        SpringApplication.run(RayOfHopeApplication.class, args);
    }
}