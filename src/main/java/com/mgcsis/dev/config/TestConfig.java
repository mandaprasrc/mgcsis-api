package com.mgcsis.dev.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mgcsis.dev.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    DBService dbService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddl;

    @Bean
    public Boolean instanciaDB() {

        if (ddl.equals("create")) {
            dbService.instanciaDB();
        }
        return false; 
    }
}
