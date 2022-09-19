package com.mgcsis.dev.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mgcsis.dev.services.DBService;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    DBService dbService;

    @Bean
    public void instanciaDB() {

        dbService.instanciaDB();
    }
}
