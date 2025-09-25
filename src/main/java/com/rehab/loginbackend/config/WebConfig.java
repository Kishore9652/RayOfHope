package com.rehab.loginbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Paths;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Allow CORS for /upload-image endpoint
                registry.addMapping("/upload-image")
                        .allowedOrigins(
                            "http://127.0.0.1:5500",
                            "http://localhost:5500",
                            "https://thunderous-druid-5bed49.netlify.app"
                        )
                        .allowedMethods("POST")
                        .allowedHeaders("*");

                // Allow CORS for all API endpoints
                registry.addMapping("/api/**")
                        .allowedOrigins(
                            "http://127.0.0.1:5500",
                            "http://localhost:5500",
                            "https://thunderous-druid-5bed49.netlify.app"
                        )
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*");
            }

            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                String uploadPath = Paths.get("uploads").toAbsolutePath().toUri().toString();
                registry.addResourceHandler("/uploads/**")
                        .addResourceLocations(uploadPath);
            }
        };
    }
}
